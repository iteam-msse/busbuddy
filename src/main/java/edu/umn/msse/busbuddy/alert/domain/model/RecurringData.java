package edu.umn.msse.busbuddy.alert.domain.model;

import edu.umn.msse.busbuddy.alert.enums.AlertRecurringType;

public class RecurringData {

	/**
	 * Day of year that the alert should run. Valid value = 1-365
	 */
	private int dayOfYear;

	/**
	 * Day of month that the alert should run. Valid value is from 1-28.
	 */
	private int dayOfMonth;

	/**
	 * Day of week that the alert should run. e.g., 1 = Sunday and 7 = Saturday.
	 */
	private int dayOfWeek;

	/**
	 * The exact hour when the alert should run. Valid value is from 0 - 23
	 */
	private int startHour;

	/**
	 * The exact minute when the alert should run. Valid value is from 0-59.
	 */
	private int startMinute;

	// Getter and Setter

	/**
	 * @return the dayOfYear
	 */
	public int getDayOfYear() {
		return dayOfYear;
	}

	/**
	 * @param dayOfYear
	 *            the dayOfYear to set
	 */
	public void setDayOfYear(int dayOfYear) {
		this.dayOfYear = dayOfYear;
	}

	/**
	 * @return the dayOfMonth
	 */
	public int getDayOfMonth() {
		return dayOfMonth;
	}

	/**
	 * @param dayOfMonth
	 *            the dayOfMonth to set
	 */
	public void setDayOfMonth(int dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}

	/**
	 * @return the dayOfWeek
	 */
	public int getDayOfWeek() {
		return dayOfWeek;
	}

	/**
	 * @param dayOfWeek
	 *            the dayOfWeek to set
	 */
	public void setDayOfWeek(int dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	/**
	 * @return the startMinute
	 */
	public int getStartMinute() {
		return startMinute;
	}

	/**
	 * @param startMinute
	 *            the startMinute to set
	 */
	public void setStartMinute(int startMinute) {
		this.startMinute = startMinute;
	}

	/**
	 * @return the startHour
	 */
	public int getStartHour() {
		return startHour;
	}

	/**
	 * @param startHour
	 *            the startHour to set
	 */
	public void setStartHour(int startHour) {
		this.startHour = startHour;
	}
}
