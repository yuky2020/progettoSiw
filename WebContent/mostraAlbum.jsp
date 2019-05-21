<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="it.silph.pg.Dialoguer, it.silph.*, java.util.List"; %>"
<!DOCTYPE html>
<% 
	String username = request.getParameter("f");
	List<Album> albums = Dialoguer.retrieveAlbumByNomeAutore(username);
%>
<html>
<head>
<meta charset="UTF-8">
<title>${f}</title>
</head>
<body>

</body>
</html>