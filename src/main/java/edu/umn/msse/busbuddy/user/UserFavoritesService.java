package edu.umn.msse.busbuddy.user;

import org.springframework.stereotype.Controller;

import edu.umn.msse.busbuddy.common.BusBuddyException;
import edu.umn.msse.busbuddy.common.BusBuddyInternalException;
import edu.umn.msse.busbuddy.common.BusBuddyNotFoundException;

/**
 * This is the generic BusBuddy UserFavoritesService interface. This interface contains methods dealing with user
 * favorites. It is one of three interfaces that a user module implementation must implement. It can be implemented as a
 * service or as a service client.
 * 
 * Every method call here will (besides createUser) will result in the session's expiration time being updated due to
 * activity on the session.
 */
@Controller
public interface UserFavoritesService {
	/**
	 * This method retrieves the {@link UserFavoritesList} object for the current user of a given session.
	 * 
	 * @pre The userId linked to the session must have already saved favorites.
	 * @param sessionToken
	 *            Session whose user favorites will be retrieved for.
	 * @return Favorites object for the userId that was passed in.
	 * @throws BusBuddyInternalException
	 *             This exception is thrown when there is an internal error.
	 * @throws BusBuddyForbiddenException
	 *             This exception is thrown when the current session is invalidated.
	 * @throws BusBuddyNotFoundException
	 *             This exception is thrown if no data has been saved yet.
	 * @throws BusBuddyBadRequestException
	 *             This exception is thrown when the sesionToken is blank or empty.
	 */
	public UserFavoritesList readFavorites(String sessionToken) throws BusBuddyException;

	/**
	 * This method updates the {@link UserFavoritesList} object for a given user. It creates it if it doesn't exist, and
	 * overwrites it if it does.
	 * 
	 * @param sessionToken
	 *            Session whose user the favorites will be retrieved for.
	 * @param favorties
	 *            Favorites to set.
	 * @throws BusBuddyInternalException
	 *             This exception is thrown when there is an internal error.
	 * @throws BusBuddyForbiddenException
	 *             This exception is thrown when the current session is invalidated.
	 * @throws BusBuddyBadRequestException
	 *             This exception is thrown when the sesionToken is blank or empty, or the userId on the
	 *             UserFavoritesList object passed in doesn't match the session.
	 */
	public void saveFavorites(String sessionToken, UserFavoritesList favorites) throws BusBuddyException;
}
