package edu.umn.msse.busbuddy.alert.client;

import javax.annotation.Resource;

import edu.umn.msse.busbuddy.alert.client.model.UserInformation;

/**
 * Client layer will handle all the responsibility of sending request to other modules or external sources. This
 * particular client class will handle request to User module to get necessary user information.
 */
public class AlertUserClient {

	/**
	 * A user module url that is used to make a REST call to get users information This information is saved in a config
	 * file that is retrieved via Spring's Resource annotation.
	 */
	@Resource
	String userModuleURL;

	/**
	 * Calls User module to get User information for a particular user such as their contact preference via a REST call.
	 * 
	 * @param userId
	 *            User ID of the user that should receive the alert.
	 * @param sessionToken
	 *            Valid long lived session token that can be used to get information about a particular user.
	 * @return A {@link UserInformation} that contains user data.
	 */
	public UserInformation getuserInformation(String userId, String sessionToken) {
		/**
		 * gets the user information from the user module via REST call
		 */
		return null;
	}

}
