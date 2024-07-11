package com.cr.hospital_management.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cr.hospital_management.Entity.Admissions;
import com.cr.hospital_management.Service.AdmissionsService;

@RestController
@RequestMapping("AdmissionsController")

public class AdmissionsController {
	
	@Autowired
	private AdmissionsService adServiceDetails;
	
	@PostMapping("Admissions/add")
	public String AdmissionDetails(@RequestBody Admissions admission) {
		return adServiceDetails.addAdmissions(admission);
	}
	
	@GetMapping("Admissions/FindID/{AdmissionsID}")
	public Admissions admID(@PathVariable("AdmissionsID")Integer adID) {
		return adServiceDetails.admID(adID);
	}
	
	@DeleteMapping("Admissions/delete/{AdmissionsID}")
	public String DeleteAdmissionID(@PathVariable("AdmissionsID")Integer DeladID) {
		adServiceDetails.DeleteAdmissionID(DeladID);
		return "Admissions Details deleted successfully";
	}

}
