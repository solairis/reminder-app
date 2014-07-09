
package com.solairis.reminder;

import com.twilio.sdk.TwilioRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 *
 * @author joshjohnson
 */
@Configuration
@Profile("production")
public class ApplicationConfigurationProduction {
	
	@Autowired
	private UserRepository userRepository;
	
	@Bean
	public ReminderRepository getReminderRepository() {
		return new ReminderRepositoryJonAndJoshStub();
	}
	
	@Bean
	public String getTwilioAccountSid() {
		return "ACf7476379d7c599528fb70fd0803b0aae";
	}
	
	@Bean
	public String getTwilioAuthToken() {
		return "961c034a0f44cc26495a899df675ee3a";
	}
	
	@Bean
	public TwilioRestClient getTwilioRestClient() {
		return new TwilioRestClient(getTwilioAccountSid(), getTwilioAuthToken());
	}
	
	@Bean
	public String getTwilioFromPhone() {
		return "+17166163356";
	}
	
	@Bean
	public ReminderDelivery getReminderDelivery() {
		return new ReminderDeliveryTwilio(getTwilioRestClient(), getTwilioFromPhone(), this.userRepository);
	}
	
}
