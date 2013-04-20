package edu.umn.msse.busbuddy.user;

public interface UserLoginService {
	String login(String username, String password);
	void logout(String sessionToken);
	User getUser(String sessionToken);
	String createAlertSession(String sessionToken);
	void sendUsername(String email);
	void sendUsername(short countryCode, String mobile);
	void resetPassword(String username, String email);
	void resetPassword(String username, short countryCode, String mobile);
}
