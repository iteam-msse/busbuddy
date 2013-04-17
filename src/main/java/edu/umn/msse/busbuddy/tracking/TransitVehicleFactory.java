package edu.umn.msse.busbuddy.tracking;

public class TransitVehicleFactory extends ATransitVehicleFactory {
	
	public TransitVehicle createTransitVehicle(char type, String url, int vehicle) {
		
		getVehicleGPSDeviceID(type, url);
		
		TransitVehicle tv = null;
		
		switch (type) {
		case 'B':
			tv = new BusVehicle();
			break;

		}
		
		return tv;
	}
	/**
	 * Retrieve the GPS Device ID from repository of vehicles registered for route identified by type and URL.
	 * @param type
	 * @param url
	 * @return integer GPS Device ID
	 */
	protected int getVehicleGPSDeviceID(char type, String url) { return 2; } 
}
