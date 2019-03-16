package com.maven.insurance.DAO;

import com.maven.insurance.pojo.VehicleDetails;

public interface RegistrationDAO {
	
	
	String vehicleRegistration(VehicleDetails vehicle);

	boolean insuranceValidity(String vehicleNo);
}
