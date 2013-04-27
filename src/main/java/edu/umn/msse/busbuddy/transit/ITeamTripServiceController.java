package edu.umn.msse.busbuddy.transit;

import org.springframework.stereotype.Controller;

import edu.umn.msse.busbuddy.common.BaseController;

/**
 * An iTeam implementation of the {@link TripService} that exposes
 * {@link Trip} data via a REST Service.
 * 
 * Note: The actual {@link Trip} calculation algorithm is not specified here
 * and is beyond the scope of this project.
 * 
 * Errors should be communicated via standard HTTP error codes. 
 * The {@link common.BaseController} will be 
 * responsible for mapping Exception types to HTTP error codes, so 
 * actual error codes are not specified explicitly here.
 */
@Controller
public class ITeamTripServiceController extends BaseController implements TripService {

	/** 
	 * The {@link TransitService} used to provide the {@link Route} data
	 * used in the {@link Trip} calculations.
	 */
	private TransitService transitService;
	
	@Override
	public Trip calculateTrip(Location start, Location end) {
		throw new UnsupportedOperationException();
	}

	public TransitService getTransitService() {
		return transitService;
	}

	public void setTransitService(TransitService transitService) {
		this.transitService = transitService;
	}

}
