package edu.umn.msse.busbuddy.transit;

import java.util.Set;

/**
 * An Adapter Class to allow a {@GoogleTransitServiceAPI} service to appear as
 * a {@link TransitService}.
 */
public class GoogleTransitServiceAdapter implements TransitFeed {

	/** 
	 * The {@GoogleTransitServiceAPI} to adapt as a {@link TransitService}.
	 */
	private GoogleTransitServiceAPI googleTransitServiceAPI;
	
	/**
	 * Instantiates a new GoogleTransitServiceAdapter with a
	 * {@GoogleTransitServiceAPI} to delegate calls to.
	 *
	 * @param googleTransitServiceAPI the google transit service api
	 */
	public GoogleTransitServiceAdapter(GoogleTransitServiceAPI googleTransitServiceAPI){
		super();
		this.setGoogleTransitServiceAPI(googleTransitServiceAPI);
	}
	
	@Override
	public Route getRoute(String routeId) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Set<Route> getRoutes(Location pickup, Location dropoff, int distance) {
		throw new UnsupportedOperationException();
	}

	public GoogleTransitServiceAPI getGoogleTransitServiceAPI() {
		return googleTransitServiceAPI;
	}

	public void setGoogleTransitServiceAPI(GoogleTransitServiceAPI googleTransitServiceAPI) {
		this.googleTransitServiceAPI = googleTransitServiceAPI;
	}

}
