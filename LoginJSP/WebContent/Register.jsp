<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register page</title>
<link rel="stylesheet" href="style.css" />
</head>
<body>
	<script type="text/javascript" src="validate.js"></script>
	<div id="register">
		<h4>Register</h4>
	</div>
	<br>
	<div class="wrapper">
		<div class="login1">
			<form action="Register" method="post" onsubmit="return onvalidate()">
				Username:<br> <input type="text" name="uname" id="uname"><br>
				Password:<br> <input type="password" name="pass" id="pass"><br>
				Confirm Password:<br> <input type="password" name="cpass"
					id="cpass"><br> Email:<br> <input type="email"
					name="email" id="email"><br> Contact:<br> <input
					type="number" name="contact" id="contact"><br> <input
					type="submit" value="Register" onclick="onvalidate()">
			</form>
		</div>
	</div>
</body>
</html>