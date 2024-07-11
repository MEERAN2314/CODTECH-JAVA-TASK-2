package com.cr.hospital_management.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cr.hospital_management.Entity.Doctors;
import com.cr.hospital_management.Service.DoctorsService;

@RestController
@RequestMapping("DoctorsController")

public class DoctorsController {
	
	@Autowired
	private DoctorsService serviceDetails;
	
	@PostMapping("Doctors/add")
	public String DoctorDetails(@RequestBody Doctors doctor) {
		return serviceDetails.addDoctor(doctor);
	}
	
	@GetMapping("Doctors/FindID/{DoctorsID}")
	public Doctors DocID(@PathVariable("DoctorsID")Integer dID) {
	return serviceDetails.DocID(dID);
	}
	
	@DeleteMapping("Doctors/delete/{DoctorsID}")
	public String DeleteDoctorID(@PathVariable("DoctorsID")Integer DelID) {
		serviceDetails.DeleteDoctorID(DelID);
		return"Doctor Details deleted successfully";
	}
	
}
