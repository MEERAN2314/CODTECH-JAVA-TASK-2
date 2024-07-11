package com.cr.hospital_management.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cr.hospital_management.DAO.DischargeDAO;
import com.cr.hospital_management.Entity.Discharges;
import com.cr.hospital_management.Exception.DischargeNotFoundException;
import com.cr.hospital_management.Exception.IdnotfoundException;

@Service

public class DischargeServiceIMPL implements DischargeService{
	
	@Autowired
	private DischargeDAO diDAO;

	@Override
	public String addDischarge(Discharges discharge) {
		diDAO.save(discharge);
		
		return "Discharge details added successfully";
	}

	@Override
	public Discharges DocID(Integer diID) {
		Optional<Discharges> discharge = diDAO.findById(diID);
		if(discharge.isEmpty()) {
			throw new IdnotfoundException("ID not found");
		}
		return discharge.get();
	}

	@Override
	public void DeleteDischargeID(Integer deldID) {
		Optional<Discharges> DeldID = diDAO.findById(deldID);
		if(DeldID.isPresent()) {
			diDAO.deleteById(deldID);
		}else {
			throw new DischargeNotFoundException("No Discharge found with id"+deldID);
		}
		
	}
	
	
	
	
	
}