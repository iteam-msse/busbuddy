package edu.umn.msse.busbuddy.transit;

import java.net.URL;
import java.util.Set;

import edu.umn.msse.busbuddy.common.BusBuddyNotFoundException;

/**
 * The TransitService is an interface to get {@link Route}/{@link Fare}/{@link Detour} 
 * information from a {@link TransitProvider}. This service will provide a consistent 
 * interface for the application logic to query to get this information.
 */
public interface TransitService {

	/**
	 * Gets a {@link Route} by its unique identifier.
	 *
	 * @param routeId The unique identifier of the {@link Route}
	 * 
	 * @return The matching {@link Route}
	 * @pre \paramname{routeId} is not null or blank.
	 * @post The {@link Route} is returned if
	 * the \paramname{routeId} is found, else null.
	 * 
	 * @throws BusBuddyNotFoundException 
	 * 				Thrown if the Route with the given \paramname{routeId} is not found.
	 */
	public Route getRoute(String routeId) throws BusBuddyNotFoundException;
	
	/**
	 * Gets all available {@link Route}s that match a \paramname{pickup}
	 * or \paramname{dropoff} {@link Location} by not more than a given
	 * \paramname{distance}.
	 *
	 * @param pickup The requested dropoff {@link Location}
	 * @param dropoff the dropoff
	 * @param distance The distance (in miles) that each {@link Route}
	 * can deviate from the requested \paramname{pickup} or \paramname{dropoff}
	 * @return The matching {@link Route}s
	 * @pre \paramname{pickup} is not null or blank.
	 * @pre \paramname{dropoff} is not null or blank.
	 * @pre \paramname{distance} is non-negative.
	 * {@link Location}. For each {@link Route} returned, neither its start
	 * or end {@link Location} can differ from the requested
	 * \paramname{pickup} or \paramname{dropoff} {@link Location} by more than
	 * the value of the \paramname{distance} parameter.
	 */
	public Set<Route> getRoutes(Location pickup, Location dropoff, int distance);
	
	/**
	 * Gets metadata about the Transit Authority providing the
	 * information retrieved from this service.
	 * 
	 * @return The {@link TransitInfo} of the Transit Authority of this service.
	 */
	public TransitInfo getTransitlnfo();
	
	/**
	 * The URL that uniquely identifies this TransitService. In a REST environment,
	 * this might be the root of the REST API path.
	 * 
	 * @return The URL of this service
	 */
	public URL getServiceURL();
	
}
