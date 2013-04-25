package edu.umn.msse.busbuddy.transit;

import java.util.Set;

/**
 * A TransitProvider is a description of a company or organization that is the
 * producer of public transportation services.
 * 
 * Observers may subscribe to a TransitProvider to receive updates on {@link Route}
 * disruptions, such as changes in service availability or schedule.
 */
public abstract class TransitProvider {

	/** 
	 * A unique identifier that globally identifies this TransitProvider. 
	 * 
	 * The actual identifier type is unspecified and left to implementations.
	 * It may be the same as the {@link #name}, if that is sufficient to provide
	 * uniqueness.
	 */
	private String providerId;

	/**
	 * An Observer Pattern mechanism to alert @{link TransitProviderObserver}s of
	 * changes in {@link Route} service;
	 */
	@SuppressWarnings("unused")
	private Set<TransitProviderObserver> transitProviderObserver;
	
	/** 
	 * A text description of the TransitProvider. This is the text that will be
	 * displayed on guides, {@link Route} maps, and advertisements.
	 */
	private String name;

	/**
	 * This method is called internally by the TransitProvider to fire a
	 * {@link RouteDisruptionEvent}. TransitProvider subclasses
	 * will determine when these Events are fired -- for example, if a
	 * TransitProvider has scheduled maintenance days, or known outages due to
	 * mechanical breakdown.
	 * 
	 * After a {@link RouteDisruptionEvent} is fired, this class will perform
	 * the following:
	 * 
	 * - Notify all {@link TransitProviderObserver}s of the disruption with the updated
	 * {@link Route}. This updated {@link Route} should include all necessary {@link Detour}
	 * information.
	 */
	protected abstract void fireRouteDistruptionEvent();
	
	public String getProviderId() {
		return providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void registerObserver(TransitProviderObserver transitProviderObserver) {
		//
	}

	public void unregisterObserver(TransitProviderObserver transitProviderObserver) {
		//
	}

}
