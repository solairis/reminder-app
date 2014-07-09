
package com.solairis.reminder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author joshjohnson
 */
class ReminderRepositoryJonAndJoshStub implements ReminderRepository {
	
	private Map<String, List<Reminder>> reminderMap;
	private Random rand;

	public ReminderRepositoryJonAndJoshStub() {
		this.reminderMap = new HashMap<String, List<Reminder>>() {{
			put("joshpauljohnson@gmail.com", new ArrayList<Reminder>(){{
				add(new Reminder("Chop wood, carry water"));
			}});
			put("jskulski@gmail.com", new ArrayList<Reminder>(){{
				add(new Reminder("Chop wood, carry water"));
			}});
		}};
		
		this.rand = new Random();
	}

	@Override
	public Reminder findRandom(String email) {
		List<Reminder> reminders = this.reminderMap.get(email);
		int max = reminders.size() - 1;
		int min = 0;
		int randomIndex = rand.nextInt((max - min) + 1) + min;
		return reminders.get(randomIndex);
	}
	
}
