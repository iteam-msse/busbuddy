package edu.umn.msse.busbuddy.transit;

import java.util.Set;

/**
 * A disruption in service due to an unexpected event. A Detour may not affect all
 * {@link Stop}s in a {@link Route}, as a Detour may only alter portions of the
 * {@link Route}. Any affected {@link Stop} will be listed in the {@link #affectedStops}
 * attribute.
 */
public class Detour {
	
	/** 
	 * A text-based description of the cause of the Detour, intended to be displayed
	 * to customers. If null or blank, the cause is considered Unspecified or Unknown.
	 */
	private String cause;
	
	/** 
	 * The estimated time (in minutes) that each of the {@link Stop}s in the
	 * {@link #affectedStops} will be delayed.
	 */
	private int estimatedDelay;
	
	/** 
	 * All {@link Stop}s that are subject to the noted {@link #estimatedDelay}.
	 */
	private Set<Stop> affectedStops;

	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

	public int getEstimatedDelay() {
		return estimatedDelay;
	}

	public void setEstimatedDelay(int estimatedDelay) {
		this.estimatedDelay = estimatedDelay;
	}

	public Set<Stop> getAffectedStops() {
		return affectedStops;
	}

	public void setAffectedStops(Set<Stop> affectedStops) {
		this.affectedStops = affectedStops;
	}
	
}
