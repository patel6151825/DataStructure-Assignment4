package com.johnabbott.assignment4.domain;

public class Car {

	private String model;
	private String make;
	private Integer Year;

	// constructor
	public Car(String model, String make, Integer year) {
		super();
		this.model = model;
		this.make = make;
		Year = year;
	}

	// getter and setters
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public Integer getYear() {
		return Year;
	}

	public void setYear(Integer year) {
		Year = year;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", make=" + make + ", Year=" + Year + "]";
	}

}
