package edu.umn.msse.busbuddy.transit;

import java.util.Set;

/**
 * An InvalidRouteParseException indicates an invalid batch of parsed
 * {@link Route}s has been been detected.
 * 
 * Note that one ore more of the referenced {@link Route}s are invalid,
 * but not necessarily all of them are invalid.
 */
public class InvalidRouteParseException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -4399874766965916500L;
	
	/** 
	 * The failed {@link Route} batch. Handlers of this Exception may
	 * choose to re-validate, fix, and/or retry the operation with an
	 * adjusted batch.
	 */
	private Set<Route> routeBatch;
	
	/**
	 * Instantiates a new invalid route parse exception.
	 *
	 * @param routeBatch the route batch
	 */
	protected InvalidRouteParseException(Set<Route> routeBatch){
		this.setRouteBatch(routeBatch);
	}

	public Set<Route> getRouteBatch() {
		return routeBatch;
	}

	public void setRouteBatch(Set<Route> routeBatch) {
		this.routeBatch = routeBatch;
	}

}
