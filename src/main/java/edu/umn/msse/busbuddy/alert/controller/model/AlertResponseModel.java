package edu.umn.msse.busbuddy.alert.controller.model;

/**
 * This is a basic alert response model that is returned for every alert related
 * requested. Additional parameter can be added as needed during implementation
 * phase.
 */
public class AlertResponseModel {
	/**
	 * Status message for the alert process job.
	 */
	private String status;

	/**
	 * Any error message if the alert request fails.
	 */
	private String errorMessage;
}
