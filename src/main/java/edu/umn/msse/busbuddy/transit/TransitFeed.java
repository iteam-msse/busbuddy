package edu.umn.msse.busbuddy.transit;

import java.util.Set;

/**
 * The Interface TransitFeed.
 */
public interface TransitFeed {

	public Route getRoute(String routeId);
	
	public Set<Route> getRoutes(Location pickup, Location dropoff, int distance);
	
}
