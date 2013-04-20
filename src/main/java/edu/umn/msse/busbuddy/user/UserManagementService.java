package edu.umn.msse.busbuddy.user;

import org.springframework.stereotype.Controller;

import edu.umn.msse.busbuddy.common.BusBuddyException;

@Controller
public interface UserManagementService {
	User createUser(User userToCreate, String password) throws BusBuddyException;
	User findUserByUsername(String sessionToken, String username) throws BusBuddyException;
	User findUserByEmail(String sessionToken, String email);
	User findUserByMobile(String sessionToken, short countryCode, String mobile) throws BusBuddyException;
	void updateUser(String sessionToken, User newUserData, String password) throws BusBuddyException;
	void deleteUser(String sessionToken, User userToDelete) throws BusBuddyException;
}
