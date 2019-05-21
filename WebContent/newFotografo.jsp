<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="CSS/style.css" rel="stylesheet" type="text/css">
<meta charset="UTF-8">
<title>Registrazione</title>
</head>
<body>
	<form class="myForm" action="/utenteController">
	<p>
		Username:        <input type="text" name="username" placeholder="Username"><br> 
	</p>
	<p>	
		Email:           <input type="text" name="email" placeholder="Email"><br>
	</p>
	<p>	
		Password:        <input type="password" name="password" placeholder="password"><br>
	</p>
	<p>	
		Ripeti password: <input type="password" name="password2" placeholder="password"><br>
	</p>
	<p>
		<input type="submit" value="Invia">
	</p>
	</form>
</body>
</html>