package edu.umn.msse.busbuddy.transit;

import java.util.List;

/**
 * A Route is a {@link TransitVehicle} path of travel, or a "Line," as referred to
 * by a {@link TransitProvider}. A Route can be thought of as an ordered
 * list of {@link Stop}s. 
 * 
 * Note that Routes may add/remove stops, change {@link Stop} times, or be disrupted by
 * {@link Detour}s, while still remaining the same Route.
 */
public class Route {
	
	/**
	 * A unique identifier for this Route.
	 */
	private String routeId;
	
	/**
	 * Text to display in maps and other literature to denote this Route. Uniqueness
	 * is not enforced, but this name should provide enough context to allow users
	 * to distinguish this Route.
	 */
	private String routeName;
	
	/**
	 * And ordered list of {@link Stop}s to be visited in this Route. Stops
	 * must be visited in order unless there is a disruption in service, in
	 * which case clients can expect a {@link RouteDistruptionAlert} and/or
	 * an {@link Detour}.
	 */
	private List<Stop> stops;

	public List<Stop> getStops() {
		return stops;
	}

	public void setStops(List<Stop> stops) {
		this.stops = stops;
	}

	public String getRouteId() {
		return routeId;
	}

	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}

	public String getRouteName() {
		return routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

}
