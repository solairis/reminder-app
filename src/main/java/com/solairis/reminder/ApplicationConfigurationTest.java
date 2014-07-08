
package com.solairis.reminder;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
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
	public CommandLineOptions getCommandLineOptions() {
		return new CommandLineOptions();
	}
	
}
