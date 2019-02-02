package com.book;

public class Issue {
	private int id;
	private String bname;
	private String bauthor;
	private int bid;
	private String sname;
	private int sid;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBauthor() {
		return bauthor;
	}
	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	@Override
	public String toString() {
		return "Issue [id=" + id + ", bname=" + bname + ", bauthor=" + bauthor + ", bid=" + bid + ", sname=" + sname
				+ ", sid=" + sid + "]";
	}
}
