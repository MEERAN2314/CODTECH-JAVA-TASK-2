package com.cr.hospital_management.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Rooms {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int RoomID;
	private int RoomNumber;
	
	
	public int getRoomID() {
		return RoomID;
	}
	public void setRoomID(int roomID) {
		RoomID = roomID;
	}
	public int getRoomNumber() {
		return RoomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		RoomNumber = roomNumber;
	}
	
	
	public Rooms(int roomID, int roomNumber) {
		super();
		RoomID = roomID;
		RoomNumber = roomNumber;
	}
	
	
	@Override
	public String toString() {
		return "Rooms [RoomID=" + RoomID + ", RoomNumber=" + RoomNumber + "]";
	}
	
	
	public Rooms() {
		super();
	}
	
	
	

}
