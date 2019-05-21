<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
    <%@page import="it.silph.pg.Dialoguer" %>
    <%@page import="it.silph.Fotografo" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	List<Fotografo> fotografi = (List) Dialoguer.getFotografi();
	request.setAttribute("fotografi", fotografi);
%>
	<c:forEach var="f" items="${fotografi}">
 		<a href="paginaFotografo.jsp?f=${f.username}" >  ${f.username} </a> <br>
	</c:forEach>
	<input type="button" onclick="location.href='/homeAdmin.jsp'" value="indietro">
</body>
</html>