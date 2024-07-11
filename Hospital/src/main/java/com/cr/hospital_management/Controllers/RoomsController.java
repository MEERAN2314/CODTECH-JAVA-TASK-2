package com.cr.hospital_management.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cr.hospital_management.Entity.Rooms;
import com.cr.hospital_management.Service.RoomsService;

@RestController
@RequestMapping("RoomsController")

public class RoomsController {
	
	@Autowired
	private RoomsService rserviceDetails;
	
	@PostMapping("Rooms/add")
	public String RoomsDetails(@RequestBody Rooms room) {
		return rserviceDetails.addRooms(room);
	}
	
	@GetMapping("Rooms/FindID/{RoomsID}")
	public Rooms roomID(@PathVariable("RoomsID")Integer rID) {
		return rserviceDetails.roomID(rID);
	}
	
	@DeleteMapping("Rooms/delete/{RoomsID}")
	public String DeleteRoomID(@PathVariable("RoomsID")Integer DelrID) {
		rserviceDetails.DeleteRoomID(DelrID);
		return "Rooms Details deleted successfully";
				
	}

}
