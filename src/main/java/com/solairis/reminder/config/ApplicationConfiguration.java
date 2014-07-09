
package com.solairis.reminder.config;

import com.solairis.reminder.CommandLineOptions;
import com.solairis.reminder.UserRepository;
import com.solairis.reminder.UserRepositoryJonAndJoshStub;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author joshjohnson
 */
@Configuration
public class ApplicationConfiguration {
	
	@Bean
	public CommandLineOptions getCommandLineOptions() {
		return new CommandLineOptions();
	}
	
	@Bean
	public UserRepository getUserRepository() {
		return new UserRepositoryJonAndJoshStub();
	}
	
}
