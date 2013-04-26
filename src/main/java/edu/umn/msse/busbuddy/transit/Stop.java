package edu.umn.msse.busbuddy.transit;

import java.util.Date;
import java.util.Set;

import edu.umn.msse.busbuddy.tracking.TransitVehicle;

/**
 * A point on a {@link Route} in which a 
 * {@link edu.umn.msse.busbuddy.tracking.TransitVehicle TransitVehicle} will stop to pick
 * up and drop off passengers. A Stop also is responsible for providing a set of
 * the times in which the {@link TransitVehicle} will be at the Stop.
 * 
 * A Stop is identified within the context of a single {@link Route}. This
 * means that two {@link Route}s may share the same physical Stop {@link #location},
 * but maintain different schedules.
 */
public class Stop {
	
	/**
	 * A unique identifier for this Stop. In some cases, it could be a String
	 * representation of the {@link #location} - or possibly the {@link description}.
	 * 
	 * As a Stop is part of the {@link Route} Aggregate, this identifier needs only
	 * be unique within the context of a {@link Route}.
	 */
	private String stopId;
	
	/**
	 * A short text-based description of describing the Stop and its location.
	 * 
	 * This could be an intersection: 
	 * 	- "18th Ave and 58th St."
	 * or a landmark/park/attraction:
	 *  - "Como Zoo North Entrance"
	 * or other identifying text.
	 * 
	 * This description should be sufficient enough to allow a user to to find
	 * the given Stop without necessarily needing the {@link Location} information.
	 */
	private String description;
	
	/**
	 * The physical location of the Stop.
	 */
	private Location location;
	
	/**
	 * Whether or not this Stop is protected by some sort of enclosure. The type of
	 * enclosure required to constitute 'covered' defined by each {@link TransitProvider},
	 * but at a minimum there should be a roof protecting the immediate area before riders
	 * board the vehicle.
	 */
	private boolean covered;

	/**
	 * Instantiates a new Stop with all the mandatory fields.
	 *
	 * @param stopId The unique identifier
	 * @param description The description
	 * @param location The {@link Location}
	 */
	protected Stop(String stopId, String description, Location location) {
		super();
		this.stopId = stopId;
		this.description = description;
		this.location = location;
	}

	/**
	 * Reports the expected times in which a 
	 * {@link edu.umn.msse.busbuddy.tracking.TransitVehicle TransitVehicle} will be
	 * at the given Stop for a given time period.
	 * 
	 * @pre \paramname{begin} < \paramname{end}.
	 *
	 * @param begin The start of the reporting time period. All Stop Times returned
	 * will be on (or after) this time. If null, assume to be the current time.
	 * 
	 * @param end The end of the reporting time period. All Stop Times returned
	 * will before this time.
	 * 
	 * @return Stop Times associated with this Stop that satisfy the begin and end
	 * criteria.
	 */
	public Set<Date> getStopTimes(Date begin, Date end){
		throw new UnsupportedOperationException();
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStopId() {
		return stopId;
	}

	public void setStopId(String stopId) {
		this.stopId = stopId;
	}

	public boolean isCovered() {
		return covered;
	}

	public void setCovered(boolean covered) {
		this.covered = covered;
	}

}
