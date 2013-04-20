package edu.umn.msse.busbuddy.user;

import java.util.Calendar;

public class SessionRepository {
	Session createSession(User user) {
		return new Session("SESSION_TOKEN", Calendar.getInstance(), false);
	}
	
	Session getSession(String sessionToken) {
		return new Session("SESSION_TOKEN", Calendar.getInstance(), false);
	}
	
	void killSession(Session sessionToken) {
		
	}
	
	void killAllSessions(String userId) {
		
	}
}
