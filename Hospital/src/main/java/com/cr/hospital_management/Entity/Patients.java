package com.cr.hospital_management.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Patients {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int PatientID;
	private String PatientName;
	private String PatientDOB;
	private String PatientGender;
	private long PatientPhNo;
	
	
	public int getPatientID() {
		return PatientID;
	}
	public void setPatientID(int patientID) {
		PatientID = patientID;
	}
	public String getPatientName() {
		return PatientName;
	}
	public void setPatientName(String patientName) {
		PatientName = patientName;
	}
	public String getPatientDOB() {
		return PatientDOB;
	}
	public void setPatientDOB(String patientDOB) {
		PatientDOB = patientDOB;
	}
	public String getPatientGender() {
		return PatientGender;
	}
	public void setPatientGender(String patientGender) {
		PatientGender = patientGender;
	}
	public long getPatientPhNo() {
		return PatientPhNo;
	}
	public void setPatientPhNo(long patientPhNo) {
		PatientPhNo = patientPhNo;
	}
	
	
	public Patients(int patientID, String patientName, String patientDOB, String patientGender, long patientPhNo) {
		super();
		PatientID = patientID;
		PatientName = patientName;
		PatientDOB = patientDOB;
		PatientGender = patientGender;
		PatientPhNo = patientPhNo;
	}
	
	
	@Override
	public String toString() {
		return "Patients [PatientID=" + PatientID + ", PatientName=" + PatientName + ", PatientDOB=" + PatientDOB
				+ ", PatientGender=" + PatientGender + ", PatientPhNo=" + PatientPhNo + "]";
	}
	
	
	public Patients() {
		super();
	}
	
	
	
	

}
