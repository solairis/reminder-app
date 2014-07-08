
package com.solairis.reminder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author joshjohnson
 */
@Component
public class CommandLineOptions {
	
	@Value("${email:}")
	private String email;

	public String getEmail() {
		return email;
	}
	
}
