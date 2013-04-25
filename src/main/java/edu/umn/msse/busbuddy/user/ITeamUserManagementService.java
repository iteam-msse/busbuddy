package edu.umn.msse.busbuddy.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import edu.umn.msse.busbuddy.common.BusBuddyConflictException;
import edu.umn.msse.busbuddy.common.BusBuddyException;
import edu.umn.msse.busbuddy.common.BusBuddyForbiddenException;
import edu.umn.msse.busbuddy.common.BusBuddyNotFoundException;
import edu.umn.msse.busbuddy.common.HashUtility;

/**
 * This is the iTeam's implementation of {@link UserManagementService}.
 */
@Controller
public class ITeamUserManagementService implements UserManagementService {
	@Autowired
	protected ITeamUserLoginService userLoginService;

	@Autowired
	protected UserRepository userRepository;

	/**
	 * @see UserManagementService.createUser
	 */
	@Override
	public User createUser(User userToCreate, String password) throws BusBuddyException {
		return this.userRepository.createUser(userToCreate, password);
	}

	/**
	 * @see UserManagementService.findUserByUsername
	 */
	@Override
	public User findUserByUsername(String sessionToken, String username) throws BusBuddyException {
		User user = this.userRepository.getUserByUsername(username);
		if (!this.userLoginService.checkPermissions(sessionToken, user)) {
			throw new BusBuddyForbiddenException();
		}
		return user;
	}

	/**
	 * @see UserManagementService.findUserByEmail
	 */
	@Override
	public User findUserByEmail(String sessionToken, String email) throws BusBuddyException {
		User user = this.userRepository.getUserByEmail(email);
		if (!this.userLoginService.checkPermissions(sessionToken, user)) {
			throw new BusBuddyForbiddenException();
		}
		return user;
	}

	/**
	 * @see UserManagementService.findUserByMobile
	 */
	@Override
	public User findUserByMobile(String sessionToken, short countryCode, String mobile) throws BusBuddyException {
		User user = this.userRepository.getUserByMobile(countryCode, mobile);
		if (!this.userLoginService.checkPermissions(sessionToken, user)) {
			throw new BusBuddyForbiddenException();
		}
		return user;
	}

	/**
	 * @see UserManagementService.updateUser
	 */
	@Override
	public void updateUser(String sessionToken, User newUserData, String password) throws BusBuddyException {
		if (!this.userLoginService.checkPermissions(sessionToken, newUserData)) {
			throw new BusBuddyForbiddenException();
		}
		
		try {
			User user = this.userRepository.getUserByEmail(newUserData.getEmail());
			if (user.getUserId() != newUserData.getUserId()) {
				throw new BusBuddyConflictException();
			}
		} catch (BusBuddyNotFoundException e) {
		}
		
		try {
			User user = this.userRepository.getUserByMobile(newUserData.getCountryCode(), newUserData.getMobile());
			if (user.getUserId() != newUserData.getUserId()) {
				throw new BusBuddyConflictException();
			}
		} catch (BusBuddyNotFoundException e) {
		}
		
		newUserData.setPasswordHash(HashUtility.hash(password));
		this.userRepository.updateUser(newUserData);
	}

	/**
	 * @see UserManagementService.delete
	 */
	@Override
	public void deleteUser(String sessionToken, User userToDelete) throws BusBuddyException {
		if (!this.userLoginService.checkPermissions(sessionToken, userToDelete)) {
			throw new BusBuddyForbiddenException();
		}
		
		this.userRepository.deleteUser(userToDelete);
	}
}
