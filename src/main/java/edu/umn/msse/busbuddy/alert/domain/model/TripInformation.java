package edu.umn.msse.busbuddy.alert.domain.model;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import edu.umn.msse.busbuddy.transit.Trip;

/**
 * This model stores the information about a trip as a value object. Hence, we have created and last modified date to
 * track the freshness of data. Currently, the {@link Trip} is referring to the model in Trip module. But we expect this
 * to be stored as a value object and during implementation we can create a copy of its model for alert module.
 */
public class TripInformation {

	/**
	 * Necessary data about a trip. This contains a collection of routes. {@see Trip}
	 */
	private Trip tripData;

	/**
	 * Last date when the trip Information was modified or updated.
	 */
	private Date lastModifiedDate;

	/**
	 * Date when the actual trip was created.
	 */
	private Date createdDate;

	/**
	 * Provides a list of routeId in the {@link Trip} model.
	 * 
	 * @return
	 */
	public List<String> getRouteIds() {
		return null;
	}

	public Trip getTripData() {
		return tripData;
	}

	public void setTripData(Trip tripData) {
		this.tripData = tripData;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}
