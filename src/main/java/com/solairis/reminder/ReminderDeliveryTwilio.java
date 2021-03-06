
package com.solairis.reminder;

import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.factory.MessageFactory;
import com.twilio.sdk.resource.instance.Message;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

/**
 *
 * @author joshjohnson
 */
public class ReminderDeliveryTwilio implements ReminderDelivery {
	
	private final TwilioRestClient client;
	private final String twilioFromPhone;
	private final UserRepository userRepository;

	public ReminderDeliveryTwilio(TwilioRestClient twilioRestClient, String twilioFromPhone, UserRepository userRepository) {
		this.client = twilioRestClient;
		this.twilioFromPhone = twilioFromPhone;
		this.userRepository = userRepository;
	}

	@Override
	public void deliver(Reminder reminder) {
		MessageFactory messageFactory = this.client.getAccount().getMessageFactory();
		
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("Body", reminder.getContent()));
		params.add(new BasicNameValuePair("From", twilioFromPhone));
		params.add(new BasicNameValuePair("To", this.userRepository.findByEmail(reminder.getEmail()).getPhone()));
		
		try {
			Message sms = messageFactory.create(params);
		} catch (TwilioRestException e) {
			throw new ReminderDeliveryException(e);
		}
	}
	
}
