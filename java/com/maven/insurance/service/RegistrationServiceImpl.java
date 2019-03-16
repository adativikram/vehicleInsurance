package com.maven.insurance.service;

import com.maven.insurance.DAO.RegistrationDAO;
import com.maven.insurance.DAO.RegistrationDAOImpl;
import com.maven.insurance.pojo.VehicleDetails;

public class RegistrationServiceImpl implements  RegistrationService {
	RegistrationDAO daoObj=new RegistrationDAOImpl();
	public String vehicleRegistration(VehicleDetails vehicle) {
		// TODO Auto-generated method stub
		
		return daoObj.vehicleRegistration(vehicle);
	}

	public boolean insuranceValidity(String vehicleNo) {
		// TODO Auto-generated method stub
		
		return daoObj.insuranceValidity(vehicleNo);
	}
}
