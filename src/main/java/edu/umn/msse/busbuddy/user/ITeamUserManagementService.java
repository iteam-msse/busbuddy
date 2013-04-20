package edu.umn.msse.busbuddy.user;

public class ITeamUserManagementService implements UserManagementService {
	@Override
	public User createUser(User userToCreate, String password) {
		return new User();
	}

	@Override
	public User findUserByUsername(String sessionToken, String username) {
		return new User();
	}

	@Override
	public User findUserByEmail(String sessionToken, String email) {
		return new User();
	}

	@Override
	public User findUserByMobile(String sessionToken, short countryCode, String mobile) {
		return new User();
	}

	@Override
	public void updateUser(String sessionToken, User newUserData, String password) {
	}

	@Override
	public void deleteUser(String sessionToken, User userToDelete) {
	}
	
	protected boolean checkPermissions(String sessionToken) {
		return true;
	}
}
