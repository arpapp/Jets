package com.skilldistillery.jets;

public class FighterPlane extends Jet implements CombatReady {
	public FighterPlane() {
		//default constructor
	}
	
	public FighterPlane(String _model, double _speed, int _range, double _price) {
		super( _model,  _speed,  _range,  _price);
	}
	
	public void fight() {
		System.out.println( this.getModel() + " is shooting! Oh, the humanity!");
	}

}
