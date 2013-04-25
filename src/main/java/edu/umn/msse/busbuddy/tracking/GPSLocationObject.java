package edu.umn.msse.busbuddy.tracking;

import java.util.Date;
/**
 * GPS Location is a value object used for GPS coordinates and the time of the last update.
 *
 */
public class GPSLocationObject {
	
	double latitude;         /**< current GPS latitude */
	double longitude;        /**< current GPS longitude */
	Date   lastUpdateTime;   /**< time of last GPS update from device */

}
