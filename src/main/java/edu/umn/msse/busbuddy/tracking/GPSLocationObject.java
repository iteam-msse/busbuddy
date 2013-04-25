package edu.umn.msse.busbuddy.tracking;

import java.util.Date;
/**
 * GPS Location is a value object used for GPS coordinates and the time of the last update.
 *
 */
public class GPSLocationObject {
	
	private double latitude;         /**< current GPS latitude */
	private double longitude;        /**< current GPS longitude */
	private Date   lastUpdateTime;   /**< time of last GPS update from device */
	
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

}
