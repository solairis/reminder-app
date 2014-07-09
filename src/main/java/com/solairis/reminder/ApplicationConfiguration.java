
package com.solairis.reminder;

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
