package com.jesika.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jesika.LoginDao;


@WebServlet("/Register")
public class Register extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		String cpass = request.getParameter("cpass");
		String email = request.getParameter("email");
		long contact = Long.parseLong(request.getParameter("contact"));
		
		Register1 j = new Register1();
		j.setUname(uname);
		j.setPass(pass);
		j.setCpass(cpass);
		j.setEmail(email);
		j.setContact(contact);
		
		LoginDao dao = new LoginDao();
		int rs = 0 ;
		rs = dao.insertdata(j);
		
		if(rs>0) {
			out.println("Registered Successfully");
			response.sendRedirect("Login.jsp");
		}
		else {
			out.println("<p>Register unsuccesful</p>");
			RequestDispatcher rd = request.getRequestDispatcher("Register.jsp");
			rd.forward(request, response);
			//out.println("<a href="Register.jsp">Register</a>");
					//response.sendRedirect("Register.jsp");
		}
	
	}

}
