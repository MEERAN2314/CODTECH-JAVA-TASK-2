package com.cr.hospital_management.Service;

import com.cr.hospital_management.Entity.Patients;

public interface PatientsService {

	String addPatient(Patients patient);

	Patients PatID(Integer pID);

	void DeletePatientsID(Integer delpID);

}
