package edu.umn.msse.busbuddy.tracking;
/**
 * This is a basic tracking response model that is returned for every tracking related request. 
 * Additional parameters can be added as needed during implementation phase.
 */
public abstract class TrackingResponseModel {
		/**
		 * Status message for the tracking request.
		 */
		private String status;

		/**
		 * Any error message if the tracking request fails.
		 */
		private String errorMessage;
		
		/**
		 * Formats output responses and requests from the tracking module
		 * @return String containing response
		 */
		public String formatJSONResponse() {return null;}
		/**
		 * Converts input JSON formatted vehicle registration request to internal vehicle object.
		 * @return VehicleObject created from user registration.
		 */
		public VehicleObject convertJSONVehicleInput() {return null;}
		/**
		 * Convert input JSON formatted alert request from user interface to internal user alert object.
		 * @return UserTrackingAlertObject values 
		 */
		public UserTrackingAlertObject convertJSONAlertInput() {return null;} 
}
