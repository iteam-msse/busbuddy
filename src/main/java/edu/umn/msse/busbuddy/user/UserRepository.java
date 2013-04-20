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

	User getUserById(int userId) {
		return new User(userId, String.valueOf(userId));
	}

	/**
	 * This method attempts to retrieve a user by username. It is not case sensitive. The method will take a username,
	 * read the details from the database, and construct a user object with the given details.
	 * 
	 * @param username
	 *            This is the username to look up.
	 * @return The user with the given username.
	 * @post A user will be returned whose username matches the supplied username parameter.
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

	User getUserByEmail(String email) {
		return new User(1, email);
	}

	User getUserByMobile(short countryCode, String mobile) {
		return new User(1, mobile);
	}

	void updateUser(User newUserData) {

	}

	void deleteUser(User userToDelete) {

	}
}
