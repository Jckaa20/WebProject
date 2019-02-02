<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.book.Issue,com.jesika.LoginDao"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%	
	int id = Integer.parseInt(request.getParameter("id"));
	Issue b = new Issue();
	LoginDao dao = new LoginDao();
	b = dao.getElementById1(id);
%>
	<script type="text/javascript" src="validate.js"></script>
	<h4>Update Books</h4>
	<form action="UpdateReturnedBook" method="post"
		onsubmit="booksValidate">
		<input type="hidden" name="id" value="<%=b.getId()%>" id="id">
		ID:<br> <input type="text" name="bid" value="<%=b.getBid() %>"
			id="bid"><br>
		<br> Student Name:<br> <input type="text" name="sname"
			value="<%=b.getSname() %>" id="sname"><br>
		<br> Student Id:<br> <input type="text" name="sid"
			value="<%=b.getSid() %>" id="sid"><br>
		<br> Book Name:<br> <input type="text" name="bname"
			value="<%=b.getBname() %>" id="bname"><br>
		<br> Book Author:<br> <input type="text" name="bauthor"
			value="<%=b.getBauthor() %>" id="bauthor"><br>
		<br> <input type="submit" value="Edit & Save"
			onclick="booksValidate"> <a href="ViewReturnedBook"><input
			type="button" value="Cancel"></a>

	</form>

</body>
</html>