package com.evergent.corejava.casestudy_library;

public class LoginDetails {
private  String username;
private  String password;
public LoginDetails(String username,String password){
	if(verfiyUserName(username)==true&&verifyPassword(password)==true) {
		this.username=username;
		this.password=password;
		System.out.println("Thanku for your patience");
	}
	else throw new InvalidLoginDetailsException("The username or password doesn’t seem quite right");
}
private final boolean verfiyUserName(String username) {
	if(username.equals("durganomula")) {
		return true;
	}
	else return false;
}
public boolean verifyPassword(String password) {
	if(password.equals("nomula")) {
		return true;
	}
	else return false;
}
//LoginDetails l=new LoginDetails("durganomula","nomula");


}
