<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome page</title>
<link rel="stylesheet" href="style.css" />
</head>
<body>
	<ul class="ul">
		<li><a href="Login.jsp"> Login </a></li>
		<li><a href="Welcome.jsp"> Welcome </a></li>
		<li><a href="Aboutus.jsp">About us</a></li>
		<li><a href="Books.jsp">Books</a>
		<li><input type="search" placeholder="enter to search"
			name="search" id="search"></li>
	</ul>

	<%
	
		response.setHeader("Cache-Control", "no-cache , no-store , must-revalidate");	
	
		if(session.getAttribute("username")==null){
			response.sendRedirect("Login.jsp");
		}
		
	%>

	<div class="contact">
		<a href="https://www.facebook.com/"> <img src="img/fbicon.ico"
			alt="" width="100%" height="100%">
		</a> <a href="https://www.twitter.com/"> <img src="img/twitter.png"
			alt="" width="100%" height="100%">
		</a> <a href="https://www.youtube.com/"> <img src="img/youTube.jpg"
			alt="" width="100%" height="100%">
		</a>
	</div>
	<div class="welcome">
		WELCOME TO ELIBRARY<br> <b>${username}</b><br> <a
			href="Books.jsp">Go to main page</a><br>
	</div>


</body>
</html>