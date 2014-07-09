
package com.solairis.reminder;

/**
 *
 * @author joshjohnson
 */
public interface UserRepository {

	public User findByEmail(String email);
	
}
