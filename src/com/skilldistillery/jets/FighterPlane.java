package com.skilldistillery.jets;

public class FighterPlane extends Jet {
	public FighterPlane() {
		//default constructor
	}
	
	public FighterPlane(String _model, double _speed, int _range, double _price) {
		super( _model,  _speed,  _range,  _price);
	}
	
	public void fight() {
		//some bs about fighting
	}

}
