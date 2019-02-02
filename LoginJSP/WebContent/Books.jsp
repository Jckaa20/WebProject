<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Main Page</title>
<link rel="stylesheet" href="style.css" />

</head>
<body bgcolor=#fff>
	<ul class="ul">
		<li><a href="Login.jsp"> Login </a></li>
		<li><a href="Welcome.jsp"> Welcome </a></li>
		<li><a href="Aboutus.jsp">About us</a></li>
		<li><a href="Books.jsp">Books</a></li>
		<li><input type="search" placeholder="enter to search"
			name="search" id="search"></li>
	</ul>
	<ul class="nav">
		<li><a href="Logout">Logout</a></li>
		<li><a href="ViewIssuedBook">Issued Book</a></li>
		<li><a href="ViewReturnedBook">Returned Book</a></li>
	</ul>

	<%
	
		response.setHeader("Cache-Control", "no-cache , no-store , must-revalidate");
	
		if(session.getAttribute("username")==null){
			response.sendRedirect("Login.jsp");
		}
		
	%>
	<script type="text/javascript" src="validate.js"></script>
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
		<div class="issue">
			<h4>Issue Book</h4>
			<form action="IssueBook" method="post"
				onsubmit="return booksValidate()">
				Student Name:<br> <input type="text" name="sname" id="sname"><br>
				Student Id:<br> <input type="text" name="sid" id="sid"><br>
				Book Name:<br> <input type="text" name="bname" id="bname"><br>
				Book Author:<br> <input type="text" name="bauthor" id="bauthor"><br>
				Book Id:<br> <input type="number" name="bid" id="bid"><br>
				<input type="submit" value="Issue" onclick="booksValidate()">
			</form>
		</div>
		<div class="return">
			<h4>Return Book</h4>
			<form action="ReturnBook" method="post"
				onsubmit="return booksValidate1()">
				Student Name:<br> <input type="text" name="sname" id="sname"><br>
				Student Id:<br> <input type="text" name="sid" id="sid"><br>
				Book Name:<br> <input type="text" name="bname" id="bname"><br>
				Book Author:<br> <input type="text" name="bauthor" id="bauthor"><br>
				Book Id:<br> <input type="number" name="bid" id="bid"><br>
				<input type="submit" value="Return" onclick="booksValidate1()">
			</form>
		</div>
	</div>
</body>
</html>
