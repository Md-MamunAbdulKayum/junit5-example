package com.notearena.utils;

import java.io.IOException;
import java.util.Properties;

public class Utilities {

	public boolean checkInternetConnectivity() {
		// write code to check connectivity
		return true; 
	}
	
	public boolean checkDatabaseConnectivity() {
		// write code to check connectivity
		return true; 
	}
	
	
	public double getAccountBalance(double value) {		
		return 500000000.00+value;
	}
	
	public String getEnvironmentName() {
		Properties prop = new Properties();
		try {
		    //load a properties file from class path, inside static method
		    prop.load(Utilities.class.getClassLoader().getResourceAsStream("application.properties"));

		    //get the property value and print it out
            String envNameString = prop.getProperty("app.env");
            //System.out.println("Found env name: "+envNameString);
            return envNameString;

		} 
		catch (IOException ex) {
		    ex.printStackTrace();
		    return null;
		}
	}
}
