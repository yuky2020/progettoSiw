package it.siplh.controller;

import java.io.IOException;

import javax.persistence.RollbackException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.silph.Fotografo;
import it.silph.pg.Dialoguer;

@WebServlet("/fotografoController")
public class FotografoController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("nome");
		String nextPage;
		if(isValid(req)) {
			Fotografo f = new Fotografo(username);
			try {
				Dialoguer.carica(f);
				nextPage = "/homeAdmin.jsp";
			} catch (RollbackException re) {
				nextPage="/newFotografo.jsp";
			}
		}else {
			nextPage = "/newFotografo.jsp";
		}
		ServletContext sc = getServletContext();
		RequestDispatcher rd = sc.getRequestDispatcher(nextPage);
		rd.forward(req, resp);
		return;
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
	private boolean isValid(HttpServletRequest req){
		String nome = req.getParameter("nome");
		boolean err1 = nome.equals("");
		boolean err2 = Dialoguer.getUsernameInUso().contains(nome);
		if(err1) req.setAttribute("voidName", "*Campo obbligatorio");
		if(err2) req.setAttribute("duplicatedName", "*Username già in uso");
		return !(err1 || err2);
	}
}
