package edu.umn.msse.busbuddy.transit;

import java.net.URL;

/**
 * An Alert indicating a disruption of normal {@link Route} availability
 * or scheduling. Clients interested in more specific information about
 * the disruption, including cause and affected {@link Stop}s, should
 * use the getTransitServiceUrl() method to establish a link to 
 * the appropriate {@link TransitService}, and then obtain the affected
 * {@link Route} using the routeId from the getRouteId() method.
 * 
 * Once retrieved, current {@link Detour} information can be accessed
 * via the {@link Route} getDetours() method on the given {@link Route}.
 * This method, upon subsequent retrievals of the {@link Route}, will
 * return an empty set when all {@link Detour}s have cleared. 
 */
public class RouteDisruptionAlert {

	/**
	 * The URL callback of the originating {@link TransitService}. Clients
	 * should use this URL to obtain further disruption information,
	 * such as {@link Detour}s of the affected {@link Route}.
	 */
	private URL transitServiceUrl;
	
	/**
	 * The unique identifier of the affected {@link Route}. This can be used
	 * in the {@link TransitService} method getRoute
	 * to retrieve more information about the disruption.
	 */
	private String routeId;

	public URL getTransitServiceUrl() {
		return transitServiceUrl;
	}

	public void setTransitServiceUrl(URL transitServiceUrl) {
		this.transitServiceUrl = transitServiceUrl;
	}

	public String getRouteId() {
		return routeId;
	}

	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}
	
}
