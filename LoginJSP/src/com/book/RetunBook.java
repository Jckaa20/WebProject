package com.book;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jesika.LoginDao;


@WebServlet("/ReturnBook")
public class RetunBook extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String bname= request.getParameter("bname");
		String bauthor = request.getParameter("bauthor");
		int bid = Integer.parseInt(request.getParameter("bid"));
		String sname = request.getParameter("sname");
		int sid = Integer.parseInt(request.getParameter("sid"));
		
		Issue b = new Issue();
		b.setBname(bname);
		b.setBauthor(bauthor);
		b.setBid(bid);
		b.setSname(sname);
		b.setSid(sid);
				
		LoginDao dao = new LoginDao();
		int rs = 0;
		
			try {
				rs = dao.addbook1(b);
				if(rs>0) {
					out.println("<p>Book Return Successful!</p>");
					response.sendRedirect("Books.jsp");
				}
				else {
					out.println("Error occured!");
					response.sendRedirect("Books.jsp");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
	}

}
