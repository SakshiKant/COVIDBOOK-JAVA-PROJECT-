package com.univ.DTO;

public class loginDTO {
 public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getStatus() {
		return status;
	}
	public String getEmail() {
	
		return email;
		
	}
String username,password,email;
  
String status;
public loginDTO(String username, String password, String email, String status) {
	super();
	this.username = username;
	this.password = password;
	
	 this.email=email;
	 this.status = status;
}
  
 
}
