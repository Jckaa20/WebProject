<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet" href="style.css" />
</head>
<body bgcolor=#fff>
	<script src="validate.js" type="text/javascript"></script>
	<ul class="ul">
		<li><a href="Login.jsp"> Login </a></li>
		<li><a href="Welcome.jsp"> Welcome </a></li>
		<li><a href="Aboutus.jsp">About us</a></li>
		<li><a href="Books.jsp">Books</a></li>
		<li>Search <input type="search" placeholder="enter to search"
			name="search" id="search"></li>
	</ul>
	<div class="wrapper">
		<div class="contact">
			<a href="https://www.facebook.com/"> <img src="img/fbicon.ico"
				alt="" width="100%" height="100%">
			</a> <a href="https://www.twitter.com/"> <img src="img/twitter.png"
				alt="" width="100%" height="100%">
			</a> <a href="https://www.youtube.com/"> <img src="img/youTube.jpg"
				alt="" width="100%" height="100%">
			</a>
		</div>

		<div class="login">
			<form name="form" action="Login" method="post"
				onsubmit="return loginvalidate()">
				<br> Username :<br> <input type="text" name="uname"
					id="uname" placeholder="Enter your full name"><br>
				Password :<br> <input type="password" name="pass" id="pass"
					placeholder="Enter your password"><br> <input
					type="submit" value="Login" name="Login" onclick="loginvalidate()">
				<a href="Register.jsp">Signup</a>

			</form>
		</div>
	</div>
</body>
</html>