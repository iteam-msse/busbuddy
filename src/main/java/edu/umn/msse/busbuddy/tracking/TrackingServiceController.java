package edu.umn.msse.busbuddy.tracking;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class TrackingServiceController {
	
	private ArrayList <TransitVehicle> vehicleList = null;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TransitVehicleFactory transitFactory = new TransitVehicleFactory();
		URL url = null;
		try {
			url = new URL("http://rpt.com/route12/bus/740");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		int vehicleNum = 740;
		TransitVehicle tv = transitFactory.createTransitVehicle(url, vehicleNum);
	}
	
	public void registerVehicleOnRoute(char type, String url, int vehicleNum) {} 
	
	public void addTransitVehicle(TransitVehicle tv) {	
		
		if (tv != null) {
			vehicleList.add(tv);
		}
		
	}
	
	public void addUserTrackingAlert() {
		
	}

}
