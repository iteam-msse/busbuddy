package edu.umn.msse.busbuddy.alert.controller;

public interface ISessionHandler {
	public boolean verifySessionToken(String sessionToken);
}
