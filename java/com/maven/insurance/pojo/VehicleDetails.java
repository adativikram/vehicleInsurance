package com.maven.insurance.pojo;

import java.util.Date;

public class VehicleDetails {
	private String vehicleNo,vehicleType,insPeriod;
	private long aadharNo,mobileNo;
	String date;
	public VehicleDetails(String vehicleType,String insPeriod,long aadharNo,long mobileNo,String date){
		this.vehicleType=vehicleType;
		this.insPeriod=insPeriod;
		this.aadharNo=aadharNo;
		this.mobileNo=mobileNo;
		this.date=date;
	}
	
	
	public String getDate() {
		return date;
	}


	public void setDate(String string) {
		this.date = string;
	}


	public VehicleDetails() {
		// TODO Auto-generated constructor stub
	}


	public String getVehicleNo() {
		return vehicleNo;
	}
	public String setVehicleNo(String vehicleNo) {
		return this.vehicleNo = vehicleNo;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getInsPeriod() {
		return insPeriod;
	}
	public void setInsPeriod(String insPeriod) {
		this.insPeriod = insPeriod;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	

}
