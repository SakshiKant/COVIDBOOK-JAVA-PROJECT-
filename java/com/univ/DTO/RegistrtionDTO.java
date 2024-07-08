package com.univ.DTO;

public class RegistrtionDTO {
public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}
	public int getMob() {
		return mob;
	}
	public int getId() {
		return id;
	}
	public int getStatus() {
		return status;
	}
String userName,password,email,address;
int  mob,id,status;
public RegistrtionDTO(String userName, String password, String email, String address, int mob, int id, int status) {
	super();
	this.userName = userName;
	this.password = password;
	this.email = email;
	this.address = address;
	this.mob = mob;
	this.id = id;
	this.status = status;
}



}
