package com.cr.hospital_management.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cr.hospital_management.DAO.AppoinmentsDAO;
import com.cr.hospital_management.Entity.Appoinments;
import com.cr.hospital_management.Exception.AppoinmentNotFoundException;
import com.cr.hospital_management.Exception.IdnotfoundException;

@Service

public class AppoinmentsServiceIMPL implements AppoinmentsService{
	
	@Autowired
	private AppoinmentsDAO aDAO;
	

	@Override
	public String addAppoinment(Appoinments appoinments) {
		
		aDAO.save(appoinments);
		
		return "Appoinment details added successfully";
	}


	@Override
	public Appoinments appoinmentsID(Integer aID) {
		Optional<Appoinments> appoinment = aDAO.findById(aID);
		if(appoinment.isEmpty()) {
			throw new IdnotfoundException("Id not found");
		}
		return appoinment.get();
	}


	@Override
	public void DeleteAppoinmentID(Integer delapID) {
		Optional<Appoinments> DelapID = aDAO.findById(delapID);
		if(DelapID.isPresent()) {
			aDAO.deleteById(delapID);
		}else {
			throw new AppoinmentNotFoundException("No Appoinment found with ID"+delapID);
		}
		
	}

}
