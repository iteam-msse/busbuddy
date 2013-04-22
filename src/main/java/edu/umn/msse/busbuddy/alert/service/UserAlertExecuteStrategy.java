package edu.umn.msse.busbuddy.alert.service;

import org.springframework.beans.factory.annotation.Autowired;

import edu.umn.msse.busbuddy.alert.domain.AlertRepository;

public class UserAlertExecuteStrategy implements IAlertExecuteStrategy {

	@Autowired
	AlertRepository alertRepository;

	@Override
	public boolean execute() {
		// TODO Auto-generated method stub
		return false;
	}

}
