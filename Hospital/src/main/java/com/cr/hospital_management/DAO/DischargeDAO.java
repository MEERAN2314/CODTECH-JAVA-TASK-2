package com.cr.hospital_management.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cr.hospital_management.Entity.Discharges;

@Repository

public interface DischargeDAO extends JpaRepository<Discharges, Integer>{

}
