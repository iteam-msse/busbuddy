package edu.umn.msse.busbuddy.user;

public interface UserLoginService {
	User createUser(User userToCreate, String password);
	User findUserByUsername(String sessionToken, String username);
	User findUserByEmail(String sessionToken, String email);
	User findUserByMobile(String sessionToken, short countryCode, String mobile);
	void updateUser(String sessionToken, User newUserData, String password);
	void deleteUser(String sessionToken, User userToDelete);
}
