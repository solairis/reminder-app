
package com.solairis.reminder.config;

import com.solairis.reminder.ReminderDelivery;
import com.solairis.reminder.ReminderDeliveryNop;
import com.solairis.reminder.ReminderRepository;
import com.solairis.reminder.ReminderRepositoryNop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 *
 * @author joshjohnson
 */
@Configuration
@Profile("test")
public class ApplicationConfigurationTest {
	
	@Bean
	public ReminderRepository getReminderRepository() {
		return new ReminderRepositoryNop();
	}
	
	@Bean
	public ReminderDelivery getReminderDelivery() {
		return new ReminderDeliveryNop();
	}
	
}
