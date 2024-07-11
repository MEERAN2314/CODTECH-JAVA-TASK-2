package com.cr.hospital_management.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cr.hospital_management.DAO.DoctorsDAO;
import com.cr.hospital_management.Entity.Doctors;
import com.cr.hospital_management.Exception.DoctorNotFoundException;
import com.cr.hospital_management.Exception.IdnotfoundException;

@Service

public class DoctorsServiceIMPL implements DoctorsService{
	
	@Autowired
	private DoctorsDAO dDAO;

	@Override
	public String addDoctor(Doctors doctor) {
		
		dDAO.save(doctor);
		
		return "Doctor details added Successfully";
	}

	@Override
	public Doctors DocID(Integer dID){
		Optional<Doctors> doctor = dDAO.findById(dID);
		if(doctor.isEmpty()) {
			throw new IdnotfoundException("ID not found");
		}
		return doctor.get();
	}

	@Override
	public void DeleteDoctorID(Integer delID) {
		 Optional<Doctors> DelID = dDAO.findById(delID);
		if(DelID.isPresent()) {
			dDAO.deleteById(delID);
		}else {
			throw new DoctorNotFoundException("No Doctor found with id"+delID);
		}
		
		
	}

}
