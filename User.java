package Assignmentss;

public class User {

	private String fname;
	private String lname;
	private String uname;
	private String pword;
	
	public User() {
	
	}

	public User(String fname, String lname, String uname, String pword) {
	
		this.fname = fname;
		this.lname = lname;
		this.uname = uname;
		this.pword = pword;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPword() {
		return pword;
	}

	public void setPword(String pword) {
		this.pword = pword;
	}
	
	public void msg() {
		
	System.out.println(fname+" "+lname+" "+uname+" "+pword);
	
	
	}
	
	
	}
