package com.cr.hospital_management.Service;

import com.cr.hospital_management.Entity.Doctors;

public interface DoctorsService {

	String addDoctor(Doctors doctor);

	Doctors DocID(Integer dID);

	void DeleteDoctorID(Integer delID);

}
