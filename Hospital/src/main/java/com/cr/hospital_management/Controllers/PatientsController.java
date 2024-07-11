package com.cr.hospital_management.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cr.hospital_management.Entity.Patients;
import com.cr.hospital_management.Service.PatientsService;

@RestController
@RequestMapping("PatientsController")

public class PatientsController {
	
	@Autowired
	private PatientsService pserviceDetails;
	
	@PostMapping("Patients/add")
	public String PatientDetails(@RequestBody Patients patient) {
		return pserviceDetails.addPatient(patient);
	}
	
	@GetMapping("Patients/FindID/{PatientsID}")
	public Patients PatID(@PathVariable("PatientsID")Integer pID) {
	return pserviceDetails.PatID(pID);
	}
	
	@DeleteMapping("Patients/delete/{PatientsID}")
	public String DeletePatientsID(@PathVariable("PatientsID")Integer DelpID) {
		pserviceDetails.DeletePatientsID(DelpID);
		return"Patient Ddetails deleted successfully";
	}
}
