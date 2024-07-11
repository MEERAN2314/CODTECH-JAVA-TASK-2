package com.cr.hospital_management.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Doctors {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int DoctorID;
	private String DoctorName;
	private String DoctorGender;
	private long PhNo;
	private String Email;
	
	
	public int getDoctorID() {
		return DoctorID;
	}
	public void setDoctorID(int doctorID) {
		DoctorID = doctorID;
	}
	public String getDoctorName() {
		return DoctorName;
	}
	public void setDoctorName(String doctorName) {
		DoctorName = doctorName;
	}
	public String getGender() {
		return DoctorGender;
	}
	public void setGender(String gender) {
		DoctorGender = gender;
	}
	public long getPhNo() {
		return PhNo;
	}
	public void setPhNo(long phNo) {
		PhNo = phNo;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	
	public Doctors(int doctorID, String doctorName, String gender, long phNo, String email) {
		super();
		DoctorID = doctorID;
		DoctorName = doctorName;
		DoctorGender = gender;
		PhNo = phNo;
		Email = email;
	}
	
	
	@Override
	public String toString() {
		return "Doctors [DoctorID=" + DoctorID + ", DoctorName=" + DoctorName + ", DoctorGender=" + DoctorGender + ", PhNo=" + PhNo
				+ ", Email=" + Email + "]";
	}
	
	
	public Doctors() {
		super();
	}
	

}
