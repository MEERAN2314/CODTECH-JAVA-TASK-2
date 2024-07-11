package com.cr.hospital_management.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cr.hospital_management.DAO.RoomsDAO;
import com.cr.hospital_management.Entity.Rooms;
import com.cr.hospital_management.Exception.IdnotfoundException;
import com.cr.hospital_management.Exception.RoomNotFoundException;
@Service
public class RoomsServiceIMPL implements RoomsService{
	
	@Autowired
	private RoomsDAO rDAO;

	@Override
	public String addRooms(Rooms room) {
		
		rDAO.save(room);
		
		return "Rooms details added Successfully";
	}

	@Override
	public Rooms roomID(Integer rID) {
		Optional<Rooms> room = rDAO.findById(rID);
		if(room.isEmpty()) {
			throw new IdnotfoundException("ID not found");
		}
		return room.get();
	}

	@Override
	public void DeleteRoomID(Integer delrID) {
		Optional<Rooms> DelrID = rDAO.findById(delrID);
		if(DelrID.isPresent()) {
			rDAO.deleteById(delrID);
		}else {
			throw new RoomNotFoundException("NO Room found with id"+delrID);
		}
	}

}
