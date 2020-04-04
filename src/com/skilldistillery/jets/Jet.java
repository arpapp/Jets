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
		//some bs about flying
	}
	
	public double getSpeedInMach() {
		double speedInMach = 0;
		//some bs about speed in mach
		return speedInMach;
	}

}
