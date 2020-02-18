package com.johnabbott.assignment4.domain;

import java.util.Queue;

public class CarService {

	// method to do ticket service for cars
	public void ticketService(Queue<Car> cars) {

		// printing make and model for each car
		cars.stream().forEach(car -> System.out.println("Make : " + car.getMake() + ", Model : " + car.getModel()));
	}
}
