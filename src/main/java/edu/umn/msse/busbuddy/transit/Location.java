package edu.umn.msse.busbuddy.transit;

/**
 * An immutable Value Object representing a physical point on the
 * geographic coordinate system. 
 */
public class Location {

	/** 
	 * The latitude of the geographic point. 
	 */
	private double latitude;
	
	/** 
	 * The longitude of the geographic point. 
	 */
	private double longitude;

	/**
	 * Instantiates a new immutable Location with
	 * the given latitude and longitude.
	 *
	 * @param latitude The point latitude
	 * @param longitude The point longitude
	 */
	public Location(double latitude, double longitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}
	
}
