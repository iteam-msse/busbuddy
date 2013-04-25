package edu.umn.msse.busbuddy.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import edu.umn.msse.busbuddy.common.BusBuddyBadRequestException;
import edu.umn.msse.busbuddy.common.BusBuddyException;
import edu.umn.msse.busbuddy.common.BusBuddyForbiddenException;
import edu.umn.msse.busbuddy.common.BusBuddyInternalException;
import edu.umn.msse.busbuddy.common.BusBuddyNotFoundException;
import edu.umn.msse.busbuddy.common.HashUtility;
import edu.umn.msse.busbuddy.common.MessageDeliveryUtility;

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

	/**
	 * @see UserLoginService.logout
	 */
	@Override
	public void logout(String sessionToken) throws BusBuddyException {
		if (sessionToken == null || sessionToken.length() == 0) {
			throw new BusBuddyBadRequestException();
		}

		this.sessionRepository.killSession(sessionToken);
	}

	/**
	 * @see UserLoginService.getUser
	 */
	@Override
	public User getUser(String sessionToken) throws BusBuddyException {
		if (sessionToken == null || sessionToken.length() == 0) {
			throw new BusBuddyBadRequestException();
		}

		Session session = this.sessionRepository.getSession(sessionToken);
		User user = this.userRepository.getUserById(session.getUserId());

		UserType userType = user.getUserType();
		if (userType != UserType.NORMAL_USER && userType != UserType.SYSTEM_ADMINISTRATOR) {
			throw new BusBuddyForbiddenException();
		}

		return user;
	}

	/**
	 * @see UserLoginService.createAlertSession
	 */
	@Override
	public String createAlertSession(String sessionToken) throws BusBuddyException {
		User user = this.getUser(sessionToken);
		Session session = this.sessionRepository.createSession(user, true);
		return session.getSessionToken();
	}

	/**
	 * @see UserLoginService.sendUsername(String)
	 */
	@Override
	public void sendUsername(String email) throws BusBuddyException {
		if (email == null || !email.contains("@")) {
			throw new BusBuddyBadRequestException();
		}

		User user = this.userRepository.getUserByEmail(email);

		UserType userType = user.getUserType();
		if (userType != UserType.NORMAL_USER && userType != UserType.SYSTEM_ADMINISTRATOR) {
			throw new BusBuddyForbiddenException();
		}

		MessageDeliveryUtility.sendEmail(email, "busbuddy@msse.umn.edu", "Your Username", user.getUsername());
	}

	/**
	 * @see UserLoginService.sendUsername(short, String)
	 */
	@Override
	public void sendUsername(short countryCode, String mobile) throws BusBuddyException {
		if (mobile == null) {
			/* TODO: Also if non numeric mobile. */
			throw new BusBuddyBadRequestException();
		}

		User user = this.userRepository.getUserByMobile(countryCode, mobile);

		UserType userType = user.getUserType();
		if (userType != UserType.NORMAL_USER && userType != UserType.SYSTEM_ADMINISTRATOR) {
			throw new BusBuddyForbiddenException();
		}

		MessageDeliveryUtility.sendSms(countryCode, mobile, user.getUsername());
	}

	/**
	 * @see UserLoginService.resetPassword(String, String)
	 */
	@Override
	public void resetPassword(String username, String email) throws BusBuddyException {
		if (username == null || username.length() == 0 || email == null || email.length() == 0) {
			throw new BusBuddyBadRequestException();
		}

		User user;
		try {
			user = this.userRepository.getUserByUsername(username);
		} catch (BusBuddyNotFoundException e) {
			throw new BusBuddyForbiddenException();
		}

		UserType userType = user.getUserType();
		if (userType != UserType.NORMAL_USER && userType != UserType.SYSTEM_ADMINISTRATOR) {
			throw new BusBuddyForbiddenException();
		}

		if (!email.equals(user.getEmail())) {
			throw new BusBuddyForbiddenException();
		}

		String newPassword = "SAMPLE"; // TODO: Generate real password
		user.setPasswordHash(HashUtility.hash(newPassword));
		this.userRepository.updateUser(user);

		MessageDeliveryUtility.sendEmail(email, "busbuddy@msse.umn.edu", "Your Password", newPassword);
	}

	/**
	 * @see UserLoginService.resetPassword(String, short, String)
	 */
	@Override
	public void resetPassword(String username, short countryCode, String mobile) throws BusBuddyException {
		if (username == null || username.length() == 0 || mobile == null || mobile.length() == 0) {
			/* TODO: Also if mobile is not numeric. */
			throw new BusBuddyBadRequestException();
		}

		User user;
		try {
			user = this.userRepository.getUserByUsername(username);
		} catch (BusBuddyNotFoundException e) {
			throw new BusBuddyForbiddenException();
		}

		UserType userType = user.getUserType();
		if (userType != UserType.NORMAL_USER && userType != UserType.SYSTEM_ADMINISTRATOR) {
			throw new BusBuddyForbiddenException();
		}

		if (!mobile.equals(user.getMobile()) || countryCode != user.getCountryCode().shortValue()) {
			throw new BusBuddyForbiddenException();
		}

		String newPassword = "SAMPLE"; // TODO: Generate real password
		user.setPasswordHash(HashUtility.hash(newPassword));
		this.userRepository.updateUser(user);

		MessageDeliveryUtility.sendSms(countryCode, mobile, newPassword);
	}

	/**
	 * This method checks to see if the currently logged in user has permissions to modify another given user object. A
	 * session can modify a user if it is the currently logged in user that is being modified, or if the currently
	 * logged in user is a system administrator.
	 * 
	 * @pre The session token must be linked to an active and valid session, which must be linked to an active account.
	 * @post The expiration time will be advanced based on this activity against the session.
	 * @param sessionToken
	 *            The session token identifying the session of the currently logged in user.
	 * @param user
	 *            The user we are checking to see if the session has permission to modify.
	 * @return true if the currently signed in user has permission to modify the user specified in the user parameter,
	 *         false otherwise
	 * @throws BusBuddyBadRequestException
	 *             This exception is thrown if the session token is blank.
	 * @throws BusBuddyForbiddenException
	 *             This exception is thrown if the session token is invalid, linked to an expired session, or the user
	 *             does not have permission to be signed in.
	 * @throws BusBuddyInternalException
	 *             This exception is thrown if an internal error prevents processing of the request.
	 */
	protected boolean checkPermissions(String sessionToken, User user) throws BusBuddyException {
		User loggedInUser = this.getUser(sessionToken);
		if (loggedInUser.getUserId() == user.getUserId()) {
			return true;
		}

		if (loggedInUser.getUserType() == UserType.SYSTEM_ADMINISTRATOR) {
			return true;
		}

		return false;
	}
}
