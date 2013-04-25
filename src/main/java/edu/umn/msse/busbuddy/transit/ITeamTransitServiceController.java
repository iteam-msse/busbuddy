package edu.umn.msse.busbuddy.transit;

import java.net.URL;
import java.util.Set;

import org.springframework.stereotype.Controller;

import edu.umn.msse.busbuddy.alert.controller.AlertRequestController;
import edu.umn.msse.busbuddy.common.BaseController;

/**
 * The iTeam implementation of the {@link TransitService} that exposes Transit
 * data via a REST Service.
 */
@Controller
public class ITeamTransitServiceController 
	extends BaseController implements TransitService, TransitProviderObserver {

	/** 
	 * The {@link TransitFeed} used to provide data to this {@link TransitService}
	 * implementation.
	 * 
	 * Note that this {@link TransitFeed} implementation may be aggregate of many
	 * {@link TransitFeed}s, an Adapter to another API, or other implementation.
	 */
	private TransitFeed transitFeed;
	
	/**
	 * The inter-module dependency to the Alert Module. The {@link AlertRequestController}
	 * accepts requests from this class to inform the Alert Module of a
	 * {@link RouteDisruptionAlert}.
	 */
	private AlertRequestController alertRequestController;
	

	/** After a {@link RouteDisruptionEvent} is received, this class will perform
	 * the following:
	 * 
	 * - Internally register the {@link RouteDisruptionEvent} so that any subsequent requests
	 * for affected {@link Route}s will include appropriate {@link Detour} information.
	 * - Notify the Alert module via the {@link AlertRequestController} of the disruption with the updated
	 * {@link Route}. This updated {@link Route} should include all necessary {@link Detour} information.
	 */
	@Override
	public void handleRouteDisruptionEvent(
			RouteDisruptionEvent routeDisruptionEvent) {
		//
	}

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

	public AlertRequestController getAlertRequestController() {
		return alertRequestController;
	}

	public void setAlertRequestController(AlertRequestController alertRequestController) {
		this.alertRequestController = alertRequestController;
	}

}
