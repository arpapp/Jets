package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Airfield {

	private List<Jet> jetArr = new ArrayList<>();

	public Airfield() {
		// default constructor
	}
	
	public void addJet() {
//method for adding jet    like airfield.addNewJet in another class, ONLY THE AIRFIELD MAINTAINS AN ARRAY OF JETS
		
	}
	
	public void listFleet() {
		for (int i = 0 ; i < jetArr.size() ; i++) {
			System.out.println(jetArr.get(i));
		}
	}
	
	public void flyFleet() {
		for (int i = 0 ; i < jetArr.size() ; i++) {
			Jet currentJet = jetArr.get(i);
			currentJet.fly();
		}
	}


	public List<Jet> getJetInfo() {
		BufferedReader bufIn = null;
		try {
			bufIn = new BufferedReader(new FileReader("jets.txt"));
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] jetInfo = line.split(", ");
				String model = jetInfo[0];
				double speed = Double.parseDouble(jetInfo[1]);
				int range = Integer.parseInt(jetInfo[2]);
				double price = Double.parseDouble(jetInfo[3]);
				
				if (model.equals("Cargo plane") ){
					CargoPlane cargo = new CargoPlane(model, speed, range, price);
					jetArr.add(cargo);
				}
				else if (model.contentEquals("Fighter jet")) {
					FighterPlane fighter = new FighterPlane(model, speed, range, price);
					jetArr.add(fighter);
				}
				
			}
		} catch (IOException e) {
			System.err.println(e);
		} finally {
			if (bufIn != null) {
				try {
					bufIn.close();
				} catch (IOException e) {
					System.err.println(e);
				}
			}
		}
		return jetArr;
	}
	
}
