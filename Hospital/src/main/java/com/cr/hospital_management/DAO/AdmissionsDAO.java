package com.cr.hospital_management.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cr.hospital_management.Entity.Admissions;

@Repository

public interface AdmissionsDAO extends JpaRepository<Admissions, Integer>{

}
