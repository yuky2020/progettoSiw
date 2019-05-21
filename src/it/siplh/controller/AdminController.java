package it.siplh.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.silph.Admin;

@WebServlet("/adminController")
public class AdminController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String pwd = req.getParameter("pwd");
		Admin admin = new Admin("Paolo","1234");
		String destinazione;
		if(admin.checkPwd(pwd)) {
			destinazione = "/homeAdmin.jsp";
		}else {
			destinazione = "/login.jsp";
		}
		ServletContext sc = getServletContext();
		RequestDispatcher rd = sc.getRequestDispatcher(destinazione);
		rd.forward(req, resp);
		return;
	}
}
