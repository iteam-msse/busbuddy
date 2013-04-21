package edu.umn.msse.busbuddy.transit;

import java.util.Set;

/**
 * An implementation of the {@link TransitFeed} interface that communicates
 * with a {@link RouteRepository} to retrieve its data.
 * 
 * This implementation is appropriate when a retrieving data from a
 * {@link TransitProvider} that does not already supply an external API
 * that can be used at runtime. If the data needs to be parsed and imported
 * into a {@link RouteRepository}, this implementation will expose that
 * persisted data as a {@link TransitFeed}.
 */
public class PersistedTransitFeed implements TransitFeed {

	/**
	 * The {@link RouteRepository} responsible for providing data.
	 */
	private RouteRepository routeRepository;
	
	@Override
	public Route getRoute(String routeId) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Set<Route> getRoutes(Location pickup, Location dropoff, int distance) {
		throw new UnsupportedOperationException();
	}

	public RouteRepository getRouteRepository() {
		return routeRepository;
	}

	public void setRouteRepository(RouteRepository routeRepository) {
		this.routeRepository = routeRepository;
	}

}
