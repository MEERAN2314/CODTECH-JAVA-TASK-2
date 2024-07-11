package com.cr.hospital_management.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cr.hospital_management.Entity.Discharges;
import com.cr.hospital_management.Service.DischargeService;

@RestController
@RequestMapping("DischargeController")

public class DischargeController {
	
	@Autowired
	private DischargeService dserviceDetails;
	
	@PostMapping("Discharges/add")
	public String DischargeDetails(@RequestBody Discharges discharge) {
		return dserviceDetails.addDischarge(discharge);
	}
	
	@GetMapping("Discharges/FindID/{DischargesID}")
	public Discharges DisID(@PathVariable("DischargesID")Integer DiID) {
		return dserviceDetails.DocID(DiID);
	}
	
	@DeleteMapping("Discharges/delete/{DischargesID}")
	public String DeleteDischargeID(@PathVariable("DischargesID")Integer deldID) {
		dserviceDetails.DeleteDischargeID(deldID);
		return "Discharrge Details deleted successfully";
	}
	

}
