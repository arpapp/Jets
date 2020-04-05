package com.skilldistillery.jets;

public class CargoPlane extends Jet implements CargoCarrier{
	
	public CargoPlane() {
		//default constructor
	}
	
	public CargoPlane (String _model, double _speed, int _range, double _price) {
		super( _model,  _speed,  _range,  _price);
	}
	
	public void loadCargo() {
		int random = (int)(100+Math.random()*500);
		System.out.println("Loading " + random +  " lbs of cargo onto " + this.getModel() + ".");
	}
	
	

}
