package com.maven.insurance.service;

import com.maven.insurance.pojo.VehicleDetails;

public interface RegistrationService {
boolean insuranceValidity(String vehicleNo);
String vehicleRegistration(VehicleDetails vehicle);
}
