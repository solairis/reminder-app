
package com.solairis.reminder;

/**
 *
 * @author joshjohnson
 */
public interface ReminderRepository {

	public Reminder findRandom(String email);
	
}
