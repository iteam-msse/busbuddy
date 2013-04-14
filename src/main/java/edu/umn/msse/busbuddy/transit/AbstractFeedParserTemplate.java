package edu.umn.msse.busbuddy.transit;

import java.io.InputStream;
import java.util.Set;

public abstract class AbstractFeedParserTemplate {
	
	private RouteRepository routeRepository;
	
	protected void start(String location){
		InputStream input = this.loadFeed(location);
		Set<Route> routes = this.parseFeed(input);
		this.saveRoutes(routes);
	}

	protected InputStream loadFeed(String location){
		throw new UnsupportedOperationException();
	}
	
	protected abstract Set<Route> parseFeed(InputStream feed);
	
	protected void saveRoutes(Set<Route> routes){
		this.routeRepository.save(routes);
	}
}
