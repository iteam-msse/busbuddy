package edu.umn.msse.busbuddy.user;

import org.springframework.stereotype.Controller;

import edu.umn.msse.busbuddy.common.BusBuddyException;

/**
 * This is the generic BusBuddy UserManagementService interface. This interface contains methods dealing with user
 * account management. It is one of three interfaces that a user module implementation must implement. It can be
 * implemented as a service or as a service client.
 */
@Controller
public interface UserManagementService {
	User createUser(User userToCreate, String password) throws BusBuddyException;

	User findUserByUsername(String sessionToken, String username) throws BusBuddyException;

	User findUserByEmail(String sessionToken, String email);

	User findUserByMobile(String sessionToken, short countryCode, String mobile) throws BusBuddyException;

	void updateUser(String sessionToken, User newUserData, String password) throws BusBuddyException;

	void deleteUser(String sessionToken, User userToDelete) throws BusBuddyException;
}
