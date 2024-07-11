package com.cr.hospital_management.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Admissions {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int AdmissionID;
	private int PatientID;
	private String AdmissionDate;
	private int RoomID;
	private int DoctorID;
	
	
	public int getAdmissionID() {
		return AdmissionID;
	}
	public void setAdmissionID(int admissionID) {
		AdmissionID = admissionID;
	}
	public int getPatientID() {
		return PatientID;
	}
	public void setPatientID(int patientID) {
		PatientID = patientID;
	}
	public String getAdmissionDate() {
		return AdmissionDate;
	}
	public void setAdmissionDate(String admissionDate) {
		AdmissionDate = admissionDate;
	}
	public int getRoomID() {
		return RoomID;
	}
	public void setRoomID(int roomID) {
		RoomID = roomID;
	}
	public int getDoctorID() {
		return DoctorID;
	}
	public void setDoctorID(int doctorID) {
		DoctorID = doctorID;
	}
	
	
	public Admissions(int admissionID, int patientID, String admissionDate, int roomID, int doctorID) {
		super();
		AdmissionID = admissionID;
		PatientID = patientID;
		AdmissionDate = admissionDate;
		RoomID = roomID;
		DoctorID = doctorID;
	}
	
	
	@Override
	public String toString() {
		return "Admissions [AdmissionID=" + AdmissionID + ", PatientID=" + PatientID + ", AdmissionDate="
				+ AdmissionDate + ", RoomID=" + RoomID + ", DoctorID=" + DoctorID + "]";
	}
	public Admissions() {
		super();
	}
	
	
	
	

}
