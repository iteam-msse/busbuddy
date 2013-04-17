package edu.umn.msse.busbuddy.tracking;

import java.util.ArrayList;

public class TrackingServiceController {
	
	private ArrayList <TransitVehicle> vehicleList = null;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TransitVehicleFactory transitFactory = new TransitVehicleFactory();
		char type = 'B';
		String url = "rpt.com/route12/bus/740";
		int vehicleNum = 740;
		TransitVehicle tv = transitFactory.createTransitVehicle(type, url, vehicleNum);
	}
	
	public void registerVehicleOnRoute(char type, String url, int vehicleNum) {} 
	
	public void addTransitVehicle(TransitVehicle tv) {	
		
		if (tv != null) {
			vehicleList.add(tv);
		}
		
	}

}
