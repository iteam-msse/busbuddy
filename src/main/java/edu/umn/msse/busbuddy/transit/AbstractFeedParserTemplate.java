package edu.umn.msse.busbuddy.transit;

import java.io.InputStream;
import java.net.URL;
import java.util.Set;

/**
 * A Template Method pattern to allow for the import of data from different
 * {@link TransitProvider}s in potentially different formats.
 * 
 * The algorithm sequence is as follows:
 * -# A {@link URL} of a resource location is passed into the {@link #start(URL)} method.
 * This method initiates the parsing/transformation process.
 * -# The {@link #start(URL)} method calls the method {@link #loadFeed(URL)} to
 * establish the InputStream.
 * -# The InputStream returned by {@link #loadFeed(URL)} is passed into the
 * abstract {@link #parseFeed(InputStream)} method. Subclasses will implement this as
 * necessary to produce the resulting {@link Route}s
 * -# The newly created {@link Route}s are saved to the {@link RouteRepository} via the
 * {@link #saveRoutes(Set<Route>)} method.
 */
public abstract class AbstractFeedParserTemplate {
	
	/** The {@link RouteRepository} dependency allows for the persistence of the
	 * parsed {@link Route}s. 
	 */
	private RouteRepository routeRepository;
	
	/**
	 * The start method initiates the process and calls the appropriate methods in the
	 * appropriate order.
	 *
	 * @param location The input data resource location. This may be a local file or a
	 * remote resource.
	 */
	protected void start(URL location){
		InputStream input = this.loadFeed(location);
		Set<Route> routes = this.parseFeed(input);
		this.saveRoutes(routes);
	}

	/**
	 * Converts the resource URL into an InputStream for further processing.
	 *
	 * @pre \paramname{location} exists and has been validated.
	 *
	 * @param location The resource location
	 * @return The resulting InputStream
	 */
	protected InputStream loadFeed(URL location){
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Parses the feed InputStream into a Set of {@link Route}s. Subclasses will
	 * implement this abstract method with the appropriate parsing logic for the
	 * particular input format.
	 *
	 * @param feed The resource InputStream
	 * @return The resulting Set of {@link Route}s
	 */
	protected abstract Set<Route> parseFeed(InputStream feed);
	
	/**
	 * Save the {@link Route}s to the {@link RouteRepository}.
	 *
	 * @pre \paramname{routes} may be an empty Set, but must not be null.
	 *
	 * @param routes The Set of {@link Route}s to persist.
	 */
	protected void saveRoutes(Set<Route> routes){
		this.routeRepository.save(routes);
	}
}
