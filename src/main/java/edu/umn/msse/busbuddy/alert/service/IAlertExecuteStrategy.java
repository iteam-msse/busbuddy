package edu.umn.msse.busbuddy.alert.service;

import java.util.List;

import edu.umn.msse.busbuddy.alert.domain.model.Alert;

/**
 * An interface for executing different type of alert based on alert type. Each implementation of this interface will
 * apply their own execute method that can send alert based on user, route etc.
 */
public interface IAlertExecuteStrategy {

	/**
	 * A method that executes alert passed in based on the type of alert.
	 * 
	 * @param alertModel
	 *            An {@link Alert} model fetched from database.
	 * @return A boolean indicating if overall process complete successfully.
	 */
	public boolean execute(Alert alertModel);
}
