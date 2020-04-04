package com.skilldistillery.jets;

public class JetsApplication {

	public static void main(String[] args) {

		JetsApplication app = new JetsApplication();
		
		app.run();

	}
	
	public void run() {
		Airfield airfield = new Airfield();
		
		airfield.getJetInfo();
		
		
		
	}

}
