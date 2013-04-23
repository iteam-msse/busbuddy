package edu.umn.msse.busbuddy.tracking;

import java.net.URL;
import java.util.Date;

import edu.umn.msse.busbuddy.transit.Location;
/** 
 * User tracking alert information obtained from the user interface when the user registers for an alert.
 * Primarily, this meta data will come from the user interface and stored in user module.
 */
public class UserTrackingAlertObject {
	
	private URL transitCoInfo;      /**< URL uniquely identifies transit company information. The transit company URL information to distinguish this vehicle from other vehicles in different cities with similar route numbers. Obtained from the user interface when the user registers for an alert, selected from a drop down derived from metadata {@TransitInfo}.*/
	private int routeID;            /**< Route number user is watching for vehicles. Obtained by translating user interface route description drop down to transit information route id.*/
	private Location stopLocation;  /**< GPS coordinates of vehicle stop closest to user.  Obtained from information uploaded to transit module by a transit company. */
	private Date scheduledTime;     /**< Time vehicle is scheduled to be at closest stop. Obtained from information uploaded by a transit company. Used for determining delay alerts.*/
	private Date alertTime;         /**< Amount of lead time user needs to get to the vehicle stop. Obtained from the user interface when the user signs up for an alert. */
	private String userContactInfo; /**< How to contact a user with an alert. User contact information (phone number or URL) where to send tracking alerts. Obtained from user interface when user signs up for an alert. On Bus Buddy system start, obtained from alert repository. */
	private AlertType type;         /**< Type of alert the user is registered.  A user may sign up for tracking alerts when a vehicle is approaching their stop.  Transit companies may sign up for delay alerts when their vehicle(s) are running behind schedule.*/

	public URL getTransitCoInfo() {return transitCoInfo; }
	public int getRouteID() { return routeID; }
}
