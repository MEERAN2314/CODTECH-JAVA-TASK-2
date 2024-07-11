package com.cr.hospital_management.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cr.hospital_management.DAO.PatientsDAO;
import com.cr.hospital_management.Entity.Patients;
import com.cr.hospital_management.Exception.IdnotfoundException;
import com.cr.hospital_management.Exception.PatientNotFoundException;

@Service

public class PatientsServiceIMPL implements PatientsService{
	
	@Autowired
	private PatientsDAO pDAO;

	@Override
	public String addPatient(Patients patient) {
		
		pDAO.save(patient);
		
		return "Patient details added successfully";
	}

	@Override
	public Patients PatID(Integer pID) {
		Optional<Patients> patient = pDAO.findById(pID);
		if(patient.isEmpty()) {
			throw new IdnotfoundException("ID not found");
		}
		return patient.get();
	}

	@Override
	public void DeletePatientsID(Integer delpID) {
		Optional<Patients> DelpID = pDAO.findById(delpID);
		if(DelpID.isPresent()) {
			pDAO.deleteById(delpID);
		}else {
			throw new PatientNotFoundException("No Patients found with id"+delpID);
		}
		
	}

}
