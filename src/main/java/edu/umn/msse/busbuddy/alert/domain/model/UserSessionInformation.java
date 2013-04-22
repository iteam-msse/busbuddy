package edu.umn.msse.busbuddy.alert.domain.model;

public class UserSessionInformation {

	/**
	 * User ID of the user that initiated the alert.
	 */
	private String userId;

	/**
	 * A long lived session token to validate the authenticity of request to
	 * UserModule. This is required to get the current user information in order
	 * to alert the user.
	 */
	private String userSessionToken;

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the userSessionToken
	 */
	public String getUserSessionToken() {
		return userSessionToken;
	}

	/**
	 * @param userSessionToken
	 *            the userSessionToken to set
	 */
	public void setUserSessionToken(String userSessionToken) {
		this.userSessionToken = userSessionToken;
	}
}
