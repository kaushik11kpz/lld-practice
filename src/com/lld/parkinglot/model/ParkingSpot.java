package com.lld.parkinglot.model;

public class ParkingSpot {
	private int Id;
	private Car parkedCar;
	VehicleType vehicleType;
	
	public ParkingSpot(int Id) {
		this.Id = Id;
	}
	
	public int getId(){
		return Id;
	}
	
	public VehicleType getVehicleType() {
		return vehicleType.Car;
	}
	
	public boolean isFree() {
		return this.parkedCar == null;
	}
	
	public void parkCar(Car car) {
		this.parkedCar = car;
	}
	
	public void removeCar() {
		this.parkedCar = null;
	}
	
	public Car getParkedCar() {
		return this.parkedCar;
	}
}
