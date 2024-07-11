package com.cr.hospital_management.DAO;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cr.hospital_management.Entity.Patients;

@Repository

public interface PatientsDAO extends JpaRepository<Patients, Integer>{

	

}
