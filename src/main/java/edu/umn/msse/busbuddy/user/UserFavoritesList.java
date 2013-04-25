package edu.umn.msse.busbuddy.user;

import java.util.List;

/**
 * This class ties a userId to that user's ordered list of favorites.
 */
public class UserFavoritesList {
	private final int userId;
	private List<FavoriteTransitService> favoriteTransitServices;

	/**
	 * This creates a new UserFavoritesList object. Once created, the userId cannot be modified.
	 * 
	 * @param userId
	 *            userId to link this favorites object to
	 */
	public UserFavoritesList(int userId) {
		this.userId = userId;
	}

	/**
	 * This gets the userId associated with this favorites list.
	 * 
	 * @return userId
	 */
	public int getUserId() {
		return this.userId;
	}

	/**
	 * This retrieves the list of favorite transit services for this user.
	 * 
	 * @return list of favorite transit services
	 */
	public List<FavoriteTransitService> getFavoriteTransitServices() {
		return this.favoriteTransitServices;
	}

	/**
	 * This sets the ordered list of favorite transit services for this user.
	 * 
	 * @param favoriteTransitServices
	 *            list to use
	 */
	public void setFavoriteTransitServices(List<FavoriteTransitService> favoriteTransitServices) {
		this.favoriteTransitServices = favoriteTransitServices;
	}
}
