
package com.solairis.reminder;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author joshjohnson
 */
public class ReminderRepositoryJonAndJoshStubTest {
	
	private ReminderRepository reminderRepository;
	
	@Before
	public void before_each_test() {
		this.reminderRepository = new ReminderRepositoryJonAndJoshStub();
	}
	
	@Test
	public void verify_random_Reminder_returned_for_Josh() {
		Reminder reminder = this.reminderRepository.findRandom("joshpauljohnson@gmail.com");
		assertThat(reminder.getContent(), is("Chop wood, carry water"));
	}
	
	@Test
	public void verify_random_Reminder_returned_for_Jon() {
		Reminder reminder = this.reminderRepository.findRandom("jskulski@gmail.com");
		assertThat(reminder.getContent(), is("Chop wood, carry water"));
	}
	
}
