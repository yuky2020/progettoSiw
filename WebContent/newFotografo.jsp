<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Inserisci nuovo fotografo</title>
</head>
<body>
	<form action="fotografoController" method="get">
			Username: <input type="text" name="nome" placeholder="username">
			<br>${voidName} ${duplicatedName}<br>
			<input type="submit" name="" value="conferma"><br>
	</form>
	<input type="button" onclick="location.href='homeAdmin.jsp'" value="indietro">
</body>
</html>