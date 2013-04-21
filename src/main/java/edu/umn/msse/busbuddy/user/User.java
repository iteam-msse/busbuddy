package edu.umn.msse.busbuddy.user;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * This class represents a single user of the system, and all of the state data associated with that user.  The user
 * should already exist in the database before instantiating this object.
 */
public class User {
	private final int userId;
	private final String username;
	private String passwordHash;
	private boolean forcePasswordChange;
	private String firstName;
	private String email;
	private Short countryCode;
	private String mobile;
	private UserType userType;

	/**
	 * This constructs a new User object.  It is not visible to clients, as User objects should only be constructed
	 * through the {@link UserRepository}.
	 * @param userId This is the user's unique identifier, which should match the database.
	 * @param username This is the user's username.  It cannot be changed.
	 */
	User(int userId, String username) {
		this.userId = userId;
		this.username = username;
	}

	/**
	 * This retrieves the user identifier.
	 * @return user identifier
	 */
	public int getUserId() {
		return this.userId;
	}

	/**
	 * This retrieves the user's username.
	 * @return username
	 */
	public String getUsername() {
		return this.username;
	}

	/**
	 * This retrieves the password hash for this user.  It has decreased visibility and is ignored when serializing
	 * responses, as this data should not be shared beyond this module.
	 * @return hash of the user's password
	 */
	@JsonIgnore
	protected String getPasswordHash() {
		return this.passwordHash;
	}

	/**
	 * This sets the password hash for this user.  It has decreased visibility and is ignored when deserializing
	 * requests, as this data should not be set outside this module.
	 * @param passwordHash hash of the user's password
	 */
	@JsonIgnore
	protected void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	/**
	 * This checks to see if the password is in a state where it needs to be changed.
	 * @return true if it is, false if it is not
	 */
	public boolean isForcePasswordChange() {
		return this.forcePasswordChange;
	}

	/**
	 * This sets the state indicating if the password is in a state where it needs to be changed.  This is ignored
	 * during deserialization, as it should never be set from outside this module.
	 * it is never
	 * @param forcePasswordChange true if it should be set, false if it should be cleared
	 */
	@JsonIgnore
	protected void setForcePasswordChange(boolean forcePasswordChange) {
		this.forcePasswordChange = forcePasswordChange;
	}

	/**
	 * This retrieves the user's first name.
	 * @return user's first name
	 */
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * This sets the user's first name.
	 * @param firstName user's first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * This retrieves the user's e-mail.
	 * @return user's e-mail
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * This sets the user's e-mail.
	 * @param email user's e-mail
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * This gets the user's country code.
	 * @return user's country code
	 */
	public Short getCountryCode() {
		return this.countryCode;
	}

	/**
	 * This sets the user's country code.
	 * @param countryCode user's country code
	 */
	public void setCountryCode(Short countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 * This gets the user's mobile phone number.
	 * @post The mobile phone number returned should be a String containing only digits.
	 * @return user's mobile phone number
	 */
	public String getMobile() {
		return this.mobile;
	}

	/**
	 * This sets the user's mobile phone number.
	 * @pre The mobile parameter should be a String containing only digits.
	 * @param mobile user's mobile phone number
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * This retrieves the type of the current user.
	 * @return user type
	 */
	public UserType getUserType() {
		return this.userType;
	}

	/**
	 * This sets the type of the current user.
	 * @param userType user type
	 */
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
}
