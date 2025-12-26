package com.lld.parkinglot.main;

import com.lld.parkinglot.model.Car;
import com.lld.parkinglot.model.ParkingLot;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("LLD Practice Environment Ready!");
		ParkingLot parkingLot = new ParkingLot(3);
		Car car1 = new Car(1);
		Car car2 = new Car(2);
		Car car3 = new Car(3);
		Car car4 = new Car(4);
		parkingLot.ParkCar(car1);
		parkingLot.ParkCar(car2);
		parkingLot.ParkCar(car3);
		parkingLot.ParkCar(car4);
		
		parkingLot.removeCar(0);
		parkingLot.ParkCar(car4);
	}

}
