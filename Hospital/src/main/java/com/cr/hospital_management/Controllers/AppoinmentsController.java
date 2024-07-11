package com.cr.hospital_management.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cr.hospital_management.Entity.Appoinments;
import com.cr.hospital_management.Service.AppoinmentsService;

@RestController
@RequestMapping("AppoinmentsController")

public class AppoinmentsController {
	
	@Autowired
	private AppoinmentsService aserviceDetails;
	
	@PostMapping("Appoinments/add")
	public String AppoinmentDetails(@RequestBody Appoinments appoinments) {
		return aserviceDetails.addAppoinment(appoinments);
		
	}
	
	@GetMapping("Appoinments/FindID/{AppoinmentID}")
	public Appoinments appoinmentID(@PathVariable("AppoinmentsID")Integer aID) {
		return aserviceDetails.appoinmentsID(aID);
	}
	
	@DeleteMapping("Appoinments/delete/{AppoinmentsID}")
	public String DeleteAppoinmentID(@PathVariable("AppoinmentsID")Integer DelapID) {
		aserviceDetails.DeleteAppoinmentID(DelapID);
		return "Appoinment Details deleted successfully";
	}
	

}
