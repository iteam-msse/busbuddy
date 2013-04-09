package edu.umn.msse.busbuddy.transit;

/**
 * The Interface TripService.
 */
public interface TripService {
	
	
	/**
	 * Calculate trip.
	 *
	 * @param start the start
	 * @param end the end
	 * @return the {@link Trip}
	 */
	public Trip calculateTrip(Location start, Location end);

}
