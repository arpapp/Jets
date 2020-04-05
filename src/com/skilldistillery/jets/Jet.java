package com.skilldistillery.jets;

public abstract class Jet {
	private String model;
	private double speed;
	private int range;
	private double price;
	
	public Jet() {
		//default constructor
	}
	
	public Jet(String _model, double _speed, int _range, double _price) {
		model = _model;
		speed = _speed;
		range = _range;
		price = _price;
	}
	
	public void fly() {
		System.out.println("We have a " + this.model + " flying at " +this.speed+ " MPH.");
		System.out.println("It has a range of " + this.range + " miles so it can fly for " + (this.range/this.speed) + " hours.");
	}
	
	public double getSpeedInMach() {
		double speedInMach = 0;
		//some bs about speed in mach
		return speedInMach;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Jet [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + "]";
	}
	
	

}
