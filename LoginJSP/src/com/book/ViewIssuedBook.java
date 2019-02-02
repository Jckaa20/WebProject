package com.book;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jesika.LoginDao;


@WebServlet("/ViewIssuedBook")
public class ViewIssuedBook extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<h1>Issued Books</h1>");
		//Issue b = new Issue();
		LoginDao dao = new LoginDao();
				List<Issue> list;
				try {
					list = dao.viewIssuedBook();
					//response.sendRedirect("BookIssued.jsp");
					out.println("<table border='1'width='75%'>");
					out.println("<tr><th>ID</th><th>Student Name</th><th>Student Id</th><th>Book Name</th><th>Book Author</th><th>Book Id</th><th>Update</th><th>Delete</th></tr>");
					
					for(Issue b:list) {
						out.println("<tr><td>"+b.getId()+"</td><td>"+b.getSname()+"</td><td>"+b.getSid()+"</td><td>"+b.getBname()+"</td>"
								+ "<td>"+b.getBauthor()+"</td><td>"+b.getBid()+
								"</td><td><a href='UpdateIssuedBook.jsp?id="+b.getId()+"'>Edit</a></td>"
										+ "<td><a href='DeleteIssuedBook?id="+b.getId()+"'>Delete</a></td></tr>");
					}
					out.println("</table>");
					out.println("<br><a href='Books.jsp'><input type='button' value='Return to Books'></a>");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

}
