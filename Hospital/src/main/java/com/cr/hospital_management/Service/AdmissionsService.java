package com.cr.hospital_management.Service;

import com.cr.hospital_management.Entity.Admissions;


public interface AdmissionsService {

	String addAdmissions(Admissions admission);

	Admissions admID(Integer adID);

	void DeleteAdmissionID(Integer deladID);

}
