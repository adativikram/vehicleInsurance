package com.maven.insurance.DAO;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import com.maven.insurance.pojo.VehicleDetails;

public class RegistrationDAOImpl implements  RegistrationDAO {
	/*
	public Map<String, VehicleDetails> vehicleDetails() {
		
		Map<String,VehicleDetails> detailsEntry=new HashMap<String,VehicleDetails>();
		VehicleDetails obj1=new VehicleDetails("2wheeler","2",856749317,970007835);
		VehicleDetails obj2=new VehicleDetails("4wheeler","1",856749385,970007833);
		VehicleDetails obj3=new VehicleDetails("2wheeler","1",856749369,970007811);
		detailsEntry.put("TS-1234", obj1);
		detailsEntry.put("TS-1235", obj2);
		detailsEntry.put("TS-1236", obj2);
		
		
		return detailsEntry;
		
	}
	
	*/
	public String vehicleRegistration(VehicleDetails vehicle) {
		// TODO Auto-generated method stub
 
		Map<String,VehicleDetails> detailsEntry=new HashMap<String,VehicleDetails>();
		VehicleDetails obj1=new VehicleDetails(vehicle.getVehicleType(),vehicle.getInsPeriod(),vehicle.getAadharNo(),vehicle.getMobileNo(),vehicle.getDate());
		detailsEntry.put(vehicle.getVehicleNo(), obj1);
		return vehicle.getVehicleNo();
	}

	public boolean insuranceValidity(String vehicleNo) {
		// TODO Auto-generated method stub
		
		
		
	
		return false;
	}



}
