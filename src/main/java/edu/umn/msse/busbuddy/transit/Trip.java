package edu.umn.msse.busbuddy.transit;

import java.util.Collection;

/**
 * A Trip is considered an ordered collection of {@link Route}s going from a 
 * starting point to an ending point. A {@link Trip} can be thought of as a 
 * composition of Routes, and the {@link TripService} is the service 
 * that composes them.
 */
public class Trip {

	/** 
	 * The ordered collection of {@link Route}s that when combined
	 * make a navigable {@link Trip}.
	 */
	private Collection<Route> routes;

	public Collection<Route> getRoutes() {
		return routes;
	}

	public void setRoutes(Collection<Route> routes) {
		this.routes = routes;
	}
	
}
