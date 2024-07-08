package com.univ.DTO;

public class AppointmentDTO {
	public String getDName() {
		return DName;
	}
	public String getSpeciality() {
		return Speciality;
	}
	String DName;
	String Speciality;
	public AppointmentDTO(String dName, String speciality) {
		super();
		DName = dName;
		Speciality = speciality;
	}
	

}
