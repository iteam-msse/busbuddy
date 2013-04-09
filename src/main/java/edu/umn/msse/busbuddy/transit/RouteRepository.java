package edu.umn.msse.busbuddy.transit;

import java.util.Collection;

/**
 * The Interface RouteRepository.
 */
public interface RouteRepository {
	
	/**
	 * Delete.
	 *
	 * @param routId the rout id
	 */
	public void delete(String routId);
	
	/**
	 * Save.
	 *
	 * @param route the route
	 */
	public void save(Route route);

	/**
	 * Read.
	 *
	 * @param routId the rout id
	 */
	public void read(String routId);

	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	public Collection<Route> getAll();

}
