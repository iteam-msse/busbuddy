package edu.umn.msse.busbuddy.user;

import java.util.List;

/**
 * This class is a single transit service in a user's list of favorites.  If just the routes are favorites, and not the
 * service, then the favoriteTransitService boolean can be set to false.  Likewise, if just the transit service is a
 * favorite, and there are no favorite routes, the list of favorite routes can be empty.
 */
public class FavoriteTransitService {
	private final String transitServiceUrl;
	private boolean favoriteTransitService;
	private List<String> favoriteRouteIds;

	/**
	 * This creates a new favorites entry.  Once created, the service URL cannot be changed.
	 * @param transitServiceUrl URL to the transit service represented by this object
	 */
	public FavoriteTransitService(String transitServiceUrl) {
		this.transitServiceUrl = transitServiceUrl;
	}
	
	/**
	 * This retrieves the transit service URL associated with the transit service represented by this object.
	 * @return transit service URL
	 */
	public String getTransitServiceUrl() {
		return this.transitServiceUrl;
	}
	
	/**
	 * This retrieves whether this transit service itself is a favorite.
	 * @return true if it is, false if it is just a container object for favorite routes
	 */
	public boolean isFavoriteTransitService() {
		return this.favoriteTransitService;
	}
	
	/**
	 * This sets whether this transit service itself is a favorite.
	 * @param favoriteTransitService true if it is, false if it is just a container object for favorite routes
	 */
	public void setFavoriteTransitService(boolean favoriteTransitService) {
		this.favoriteTransitService = favoriteTransitService;
	}
	
	/**
	 * This retrieves the ordered list of favorite routes for this transit service.
	 * @return ordered list of favorite route IDs
	 */
	public List<String> getFavoriteRouteIds() {
		return this.favoriteRouteIds;
	}
	
	/**
	 * This sets the ordered list of favorite routes for this transit service.
	 * @param favoriteRouteIds ordered list of favorite route IDs
	 */
	public void setFavoriteRouteIds(List<String> favoriteRouteIds) {
		this.favoriteRouteIds = favoriteRouteIds;
	}
}
