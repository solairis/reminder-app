
package com.solairis.reminder;

/**
 *
 * @author joshjohnson
 */
public class User {
	
	private final String email;
	private final String phone;

	public User(String email, String phone) {
		this.email = email;
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}
	
}
