<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import = "it.silph.*"%>
<%@page import = "it.silph.pg.Dialoguer" %>
<% String s = request.getParameter("f");
 	request.setAttribute("f", s);
 	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> ${f} </title>
</head>
<body>
	${f}<br>
	<input type="button" onclick="location.href='/newAlbum.jsp'" value="aggiungi album"><br>
	<input type="button" onclick="location.href='/mostraAlbum.jsp'" value="mostra album">
	<input type="button" onclick="location.href='/mostraFotografi.jsp'" value="indietro">
</body>
</html>