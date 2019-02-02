package com.jesika;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.book.Issue;
import com.jesika.register.Register1;

public class LoginDao {
	static String url = "jdbc:mysql://localhost:3306/login";
	static String user = "root";
	static String password = "Poudel:)";
	
	public boolean check(String sname, String pass) {
		
		String sql = "select * from datadetail where sname=? and pass=?";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, sname);
			st.setString(2, pass);
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				return true;
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public int insertdata(Register1 r) {
		
		String sql="insert into datadetail (sname,pass,cpass,email,contact) values (?,?,?,?,?)";
		int rs=0;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement st = con.prepareStatement(sql);
		
			st.setString(1, r.getUname());
			st.setString(2, r.getPass());
			st.setString(3, r.getCpass());
			st.setString(4, r.getEmail());
			st.setLong(5, r.getContact());
			rs = st.executeUpdate();
			System.out.println(rs);
			//st.close();
			
			//return rs;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
		
		
	}
	public int addbook(Issue b) throws SQLException {
		String sql="insert into issuebook (bname,bauthor,bid,sname,sid) values (?,?,?,?,?)";
		int rs=0;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, b.getBname());
			st.setString(2, b.getBauthor());
			st.setInt(3, b.getBid());
			st.setString(4, b.getSname());
			st.setInt(5, b.getSid());
			rs=st.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(rs);
		return rs;
	}
	public List<Issue> viewIssuedBook() throws SQLException {
		List<Issue> list = new ArrayList<Issue>();
		String sql="select * from issuebook";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				Issue b = new Issue();
				b.setId(rs.getInt(1));
				b.setBname(rs.getString(2));
				b.setBauthor(rs.getString(3));
				b.setBid(rs.getInt(4));
				b.setSname(rs.getString(5));
				b.setSid(rs.getInt(6));
				list.add(b);
			}
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	public int addbook1(Issue b) throws SQLException {
		String sql="insert into returnbook (bname,bauthor,bid,sname,sid) values (?,?,?,?,?)";
		int rs=0;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, b.getBname());
			st.setString(2, b.getBauthor());
			st.setInt(3, b.getBid());
			st.setString(4, b.getSname());
			st.setInt(5, b.getSid());
			rs=st.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	public List<Issue> viewReturnedBook() throws SQLException {
		List<Issue> list = new ArrayList<Issue>();
		String sql="select * from returnbook";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				Issue b = new Issue();
				b.setId(rs.getInt(1));
				b.setBname(rs.getString(2));
				b.setBauthor(rs.getString(3));
				b.setBid(rs.getInt(4));
				b.setSname(rs.getString(5));
				b.setSid(rs.getInt(6));
				list.add(b);
			}
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	public static int DeleteIssuedBook(int id) throws SQLException {
		int d=0;
		String sql="delete from issuebook where id=?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, id);
			d = st.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return d;
	}
	public static int DeleteReturnedBook(int id) throws SQLException {
		int d=0;
		String sql="delete from returnbook where id=?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, id);
			d = st.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return d;
	}
	public int UpdateIssuedBook(Issue b) throws SQLException {
		int d=0;
		String sql="update issuebook set bname=?, bauthor=?, bid=? sname=?,sid=? where id=? ";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, b.getBname());
			st.setString(2, b.getBauthor());
			st.setInt(3, b.getBid());
			st.setString(4, b.getSname());
			st.setInt(5, b.getSid());
			st.setInt(6, b.getId());
			d = st.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return d;
	}
	
		public int UpdateReturnedBook(Issue b) throws SQLException {
			int d=0;
			String sql="update returnbook set bname=?, bauthor=?, bid=?, sname=?,sid=? where id=?";
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, user, password);
				PreparedStatement st = con.prepareStatement(sql);
				st.setString(1, b.getBname());
				st.setString(2, b.getBauthor());
				st.setInt(3, b.getBid());
				st.setString(4, b.getSname());
				st.setInt(5, b.getSid());
				st.setInt(6, b.getId());
				d = st.executeUpdate();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return d;
		
	}
	public Issue getElementById(int id) throws SQLException {
		Issue b=new Issue();
		String sql="select * from issuebook where id=?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, user, password);
			PreparedStatement st=con.prepareStatement(sql);
			st.setInt(1, id);
			ResultSet rs=st.executeQuery();
			if (rs.next()) {
				b.setId(rs.getInt(1));
				b.setBname(rs.getString(2));
				b.setBauthor(rs.getString(3));
				b.setBid(rs.getInt(4));
				b.setSname(rs.getString(5));
				b.setSid(rs.getInt(6));
			}
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}
	
	public Issue getElementById1(int id) throws SQLException {
		Issue b=new Issue();
		String sql="select * from returnbook where id=?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, user, password);
			PreparedStatement st=con.prepareStatement(sql);
			st.setInt(1, id);
			ResultSet rs=st.executeQuery();
			if (rs.next()) {
				b.setId(rs.getInt(1));
				b.setBname(rs.getString(2));
				b.setBauthor(rs.getString(3));
				b.setBid(rs.getInt(4));
				b.setSname(rs.getString(5));
				b.setSid(rs.getInt(6));
			}
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}
	
}

