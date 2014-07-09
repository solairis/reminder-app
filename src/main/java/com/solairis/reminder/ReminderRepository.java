
package com.solairis.reminder;

/**
 *
 * @author joshjohnson
 */
interface ReminderRepository {

	public Reminder findRandom(String email);
	
}
