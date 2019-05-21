<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inserisci nuovo album</title>
</head>
<body>
	<form action="albumController" method="get">
		Nome album: <input type="text" name="nome"><br>
		${voidName}<br>
		<input type="submit" value="conferma">
	</form>
		<input type="button" onclick="location.href='/homeAdmin.jsp'" value="indietro">
</body>
</html>