package edu.umn.msse.busbuddy.transit;

/**
 * A Service to calculate a collection of {@link Route}s, or a Trip, allowing
 * for a continuous transit path from a start {@link Location} to an 
 * end {@link Location}.
 */
public interface TripService {
	
	
	/**
	 * Calculate an optimal Trip given a \paramname{start} {@link Location} 
	 * and an \paramname{end} {@link Location}.
	 *
	 * @param start The requested start {@link Location} of the Trip.
	 * @param end The requested end {@link Location} of the Trip.
	 * @return The calculated {@link Trip}
	 */
	public Trip calculateTrip(Location start, Location end);

}
