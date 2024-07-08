package com.univ.DTO;

public class adminDTO {
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	String username;
	String password;
	String email;
	public adminDTO(String username, String password, String email) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
	
	

}
