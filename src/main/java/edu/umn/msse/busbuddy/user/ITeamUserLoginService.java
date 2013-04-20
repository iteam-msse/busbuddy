package edu.umn.msse.busbuddy.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import edu.umn.msse.busbuddy.common.BusBuddyBadRequestException;
import edu.umn.msse.busbuddy.common.BusBuddyException;
import edu.umn.msse.busbuddy.common.BusBuddyForbiddenException;
import edu.umn.msse.busbuddy.common.BusBuddyNotFoundException;
import edu.umn.msse.busbuddy.common.HashUtility;

/**
 * This is the iTeam's implementation of {@link UserLoginService}.
 */
@Controller
public class ITeamUserLoginService implements UserLoginService {
	@Autowired
	protected SessionRepository sessionRepository;

	@Autowired
	protected UserRepository userRepository;

	/**
	 * @see UserLoginService.login 
	 */
	@Override
	public String login(String username, String password) throws BusBuddyException {
		if (username == null || username.length() == 0 || password == null || password.length() == 0) {
			throw new BusBuddyBadRequestException();
		}
		
		User user;
		try {
			user = this.userRepository.getUserByUsername(username);
		} catch (BusBuddyNotFoundException e) {
			throw new BusBuddyForbiddenException();
		}
		
		String attemptedPasswordHash = HashUtility.hash(password);
		if (!attemptedPasswordHash.equals(user.getPasswordHash())) {
			throw new BusBuddyForbiddenException();
		}
		
		UserType userType = user.getUserType();
		if (userType != UserType.NORMAL_USER && userType != UserType.SYSTEM_ADMINISTRATOR) {
			throw new BusBuddyForbiddenException();
		}
		
		Session session = this.sessionRepository.createSession(user, false);
		return session.getSessionToken();
	}

	@Override
	public void logout(String sessionToken) {
	}

	@Override
	public User getUser(String sessionToken) {
		return new User(1, sessionToken);
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
