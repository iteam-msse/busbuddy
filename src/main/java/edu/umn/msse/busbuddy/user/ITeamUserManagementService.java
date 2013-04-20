package edu.umn.msse.busbuddy.user;

public class ITeamUserManagementService implements UserManagementService {
	@Override
	public String login(String username, String password) {
		return "SESSION_TOKEN";
	}

	@Override
	public void logout(String sessionToken) {
	}

	@Override
	public User getUser(String sessionToken) {
		return new User();
	}

	@Override
	public String createAlertSession(String sessionToken) {
		return "SESSION_TOKEN";
	}

	@Override
	public void sendUsername(String email) {
	}

	@Override
	public void sendUsername(short countryCode, String mobile) {
	}

	@Override
	public void resetPassword(String username, String email) {
	}

	@Override
	public void resetPassword(String username, short countryCode, String mobile) {
	}
}
