package edu.umn.msse.busbuddy.user;

import java.util.Calendar;

import org.springframework.stereotype.Service;

import edu.umn.msse.busbuddy.common.BusBuddyInternalException;

/**
 * This class is responsible for handling database access for Sessions, and to construct, persist, and retrieve
 * {@link Session} objects.
 */
@Service
public class SessionRepository {
	/**
	 * This creates a new session for the given user.
	 * 
	 * @pre The User object must be a valid user retrieved from the database.
	 * @param user
	 *            This is the user to create the session for.
	 * @param isAlertSession
	 *            This is set to true if this should be a long-lived session, for an alert. Otherwise, set to false for
	 *            a normal session.
	 * @return The method returns the newly created Session object.
	 * @throws BusBuddyInternalException
	 *             This exception is thrown when there is a database error.
	 */
	Session createSession(User user, boolean isAlertSession) throws BusBuddyInternalException {
		/* TODO */
		Calendar expiration = null;
		if (!isAlertSession) {
			expiration = Calendar.getInstance();
			expiration.add(Calendar.DAY_OF_MONTH, 1);
		}

		Session session = new Session("SESSION_TOKEN", Calendar.getInstance(), isAlertSession, user.getUserId());
		session.setExpirationTime(expiration);
		session.setValid(true);
		return session;
	}

	Session getSession(String sessionToken) {
		return new Session("SESSION_TOKEN", Calendar.getInstance(), false, 1);
	}

	void killSession(Session sessionToken) {

	}

	void killAllSessions(String userId) {

	}
}
