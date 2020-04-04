package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JetsApplication {

	public static void main(String[] args) {

		JetsApplication app = new JetsApplication();
		
		app.run();

	}
	
	public void run() {
		
		Airfield airfield = new Airfield();
		List <String> dragonArr = new ArrayList<>();
		
		BufferedReader bufIn = null;
		try {
		  bufIn = new BufferedReader(new FileReader("Dragons.txt"));
		  String line;
		  while ((line = bufIn.readLine()) != null) {
			  
			 dragonArr.add(line);
			 
//		    System.out.println(line);
		  }
		  
		  for (int i = 0 ; i < dragonArr.size() ; i++) {
			  
			  String dragonInfo = (String)(dragonArr.get(i));
			  String []split = dragonInfo.split(",");
			  System.out.println(split[i]);
			  
		  }
		  
		}
		catch (IOException e) {
		  System.err.println(e);
		}
		finally {
		  if (bufIn != null) {
		    try {
		      bufIn.close();
		    }
		    catch (IOException e) {
		      System.err.println(e);
		    }
		  }
		}
		
	}

}
