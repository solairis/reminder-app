
package com.solairis.reminder;

import com.twilio.sdk.TwilioRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 *
 * @author joshjohnson
 */
@Configuration
@Profile("production")
@PropertySource("file:application.properties")
public class ApplicationConfigurationProduction {
	
	@Autowired
	private UserRepository userRepository;
	
	@Value("${twilio.auth.token}")
	private String twilioAuthToken;
	
	@Value("${twilio.account.sid}")
	private String twilioAccountSid;
	
	@Bean
	public ReminderRepository getReminderRepository() {
		return new ReminderRepositoryJonAndJoshStub();
	}
	
	@Bean
	public String getTwilioAccountSid() {
		return this.twilioAccountSid;
	}
	
	@Bean
	public String getTwilioAuthToken() {
		return this.twilioAuthToken;
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
