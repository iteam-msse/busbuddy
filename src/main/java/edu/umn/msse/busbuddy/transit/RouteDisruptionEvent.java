package edu.umn.msse.busbuddy.transit;

/**
 * An event indicating a disruption in normal {@link Route} scheduling
 * or service. This event will be initiated by a {@link TransitProvider}
 * in cases of mechanical failure, scheduled maintenance, infrastructure
 * delays such as construction or road closures, etc.
 * 
 * Note that a RouteDisruptionEvent can signal that a {@link Route} is
 * returning back to normal service after the disruption has cleared. This
 * is done by sending a {@link Route} with no {@link Detour}s.
 */
public class RouteDisruptionEvent {
	
	/** 
	 * The disrupted {@link Route}, complete with any {@link Detour}
	 * information that is available.
	 */
	private Route disruptedRoute;
	
	/**
	 * Instantiates a new route disruption event with the affected {@link Route}.
	 *
	 * @param disruptedRoute The Disrupted {@link Route}
	 */
	public RouteDisruptionEvent(Route disruptedRoute){
		//
	}

	public Route getDisruptedRoute() {
		return disruptedRoute;
	}

	public void setDisruptedRoute(Route disruptedRoute) {
		this.disruptedRoute = disruptedRoute;
	}

}
