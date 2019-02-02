package com.jesika.register;

public class Register1 {
	
	private int id;
	private String uname;
	private String pass;
	private String cpass;
	private String email;
	private long contact;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getCpass() {
		return cpass;
	}
	public void setCpass(String cpass) {
		this.cpass = cpass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Register1 [id=" + id + ", uname=" + uname + ", pass=" + pass + ", cpass=" + cpass + ", email=" + email
				+ ", contact=" + contact + "]";
	}
	
	

}
