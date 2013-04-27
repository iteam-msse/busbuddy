package edu.umn.msse.busbuddy.transit;

import java.util.List;

/**
 * A Trip is considered an ordered collection of {@link Route}s going from a 
 * starting point to an ending point. A {@link Trip} can be thought of as a 
 * composition of Routes, and the {@link TripService} is the service 
 * that composes them.
 * 
 * @invariant {@link #routes}.size() > 0
 */
public class Trip {

	/** 
	 * The ordered collection of {@link Route}s that when combined
	 * make a navigable {@link Trip}.
	 */
	private List<Route> routes;
	
	/**
	 * Instantiates a new Trip with the appropriate {@link Route}s.
	 *
	 * @pre \paramname{routes}.size() > 0
	 * 
	 * @param routes The {@link Route}s of this Trip
	 */
	protected Trip(List<Route> routes) {
		super();
		this.routes = routes;
	}

	public List<Route> getRoutes() {
		return routes;
	}

	public void setRoutes(List<Route> routes) {
		this.routes = routes;
	}
	
}
