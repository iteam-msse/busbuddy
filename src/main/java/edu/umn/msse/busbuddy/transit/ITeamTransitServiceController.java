package edu.umn.msse.busbuddy.transit;

import java.net.URL;
import java.util.Set;

import org.springframework.stereotype.Controller;

import edu.umn.msse.busbuddy.common.BaseController;

/**
 * The iTeam implementation of the {@link TransitService} that exposes Transit
 * data via a REST Service.
 */
@Controller
public class ITeamTransitServiceController extends BaseController implements TransitService {

	/** 
	 * The {@link TransitFeed} used to provide data to this {@link TransitService}
	 * implementation.
	 * 
	 * Note that this {@link TransitFeed} implementation may be aggregate of many
	 * {@link TransitFeed}s, an Adapter to another API, or other implementation.
	 */
	private TransitFeed transitFeed;

	@Override
	public Route getRoute(String routeId) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Set<Route> getRoutes(Location pickup, Location dropoff, int distance) {
		throw new UnsupportedOperationException();
	}

	@Override
	public TransitInfo getTransitlnfo() {
		throw new UnsupportedOperationException();
	}

	@Override
	public URL getServiceURL() {
		throw new UnsupportedOperationException();
	}

	public TransitFeed getTransitFeed() {
		return transitFeed;
	}

	public void setTransitFeed(TransitFeed transitFeed) {
		this.transitFeed = transitFeed;
	}

}
