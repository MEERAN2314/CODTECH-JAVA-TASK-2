package com.cr.hospital_management.Service;

import com.cr.hospital_management.Entity.Rooms;

public interface RoomsService {

	String addRooms(Rooms room);

	Rooms roomID(Integer rID);

	void DeleteRoomID(Integer delrID);

}
