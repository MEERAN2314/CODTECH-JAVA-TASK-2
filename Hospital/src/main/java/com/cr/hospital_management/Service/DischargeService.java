package com.cr.hospital_management.Service;

import com.cr.hospital_management.Entity.Discharges;

public interface DischargeService {

	String addDischarge(Discharges discharge);

	Discharges DocID(Integer diID);

	void DeleteDischargeID(Integer deldID);

}
