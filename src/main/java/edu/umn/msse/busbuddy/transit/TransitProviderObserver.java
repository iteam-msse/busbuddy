package edu.umn.msse.busbuddy.transit;

/**
 * An asynchronous update interface for receiving notifications
 * about {@link TransitProvider} {@link Route} disruptions.
 */
public interface TransitProviderObserver {
	
	/**
	 * This method is called when a {@link TransitProvider} fires a
	 * {@link RouteDisruptionEvent} indicating a disruption in normal
	 * services and/or schedules.
	 *
	 * @param routeDisruptionEvent The {@link Route} Disruption Event
	 */
	public void handleRouteDisruptionEvent(RouteDisruptionEvent routeDisruptionEvent);

}
