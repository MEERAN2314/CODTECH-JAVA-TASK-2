package com.cr.hospital_management.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Discharges {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int DischargeID;
	private int AdmissiionID;
	private String AdmissionDate;
	private String DischargeDate;
	
	
	public int getDischargeID() {
		return DischargeID;
	}
	public void setDischargeID(int dischargeID) {
		DischargeID = dischargeID;
	}
	public int getAdmissiionID() {
		return AdmissiionID;
	}
	public void setAdmissiionID(int admissiionID) {
		AdmissiionID = admissiionID;
	}
	public String getAdmissionDate() {
		return AdmissionDate;
	}
	public void setAdmissionDate(String admissionDate) {
		AdmissionDate = admissionDate;
	}
	public String getDischargeDate() {
		return DischargeDate;
	}
	public void setDischargeDate(String dischargeDate) {
		DischargeDate = dischargeDate;
	}
	
	
	public Discharges(int dischargeID, int admissiionID, String admissionDate, String dischargeDate) {
		super();
		DischargeID = dischargeID;
		AdmissiionID = admissiionID;
		AdmissionDate = admissionDate;
		DischargeDate = dischargeDate;
	}
	
	
	@Override
	public String toString() {
		return "Discharges [DischargeID=" + DischargeID + ", AdmissiionID=" + AdmissiionID + ", AdmissionDate="
				+ AdmissionDate + ", DischargeDate=" + DischargeDate + "]";
	}
	
	
	public Discharges() {
		super();
	}
	
	

}
