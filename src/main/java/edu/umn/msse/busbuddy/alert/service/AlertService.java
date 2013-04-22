package edu.umn.msse.busbuddy.alert.service;

import org.springframework.beans.factory.annotation.Autowired;

import edu.umn.msse.busbuddy.alert.controller.model.AlertRequestModel;
import edu.umn.msse.busbuddy.alert.controller.model.AlertResponseModel;
import edu.umn.msse.busbuddy.alert.domain.AlertRepository;
import edu.umn.msse.busbuddy.alert.domain.model.Alert;

public abstract class AlertService {
	@Autowired
	IAlertExecuteStrategy alertExecuteStrategy;

	@Autowired
	AlertRepository alertRepository;

	public abstract AlertResponseModel createAlert(
			AlertRequestModel requestModel);

	public AlertResponseModel saveAlert(Alert alertModel) {
		return null;

	}

	public AlertResponseModel deleteAlert(Alert alertModel) {
		return null;

	}

	public AlertResponseModel updateAlert(Alert alertModel) {
		return null;

	}

}
