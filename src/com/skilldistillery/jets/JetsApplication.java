package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApplication {
	static Airfield airfield = new Airfield();
	static JetsApplication app = new JetsApplication();

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int selection;

		app.getArray();
		
		airfield.flyFleet();

		
		
		System.out.println("Welcome to Jets Declassified, your eye in they sky.");

		do {
			System.out.println("Please select from the following options:");
			System.out.println("1. List fleet");
			System.out.println("2. Fly all jets");
			System.out.println("3. View fastest jet");
			System.out.println("4. View jet with the longest range");
			System.out.println("5. Load all Cargo Jets");
			System.out.println("6. Dogfight!");
			System.out.println("7. Add a jet to the fleet");
			System.out.println("8. Remove a jet from the fleet");
			System.out.println("9. Quit");

			selection = kb.nextInt();

		} while (selection != 9);

	}

	public void getArray() {

		airfield.getJetInfo();

	}

	public void listFleet() {
		
		airfield.listFleet();

	}
	
	public void flyFleet() {
		
		airfield.flyFleet();
		
	}
}
