package edu.umn.msse.busbuddy.transit;

import java.util.Set;

/**
 * A disruption in service due to an unexpected event.
 * 
 * TODO
 */
public class Detour {
	
	private String cause;
	
	private int estimatedDelay;
	
	private Set<Stop> effectedStops;

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

	public Set<Stop> getEffectedStops() {
		return effectedStops;
	}

	public void setEffectedStops(Set<Stop> effectedStops) {
		this.effectedStops = effectedStops;
	}
	
}
