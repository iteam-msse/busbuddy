package edu.umn.msse.busbuddy.transit;

import java.util.Set;

/**
 * A TransitFeed is an abstraction over a service or set of services that
 * provide information about {@link Route}s. This differs from the
 * {@link TransitService} interface in that a TransitFeed does not expose
 * provenance information such as the {@link TransitService#getTransitlnfo()
 * method.
 * 
 * Because of this, a single {@link TransitService} (or {@link TransitProvider})
 * could use more than one TransitFeed to expose their Transit data. For example,
 * a {@link TransitProvider} could utilize two different database storage schemes,
 * each one represented as a separate TransitFeed, and then aggregate the two 
 * into one {@link TransitService}.
 */
public interface TransitFeed {

	/**
	 * Gets a {@link Route} by its unique identifier.
	 * 
	 * @pre \paramname{routeId} is not null or blank.
	 * @post The {@link Route} is returned if 
	 * the \paramname{routeId} is found, else null.
	 *
	 * @param routeId The unique identifier of the {@link Route}
	 * @return The matching {@link Route}, or null if not found
	 */
	public Route getRoute(String routeId);
	
	/**
	 * Gets all available {@link Route}s that match a \paramname{pickup} 
	 * or \paramname{dropoff} {@link Location} by not more than a given
	 * \paramname{distance}.
	 * 
	 * @pre \paramname{pickup} is not null or blank.
	 * @pre \paramname{dropoff} is not null or blank.
	 * @pre \paramname{distance} is non-negative.
	 * 
	 * @param pickup The requested pickup {@link Location}
	 * @param pickup The requested dropoff {@link Location}
	 * @param distance The distance (in miles) that each {@link Route}
	 * can deviate from the requested \paramname{pickup} or \paramname{dropoff}
	 * {@link Location}. For each {@link Route} returned, neither its start
	 * or end {@link Location} can differ from the requested
	 * \paramname{pickup} or \paramname{dropoff} {@link Location} by more than
	 * the value of the \paramname{distance} parameter.
	 * 
	 * @return The matching {@link Route}s
	 */
	public Set<Route> getRoutes(Location pickup, Location dropoff, int distance);
	
}
