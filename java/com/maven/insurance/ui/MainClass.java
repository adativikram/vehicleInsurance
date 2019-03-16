package com.maven.insurance.ui;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.maven.insurance.pojo.VehicleDetails;
import com.maven.insurance.service.RegistrationService;
import com.maven.insurance.service.RegistrationServiceImpl;

public class MainClass {
	
	RegistrationService regService=new RegistrationServiceImpl();
	
	VehicleDetails vehicle=new VehicleDetails();
 void choice() {
	 
	 Scanner in=new Scanner(System.in);
	System.out.println("please enter \n 1.for registration \n 2. for insurance validity check \n 3.to exit");
	 int ch=in.nextInt();
	 switch(ch) {
	 	case 1:{
	 		
	 		System.out.println("enter your vehicle number");
	 		vehicle.setVehicleNo(in.next());
	 		System.out.println("vehicle type");
	 		vehicle.setVehicleType(in.next());
	 		System.out.println("insurance period");
	 		vehicle.setInsPeriod(in.next());
	 		System.out.println(" enter aadhar number");
	 		vehicle.setAadharNo(in.nextLong());
	 		System.out.println("enter mobile number");
	 		vehicle.setMobileNo(in.nextLong());

	 		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd ");  
	 	   LocalDateTime now = LocalDateTime.now();  
	 	   vehicle.setDate(dtf.format(now));
	 	
	 		String vehicleNo= regService.vehicleRegistration(vehicle);
	 		System.out.println("vehicle "+vehicleNo+"  registrated successfully on "+vehicle.getDate() );
	 		choice();
	 		break;
	 	}
	
	
	 	case 2:{
	 	System.out.println(vehicle.getVehicleNo());
	 		System.out.println("please enter your vehicle number ");
	 		
	 		boolean res=regService.insuranceValidity(vehicle.setVehicleNo(in.next()));
	 		break;
	 	}
	
	 	case 3:{
	 		System.out.println("application terminated");
	 		System.exit(0);
	 		break;
	 	}

	 }
}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass mc=new MainClass();
		mc.choice();
	}

}
