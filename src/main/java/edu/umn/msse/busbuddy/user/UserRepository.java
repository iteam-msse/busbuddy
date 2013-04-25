package edu.umn.msse.busbuddy.user;

import org.springframework.stereotype.Service;

import edu.umn.msse.busbuddy.common.BusBuddyConflictException;
import edu.umn.msse.busbuddy.common.BusBuddyInternalException;
import edu.umn.msse.busbuddy.common.BusBuddyNotFoundException;
import edu.umn.msse.busbuddy.common.HashUtility;

/**
 * This class is responsible for handling database access for {@link User} objects, and to construct, persist, and
 * retrieve {@link User} objects.
 */
@Service
class UserRepository {
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
	 *             This exception is thrown when there is a database error.
	 * @throws BusBuddyConflictException
	 *             This exception is thrown when the requested user record would create a duplicate username, e-mail
	 *             address, or mobile phone data in the database.
	 */
	User createUser(User user, String password) throws BusBuddyConflictException, BusBuddyInternalException {
		try {
			this.getUserByUsername(user.getUsername());
			throw new BusBuddyConflictException();
		} catch (BusBuddyNotFoundException e) {
		}
		
		try {
			this.getUserByEmail(user.getEmail());
			throw new BusBuddyConflictException();
		} catch (BusBuddyNotFoundException e) {
		}
		
		try {
			this.getUserByMobile(user.getCountryCode(), user.getMobile());
			throw new BusBuddyConflictException();
		} catch (BusBuddyNotFoundException e) {
		}
		
		User newUser = new User(1, user.getUsername());
		String passwordHash = HashUtility.hash(password);
		newUser.setPasswordHash(passwordHash);
		return newUser;
	}

	/**
	 * This method attempts to retrieve a user by id number. The method will take a user id, read the details from the
	 * database, and construct a user object with the given details.
	 * 
	 * @pre A user with the supplied user id exists within the database.
	 * @post A user will be returned whose user id matches the supplied userId parameter.
	 * @param userId
	 *            This is the user ID to look up.
	 * @return The user with the given ID.
	 * @throws BusBuddyInternalException
	 *             This exception is thrown when there is a database error.
	 * @throws BusBuddyNotFoundException
	 *             This exception is thrown when the requested user record could not be found.
	 */
	User getUserById(int userId) throws BusBuddyInternalException, BusBuddyNotFoundException {
		/* TODO */
		return new User(userId, String.valueOf(userId));
	}

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
	 *             This exception is thrown when there is a database error.
	 * @throws BusBuddyNotFoundException
	 *             This exception is thrown when the requested user record could not be found.
	 */
	User getUserByUsername(String username) throws BusBuddyInternalException, BusBuddyNotFoundException {
		/* TODO */
		User user = new User(1, username);
		return user;
	}

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
	 *             This exception is thrown when there is a database error.
	 * @throws BusBuddyNotFoundException
	 *             This exception is thrown when the requested user record could not be found.
	 */
	User getUserByEmail(String email) throws BusBuddyInternalException, BusBuddyNotFoundException {
		/* TODO */
		return new User(1, email);
	}

	/**
	 * This method attempts to retrieve a user by mobile phone number. The method will take a mobile phone number, read
	 * the details from the database, and construct a user object with the given details.
	 * 
	 * @pre A user with the supplied mobile phone number exists within the database.
	 * @post A user will be returned whose mobile phone details match the supplied parameters.
	 * @param countryCode
	 *            This is the country code of the user's mobile phone number.
	 * @param mobile
	 *            This is the remainder of the user's mobile phone number. This string should consist entirely of digits.
	 * @return The user with the given mobile phone details.
	 * @throws BusBuddyInternalException
	 *             This exception is thrown when there is a database error.
	 * @throws BusBuddyNotFoundException
	 *             This exception is thrown when the requested user record could not be found.
	 */
	User getUserByMobile(short countryCode, String mobile) throws BusBuddyInternalException, BusBuddyNotFoundException {
		/* TODO */
		return new User(1, mobile);
	}

	/**
	 * This method updates a user in the database. It will update the user with the same ID as the user passed in as a
	 * parameter. The username will not be updated, but all other fields will be.
	 * 
	 * @pre A user with the specified user ID on the {@link User} object must already exist.
	 * @post User object in database will be updated with the data from the parameter User object.
	 * @param newUserData
	 *            {@link User} object with the new user data on it
	 * @throws BusBuddyInternalException
	 *             This exception is thrown when there is a database error.
	 * @throws BusBuddyNotFoundException
	 *             This exception is thrown when the requested user record could not be found.
	 * @throws BusBuddyConflictException
	 *             This exception is thrown when the requested user record would create a duplicate mobile phone or
	 *             e-mail address in the database.
	 */
	void updateUser(User newUserData) throws BusBuddyInternalException, BusBuddyNotFoundException,
			BusBuddyConflictException {
		/* TODO */
	}

	/**
	 * This method deletes a user from the database. It will delete the user with the same ID as the user passed in as a
	 * parameter.
	 * 
	 * @pre A user with the specified user ID on the {@link User} object must already exist.
	 * @post User object in database will be deleted.
	 * @throws BusBuddyInternalException
	 *             This exception is thrown when there is a database error.
	 * @throws BusBuddyNotFoundException
	 *             This exception is thrown when the requested user record could not be found.
	 */
	void deleteUser(User userToDelete) throws BusBuddyInternalException, BusBuddyNotFoundException {
		/* TODO */
	}
}
