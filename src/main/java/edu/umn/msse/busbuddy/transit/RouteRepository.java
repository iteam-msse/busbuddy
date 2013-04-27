package edu.umn.msse.busbuddy.transit;

import java.util.Collection;
import java.util.Set;

/**
 * A Repository Pattern supporting lifecycle operations of {@link Route}s,
 * such as Read, Save, Delete, and Query functionality.
 */
public interface RouteRepository {
	
	/**
	 * Deletes the {@link Route} corresponding to the given \paramname{routeId}.
	 * 
	 * @pre A {@link Route} with the given \paramname{routeId}
	 * exists in the Repository.
	 * @post A {@link Route} with the given \paramname{routeId} is removed
	 * from the Repository and is no longer available for retrieval.
	 *
	 * @param routeId
	 */
	public void delete(String routeId);
	
	/**
	 * Saves the {@link Route} to the Repository.
	 *
	 * @pre The {@link Route} has been validated with all appropriate
	 * business rules. @see RouteSpecification
	 * @post The {@link Route} is available for retrieval by id and
	 * also by appropriate Queries.
	 * 
	 * @param route The {@link Route} to save.
	 */
	public void save(Route route);
	
	/**
	 * Saves all of the {@link Route}s to the Repository.
	 *
	 * @pre The {@link Route}s have been validated with all appropriate
	 * business rules. @see RouteSpecification
	 * @post The {@link Route}s are available for retrieval by id and
	 * also by appropriate Queries.
	 * 
	 * @param routes The {@link Route} to save.
	 */
	public void save(Set<Route> routes);

	/**
	 * Read a single {@link Route} from the Repository by its identifier.
	 * 
	 * If no {@link Route} is found with the requested \paramname{routeId},
	 * a null value is returned.
	 *
	 * @param routeId The identifier of the requested {@link Route}
	 * @return The requested {@link Route}
	 */
	public Route read(String routeId);

	/**
	 * Retrieves all available {@link Route}s in the Repository.
	 *
	 * @return All available {@link Route}s.
	 */
	public Collection<Route> getAll();

}
