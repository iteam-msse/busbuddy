package edu.umn.msse.busbuddy.utility;

import java.net.URL;
import java.util.Date;

import edu.umn.msse.busbuddy.transit.Location;
/** 
 * User tracking alert information obtained from the user interface when the user registers for an alert.
 */
public class UserTrackingAlertObject {
	
	public enum AlertType {TRACKING, DELAY}
	
	private URL transitCoInfo;
	private int routeID;
	private Location stopLocation;
	private Date scheduledTime;
	private Date alertTime;
	private String userContactInfo;
	private AlertType type;
	/**
	 * Return the route identifier.
	 * @return - integer the route ID this where vehicle is registered.
	 */
	public int getRouteID() {
		return routeID;
	}
	/**
	 * Set the route identifier, obtained by translating the user interface route description drop down to the transit information route id.
	 * @param routeID - integer route identification 
	 */
	public void setRouteID(int routeID) {
		this.routeID = routeID;
	}
	/**
	 * Get the latitude and longitude of the vehicle stop.
	 * @return - Location value object with GPS latitude and longitude coordinates of the stop.
	 */
	public Location getStopLocation() {
		return stopLocation;
	}
	/**
	 * Set the vehicle stop GPS coordinates with information uploaded by a transit company.
	 * @param stopLocation - Location GPS coordinates of stop location
	 */
	public void setStopLocation(Location stopLocation) {
		this.stopLocation = stopLocation;
	}
	/**
	 * The time a vehicle is scheduled to be at this stop.
	 * @return - Date and time the vehicle is expected to arrive at a stop.
	 */
	public Date getScheduledTime() {
		return scheduledTime;
	}
	/**
	 * Time vehicle is expected at a stop.  Obtained from information uploaded by a transit company. Used for determining delay alerts.
	 * @param scheduledTime Date and time the vehicle is expected to arrive at a stop.
	 */
	public void setScheduledTime(Date scheduledTime) {
		this.scheduledTime = scheduledTime;
	}
	public Date getAlertTime() {
		return alertTime;
	}
	public void setAlertTime(Date alertTime) {
		this.alertTime = alertTime;
	}
	public String getUserContactInfo() {
		return userContactInfo;
	}
	public void setUserContactInfo(String userContactInfo) {
		this.userContactInfo = userContactInfo;
	}
	public AlertType getType() {
		return type;
	}
	public void setType(AlertType type) {
		this.type = type;
	}
	public URL getTransitCoInfo() {
		return transitCoInfo;
	}
	public void setTransitCoInfo(URL transitCoInfo) {
		this.transitCoInfo = transitCoInfo;
	}

}
