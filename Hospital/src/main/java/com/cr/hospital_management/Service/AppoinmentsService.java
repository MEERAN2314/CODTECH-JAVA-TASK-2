package com.cr.hospital_management.Service;

import com.cr.hospital_management.Entity.Appoinments;

public interface AppoinmentsService {

	String addAppoinment(Appoinments appoinments);

	Appoinments appoinmentsID(Integer aID);

	void DeleteAppoinmentID(Integer delapID);

}
