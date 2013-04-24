package edu.umn.msse.busbuddy.alert.client;

import javax.annotation.Resource;

import edu.umn.msse.busbuddy.alert.client.model.UserInformation;

public class AlertUserClient {

	/**
	 * A user module url that is used to make a REST call to get users information
	 * This information is saved in a config file that is retrieved via Spring's Resource annotation.
	 */
	@Resource
	String userModuleURL;

	/**
	 * Calls User module to get User information for a particular user such as
	 * their contact preference.
	 * 
	 * @param userId
	 *            User ID of the user that should receive the alert.
	 * @param sessionToken
	 *            Valid long lived session token that can be used to get
	 *            information about a particular user.
	 * 
	 * @return
	 */
	public UserInformation getuserInformation(String userId, String sessionToken) {
		/**
		 * gets the user information from the user module via REST call
		 */
		return null;
	}

}
