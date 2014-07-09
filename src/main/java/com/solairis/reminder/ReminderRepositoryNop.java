
package com.solairis.reminder;

/**
 *
 * @author joshjohnson
 */
public class ReminderRepositoryNop implements ReminderRepository {

	@Override
	public Reminder findRandom(String email) {
		return null;
	}
	
}
