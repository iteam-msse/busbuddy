package edu.umn.msse.busbuddy.transit;

import java.net.URL;
import java.util.Set;

/**
 * The TransitService is an interface to get {@link Route}/{@link Fare}/{@link Detour} 
 * information from a {@link TransitProvider}. This service will provide a consistent 
 * interface for the application logic to query to get this information.
 */
public interface TransitService {

	/**
	 * Gets the route.
	 * 
	 * @pre \paramname{routeId} is not null or blank.
	 * @post The {@link Route} is returned if 
	 * the \paramname{routeId} is found, else null.
	 *
	 * @param routeId the route id
	 * @return the route
	 */
	public Route getRoute(String routeId);
	
	/**
	 * Gets the routes.
	 *
	 * @param pickup the pickup
	 * @param distance the distance
	 * @return the routes
	 */
	public Set<Route> getRoutes(Location pickup, int distance);
	
	public TransitInfo getTransitlnfo();
	
	public URL getServiceURL();
}
