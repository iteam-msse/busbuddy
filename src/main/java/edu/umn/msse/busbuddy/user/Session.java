package edu.umn.msse.busbuddy.user;

import java.util.Calendar;

/**
 * This class represents a single session for a user of the system, and all of the state data associated with that
 * session. The session should already exist in the database before instantiating this object. A session grants a user
 * access to the data associated with that user. Sessions expire after a certain point, and can also be invalidated by a
 * user logging out. Some sessions are designed to be longer lasting, for use with alerts. This object is not visible to
 * clients - when they must pass a session reference, they do so by passing around the sessionToken.
 */
class Session {
	private final String sessionToken;
	private final Calendar creationTime;
	private Calendar expirationTime;
	private final boolean isAlertSession;
	private boolean valid;
	private final int userId;

	/**
	 * Create a new session object. It is not visible to clients, as User objects should only be constructed through the
	 * {@link UserRepository}. The parameters taken by the constructor cannot be changed once the session is created.
	 * 
	 * @param sessionToken
	 *            unique session token
	 * @param creationTime
	 *            time that the session was created
	 * @param isAlertSession
	 *            true if this is an alert session, false otherwise
	 * @param userId
	 *            user ID that the session is linked to
	 */
	Session(String sessionToken, Calendar creationTime, boolean isAlertSession, int userId) {
		this.sessionToken = sessionToken;
		this.creationTime = creationTime;
		this.isAlertSession = isAlertSession;
		this.userId = userId;
	}

	/**
	 * This retrieves the session token.
	 * @return session token
	 */
	protected String getSessionToken() {
		return this.sessionToken;
	}

	/**
	 * This retrieves the time that the session was created.
	 * @return session creation time
	 */
	protected Calendar getCreationTime() {
		return this.creationTime;
	}

	/**
	 * This retrieves the time that the session is set to expire.
	 * @return session expiration time
	 */
	protected Calendar getExpirationTime() {
		return this.expirationTime;
	}

	/**
	 * This sets the time that the session should expire.
	 * @param expirationTime expiration time to set
	 */
	protected void setExpirationTime(Calendar expirationTime) {
		this.expirationTime = expirationTime;
	}

	/**
	 * This checks to see if the session is an alert session.
	 * @return true if it is, false otherwise
	 */
	protected boolean isAlertSession() {
		return this.isAlertSession;
	}

	/**
	 * This checks to see if the session is valid.
	 * @return true if it is, false otherwise
	 */
	protected boolean isValid() {
		return this.valid;
	}

	/**
	 * This sets whether the session is valid.
	 * @param valid true if it is, false otherwise
	 */
	protected void setValid(boolean valid) {
		this.valid = valid;
	}

	/**
	 * This gets the ID of the user linked to this session.
	 * @return user's ID number
	 */
	protected int getUserId() {
		return this.userId;
	}
}
