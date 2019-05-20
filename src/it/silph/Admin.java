package it.silph;

public class Admin {
	private String username;
	private String pwd;
	
	
	public Admin(String username, String pwd) {
		this.username = username;
		this.pwd = pwd;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public boolean checkPwd(String pwd) {
		return this.pwd.equals(pwd);
	}
	
}
