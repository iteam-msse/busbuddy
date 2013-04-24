package edu.umn.msse.busbuddy.alert.domain.model;

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

	public int getDayOfYear() {
		return dayOfYear;
	}

	public void setDayOfYear(int dayOfYear) {
		this.dayOfYear = dayOfYear;
	}

	public int getDayOfMonth() {
		return dayOfMonth;
	}

	public void setDayOfMonth(int dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}

	public int getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(int dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public int getStartHour() {
		return startHour;
	}

	public void setStartHour(int startHour) {
		this.startHour = startHour;
	}

	public int getStartMinute() {
		return startMinute;
	}

	public void setStartMinute(int startMinute) {
		this.startMinute = startMinute;
	}

}
