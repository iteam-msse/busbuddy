package edu.umn.msse.busbuddy.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ITeamUserManagementService implements UserManagementService {
	@Autowired
	protected UserRepository userRepository;
	
	@Override
	public User createUser(User userToCreate, String password) {
		return new User(1, userToCreate.getUsername());
	}

	@Override
	public User findUserByUsername(String sessionToken, String username) {
		return new User(1, username);
	}

	@Override
	public User findUserByEmail(String sessionToken, String email) {
		return new User(1, email);
	}

	@Override
	public User findUserByMobile(String sessionToken, short countryCode, String mobile) {
		return new User(1, mobile);
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
