package com.cr.hospital_management.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cr.hospital_management.DAO.AdmissionsDAO;
import com.cr.hospital_management.Entity.Admissions;
import com.cr.hospital_management.Exception.AdmissionNotFoundException;
import com.cr.hospital_management.Exception.IdnotfoundException;

@Service

public class AdmissionsServiceIMPL implements AdmissionsService{
	
	@Autowired
	private AdmissionsDAO adDAO;

	@Override
	public String addAdmissions(Admissions admission) {
		
		adDAO.save(admission);
		
		return "Admissions details added successfully";
	}

	@Override
	public Admissions admID(Integer adID) {
		Optional<Admissions> admission = adDAO.findById(adID);
		if(admission.isEmpty()) {
			throw new IdnotfoundException("ID not found");
		}
		return admission.get();
	}

	@Override
	public void DeleteAdmissionID(Integer deladID) {
		Optional<Admissions> DeladID = adDAO.findById(deladID);
		if(DeladID.isPresent()) {
			adDAO.deleteById(deladID);
		}else {
			throw new AdmissionNotFoundException("No Admission found with id"+deladID);
		}
	}

}
