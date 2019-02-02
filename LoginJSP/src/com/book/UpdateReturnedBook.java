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

@WebServlet("/UpdateReturnedBook")
public class UpdateReturnedBook extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int id =Integer.parseInt(request.getParameter("id"));
		String bname = request.getParameter("bname");
		String bauthor = request.getParameter("bauthor");
		int bid = Integer.parseInt(request.getParameter("bid"));
		String sname = request.getParameter("sname");
		int sid = Integer.parseInt(request.getParameter("sid"));
		
		LoginDao dao = new LoginDao();
		Issue b = new Issue();
		b.setId(id);
		b.setBname(bname);
		b.setBauthor(bauthor);
		b.setBid(bid);
		b.setSname(sname);
		b.setSid(sid);
		try {
			int rs = dao.UpdateReturnedBook(b);
			if (rs>0) {
				response.sendRedirect("ViewReturnedBook");
			}
			else {
				out.println("Error Updating");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
