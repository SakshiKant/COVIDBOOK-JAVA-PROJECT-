package com.univ.DTO;

public class ForgotPasswordDTO {
	public String getEmail1() {
		return email1;
	}
	public String getPassword() {
		return Password;
	}
	String email1;
	String Password;
	public ForgotPasswordDTO(String email1, String password) {
		super();
		this.email1 = email1;
		Password = password;
	}

}