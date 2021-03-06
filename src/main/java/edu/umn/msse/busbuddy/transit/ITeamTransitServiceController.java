package edu.umn.msse.busbuddy.transit;

import java.net.URL;
import java.util.Set;

import org.springframework.stereotype.Controller;

import edu.umn.msse.busbuddy.alert.controller.AlertRequestController;
import edu.umn.msse.busbuddy.common.BaseController;

/**
 * The iTeam implementation of the {@link TransitService} that exposes Transit
 * data via a REST Service.
 * 
 * Note that this is intended to receive and respond to HTTP requests via JSON.
 * The actual Object -> JSON transformation, as well as the specification of
 * HTTP REST URLs is left to the development phase and is not specified here.
 * 
 * Errors should be communicated via standard HTTP error codes. 
 * The {@link common.BaseController} will be responsible 
 * for mapping Exception types to HTTP error codes, so actual error codes are 
 * not specified explicitly here.
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
	 * The inter-module dependency to the Alert Module. The
	 * {@link edu.umn.msse.busbuddy.tracking.TransitVehicle AlertRequestController}
	 * accepts requests from this class to inform the Alert Module of a
	 * {@link RouteDisruptionAlert}.
	 * 
	 * NOTE: This represents a conceptual dependency to the 
	 * {@link edu.umn.msse.busbuddy.alert.controller.AlertRequestController AlertRequestController}.
	 * During implementation phase, actual communication with the 
	 * {@link edu.umn.msse.busbuddy.alert.controller.AlertRequestController AlertRequestController}
	 * will happen via some client object or service. Implementation of the actual client and
	 * its link to the 
	 * {@link edu.umn.msse.busbuddy.alert.controller.AlertRequestController AlertRequestController} (to include REST URLS and JSON structure)
	 * will be left to the next phase, or as design details for the development team.
	 */
	private AlertRequestController alertRequestController;
	

	/** After a {@link RouteDisruptionEvent} is received, this class will perform
	 * the following:
	 * 
	 * - Internally register the {@link RouteDisruptionEvent} so that any subsequent requests
	 * for affected {@link Route}s will include appropriate {@link Detour} information.
	 * - Notify the Alert module via the 
	 * {@link edu.umn.msse.busbuddy.alert.controller.AlertRequestController AlertRequestController} of the disruption with the updated
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
