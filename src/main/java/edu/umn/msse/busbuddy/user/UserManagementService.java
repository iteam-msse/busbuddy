package edu.umn.msse.busbuddy.user;

import org.springframework.stereotype.Controller;

import edu.umn.msse.busbuddy.common.BusBuddyConflictException;
import edu.umn.msse.busbuddy.common.BusBuddyException;
import edu.umn.msse.busbuddy.common.BusBuddyForbiddenException;
import edu.umn.msse.busbuddy.common.BusBuddyInternalException;
import edu.umn.msse.busbuddy.common.BusBuddyNotFoundException;

/**
 * This is the generic BusBuddy UserManagementService interface. This interface contains methods dealing with user
 * account management. It is one of three interfaces that a user module implementation must implement. It can be
 * implemented as a service or as a service client.
 * 
 * Every method call here will (besides createUser) will result in the session's expiration time being updated due to
 * activity on the session.
 */
@Controller
public interface UserManagementService {
	/**
	 * This method creates a user in the database.
	 * 
	 * @pre No other user with this username, e-mail address, or mobile phone exists.
	 * @post User is created with the given user data.
	 * @param user
	 *            User data of the user to create (the ID will be ignored).
	 * @param password
	 *            Password of the user to create.
	 * @return new user object
	 * @throws BusBuddyInternalException
	 *             This exception is thrown when an internal error prevents creation of the user.
	 * @throws BusBuddyConflictException
	 *             This exception is thrown when the requested user record would create a duplicate username, e-mail
	 *             address, or mobile phone data in the database.
	 */
	User createUser(User userToCreate, String password) throws BusBuddyException;

	/**
	 * This method attempts to retrieve a user by username. It is not case sensitive. The method will take a username,
	 * read the details from the database, and construct a user object with the given details.
	 * 
	 * @pre A user with the supplied username exists within the database.
	 * @post A user will be returned whose username matches the supplied username parameter.
	 * @param username
	 *            This is the username to look up.
	 * @return The user with the given username.
	 * @throws BusBuddyInternalException
	 *             An internal error prevents execution of the request.
	 * @throws BusBuddyForbiddenException
	 *             The currently logged in user does not have permission to view the result of this search.
	 * @throws BusBuddyNotFoundException
	 *             This exception is thrown when the requested user record could not be found.
	 */
	User findUserByUsername(String sessionToken, String username) throws BusBuddyException;

	/**
	 * This method attempts to retrieve a user by e-mail address. It is not case sensitive. The method will take an
	 * e-mail address, read the details from the database, and construct a user object with the given details.
	 * 
	 * @pre A user with the supplied e-mail address exists within the database.
	 * @post A user will be returned whose e-mail address matches the supplied e-mail address parameter.
	 * @param email
	 *            This is the e-mail address to look up.
	 * @return The user with the given e-mail address.
	 * @throws BusBuddyInternalException
	 *             An internal error prevents execution of the request.
	 * @throws BusBuddyForbiddenException
	 *             The currently logged in user does not have permission to view the result of this search.
	 * @throws BusBuddyNotFoundException
	 *             This exception is thrown when the requested user record could not be found.
	 */
	User findUserByEmail(String sessionToken, String email) throws BusBuddyException;

	/**
	 * This method attempts to retrieve a user by mobile phone number. The method will take a mobile phone number, read
	 * the details from the database, and construct a user object with the given details.
	 * 
	 * @pre A user with the supplied mobile phone number exists within the database.
	 * @post A user will be returned whose mobile phone details match the supplied parameters.
	 * @param countryCode
	 *            This is the country code of the user's mobile phone number.
	 * @param mobile
	 *            This is the remainder of the user's mobile phone number. This string should consist entirely of
	 *            digits.
	 * @return The user with the given mobile phone details.
	 * @throws BusBuddyInternalException
	 *             An internal error prevents execution of the request.
	 * @throws BusBuddyForbiddenException
	 *             The currently logged in user does not have permission to view the result of this search.
	 * @throws BusBuddyNotFoundException
	 *             This exception is thrown when the requested user record could not be found.
	 */
	User findUserByMobile(String sessionToken, short countryCode, String mobile) throws BusBuddyException;

	/**
	 * This method updates a user in the database. It will update the user with the same ID as the user passed in as a
	 * parameter. The username will not be updated, but all other fields will be.
	 * 
	 * @pre A user with the specified user ID on the {@link User} object must already exist.
	 * @post User object in database will be updated with the data from the parameter User object.
	 * @param sessionToken
	 *            session token for the currently logged in user
	 * @param newUserData
	 *            {@link User} object with the new user data on it
	 * @param password
	 *            New password to set on the user.
	 * @throws BusBuddyInternalException
	 *             This exception is thrown when there is an internal error preventing execution of the request.
	 * @throws BusBuddyForbiddenException
	 *             This exception is thrown if the session token is invalid, linked to an expired session, or the user
	 *             does not have permission to make this change.
	 * @throws BusBuddyNotFoundException
	 *             This exception is thrown when the targeted user to receive the update does not exist.
	 * @throws BusBuddyConflictException
	 *             This exception is thrown when the requested change would create a duplicate mobile phone or e-mail
	 *             address in the database.
	 */
	void updateUser(String sessionToken, User newUserData, String password) throws BusBuddyException;

	/**
	 * This method deletes a user from the database. It will delete the user with the same ID as the user passed in as a
	 * parameter.
	 * 
	 * @pre A user with the specified user ID on the {@link User} object must already exist.
	 * @post User object in database will be deleted.
	 * @param sessionToken
	 *            session token for the currently logged in user
	 * @param userToDelete
	 *            This user object should have the same ID as the user to be deleted.
	 * @throws BusBuddyInternalException
	 *             This exception is thrown when there is an internal error preventing execution of the request.
	 * @throws BusBuddyForbiddenException
	 *             This exception is thrown if the session token is invalid, linked to an expired session, or the user
	 *             does not have permission to make this change.
	 * @throws BusBuddyNotFoundException
	 *             This exception is thrown if the targeted user is not found in the database.
	 */
	void deleteUser(String sessionToken, User userToDelete) throws BusBuddyException;
}
