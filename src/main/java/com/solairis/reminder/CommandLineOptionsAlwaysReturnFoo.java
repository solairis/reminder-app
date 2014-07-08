
package com.solairis.reminder;

/**
 *
 * @author joshjohnson
 */
public class CommandLineOptionsAlwaysReturnFoo extends CommandLineOptions{

	@Override
	public String getEmail() {
		return "Foo";
	}
	
}
