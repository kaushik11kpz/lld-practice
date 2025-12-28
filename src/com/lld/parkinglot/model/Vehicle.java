package com.lld.parkinglot.model;

public abstract class Vehicle {
	private int registrationNumber;
	private VehicleType vehicleType;
	
	public Vehicle(int registrationNumber, VehicleType vehicleTye) {
		this.registrationNumber=registrationNumber;
		this.vehicleType=vehicleType;
	}
	
	public int getRegistrationNumber() {
		return this.registrationNumber;
	}
	
	public VehicleType getVehicleType() {
		return this.vehicleType;
	}
}
