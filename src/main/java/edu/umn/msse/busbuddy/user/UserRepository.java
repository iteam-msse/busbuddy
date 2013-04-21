package edu.umn.msse.busbuddy.user;

import org.springframework.stereotype.Service;

import edu.umn.msse.busbuddy.common.BusBuddyInternalException;
import edu.umn.msse.busbuddy.common.BusBuddyNotFoundException;

/**
 * This class is responsible for handling database access for {@link User} objects, and to construct, persist, and
 * retrieve {@link User} objects.
 */
@Service
class UserRepository {
	User createUser(String username, String password) {
		return new User(1, username);
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
	 *            This is the remainder of the user's mobile phone numer. This string should consist entirely of digits.
	 * @return The user with the given mobile phone details.
	 * @throws BusBuddyInternalException
	 *             This exception is thrown when there is a database error.
	 * @throws BusBuddyNotFoundException
	 *             This exception is thrown when the requested user record could not be found.
	 */
	User getUserByMobile(short countryCode, String mobile) throws BusBuddyInternalException, BusBuddyNotFoundException {
		return new User(1, mobile);
	}

	void updateUser(User newUserData) {

	}

	void deleteUser(User userToDelete) {

	}
}
