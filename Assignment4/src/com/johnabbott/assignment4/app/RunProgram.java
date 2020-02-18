package com.johnabbott.assignment4.app;

import java.util.Stack;

import com.johnabbott.assignment4.domain.Car;
import com.johnabbott.assignment4.domain.CarService;

public class RunProgram {

	public static void main(String[] args) {
		Car car1 = new Car("Civic", "Honda", 2019);
		Car car2 = new Car("Q7", "Audi", 2017);
		Car car3 = new Car("Wrangler", "Jeep", 2018);
		Car car4 = new Car("M3", "MBW", 2019);
		Car car5 = new Car("Corola", "Toyota", 2019);

		Stack<Car> carStack = new Stack<Car>();
		carStack.push(car1);
		carStack.push(car2);
		carStack.push(car3);
		carStack.push(car4);
		carStack.push(car5);

		CarService service = new CarService();
		service.doTicketService(carStack);
	}
}
