
package com.solairis.reminder;

import com.twilio.sdk.TwilioRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;


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
	
	@Value("${twilio.from.phone}")
	private String twilioFromPhone;
	
	@Bean
	public ReminderRepository getReminderRepository() {
		return new ReminderRepositoryJonAndJoshStub();
	}
	
	@Bean
	public TwilioRestClient getTwilioRestClient() {
		return new TwilioRestClient(this.twilioAccountSid, this.twilioAuthToken);
	}
	
	@Bean
	public ReminderDelivery getReminderDelivery() {
		return new ReminderDeliveryTwilio(getTwilioRestClient(), twilioFromPhone, this.userRepository);
	}
	
}
