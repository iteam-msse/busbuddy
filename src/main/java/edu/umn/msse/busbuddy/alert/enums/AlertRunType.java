package edu.umn.msse.busbuddy.alert.enums;

/**
 * Represents the type of alert depending upon the run type whether to run once
 * or to run in a fixed recurring manner. OneTime Alert runs only once and is
 * then deactivated. Recurring Alert runs in every certain amount of time
 * depending upon the parameter defined.
 * 
 */
public enum AlertRunType {
	Onetime, Recurring
}
