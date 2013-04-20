package edu.umn.msse.busbuddy.user;

import java.util.Calendar;

class Session {
	private final String sessionToken;
	private final Calendar creationTime;
	private Calendar expirationTime;
	private final boolean isAlertSession;
	private boolean valid;
	
	Session(String sessionToken, Calendar creationTime, boolean isAlertSession) {
		this.sessionToken = sessionToken;
		this.creationTime = creationTime;
		this.isAlertSession = isAlertSession;
	}
	
	protected String getSessionToken() {
		return this.sessionToken;
	}
	
	protected Calendar getCreationTime() {
		return this.creationTime;
	}
	
	protected Calendar getExpirationTime() {
		return this.expirationTime;
	}
	
	protected void setExpirationTime(Calendar expirationTime) {
		this.expirationTime = expirationTime;
	}
	
	protected boolean isAlertSession() {
		return this.isAlertSession;
	}
	
	protected boolean isValid() {
		return this.valid;
	}
	
	protected void setValid(boolean valid) {
		this.valid = valid;
	}
}
