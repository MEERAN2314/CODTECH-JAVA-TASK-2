package com.cr.hospital_management.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Appoinments {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int AppoinmentID;
	private int PatientID;
	private int DoctorID;
	private String Date;
	private String Time;
	
	
	public int getAppoinmentID() {
		return AppoinmentID;
	}
	public void setAppoinmentID(int appoinmentID) {
		AppoinmentID = appoinmentID;
	}
	public int getPatientID() {
		return PatientID;
	}
	public void setPatientID(int patientID) {
		PatientID = patientID;
	}
	public int getDoctorID() {
		return DoctorID;
	}
	public void setDoctorID(int doctorID) {
		DoctorID = doctorID;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	
	
	public Appoinments(int appoinmentID, int patientID, int doctorID, String date, String time) {
		super();
		AppoinmentID = appoinmentID;
		PatientID = patientID;
		DoctorID = doctorID;
		Date = date;
		Time = time;
	}
	
	
	@Override
	public String toString() {
		return "Appoinments [AppoinmentID=" + AppoinmentID + ", PatientID=" + PatientID + ", DoctorID=" + DoctorID
				+ ", Date=" + Date + ", Time=" + Time + "]";
	}
	
	
	public Appoinments() {
		super();
	}
	
	
	
	
	
	

}
