package edu.umn.msse.busbuddy.user;

import java.util.Calendar;

import org.springframework.stereotype.Service;

import edu.umn.msse.busbuddy.common.BusBuddyForbiddenException;
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
	 * @pre The User object parameter must be a valid user retrieved from the database.
	 * @post A session is created in the database, and the object representing that session is returned.
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

	/**
	 * This method gets a session from the database. In addition, since this method is only called when there is an it
	 * will update the expiration date on the session.
	 * 
	 * @pre The sessionToken parameter must be a valid session identifier in the database.
	 * @post The session's expiration date will have been pusehd back due to this activity in the session.
	 * @param sessionToken
	 *            This is the session token that identifies the session.
	 * @return Session object represented by the session token that was pssed in.
	 * @throws BusBuddyInternalException
	 *             This exception is thrown when there is a database error.
	 * @throws BusBuddyForbiddenException
	 *             This exception is thrown if the session token is invalid or the session is expired.
	 */
	Session getSession(String sessionToken) throws BusBuddyInternalException, BusBuddyForbiddenException {
		/* TODO */
		Calendar expiration = Calendar.getInstance();
		expiration.add(Calendar.DAY_OF_MONTH, 1);

		Session session = new Session(sessionToken, Calendar.getInstance(), false, 1);
		session.setExpirationTime(expiration);
		session.setValid(true);

		return session;
	}

	void killSession(Session sessionToken) {

	}

	void killAllSessions(String userId) {

	}
}
