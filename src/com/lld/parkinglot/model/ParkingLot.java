package com.lld.parkinglot.model;

import java.util.*;

public class ParkingLot {

	private List<ParkingSpot> parkingSpots;

	public ParkingLot(int numberOfSpots) {
		parkingSpots = new ArrayList<>();
		for(int i=0;i<numberOfSpots;i++) {
			parkingSpots.add(new ParkingSpot(i));
		}
	}
	
	public ParkingSpot ParkCar(Car car) {
		for(ParkingSpot pSpot : parkingSpots) {
			if(pSpot.isFree()) {
				pSpot.parkCar(car);
				System.out.println("Car "+car.getCarNumber()+" is parked at ParkingSpot "+pSpot.getId());
				return pSpot;
			}
		}
		System.out.println("Sorry, Parking lot is full!!");
		return null;
	}
	
	public void removeCar(int spotId) {
		for(ParkingSpot pSpot : parkingSpots) {
			if(pSpot.getId() == spotId && !pSpot.isFree()) {
				pSpot.removeCar();
				System.out.println("Car is removed from Parking Spot "+spotId);			
			}
		}
		System.out.println("Parking Spot "+spotId+ " is already empty");
	}
	
	public boolean isFull() {
		for(ParkingSpot pSpot : parkingSpots) {
			if(pSpot.isFree()) {
				return false;
			}
		}
		return true;
	}
}
