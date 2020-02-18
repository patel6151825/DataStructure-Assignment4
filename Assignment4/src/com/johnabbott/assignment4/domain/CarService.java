package com.johnabbott.assignment4.domain;

import java.util.Stack;

public class CarService {

	public void doTicketService(Stack<Car> carStack) {

		carStack.stream().forEach(car -> System.out.println("Make : " + car.getMake() + ", Model : " + car.getModel()));
	}
}
