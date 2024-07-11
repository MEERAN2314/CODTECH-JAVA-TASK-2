package com.cr.hospital_management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
@SpringBootApplication
@ComponentScan(basePackages = {"com.cr.hospital_management","com.cr.hospital_management.Controllers","com.cr.hospital_management.DAO","com.cr.hospital_management.Entity","com.cr.hospital_management.Exception","com.cr.hospital_management.Service"})

@EnableSwagger2
public class HospitalManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalManagementApplication.class, args);
	}

}
