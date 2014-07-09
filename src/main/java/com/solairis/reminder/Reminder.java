
package com.solairis.reminder;

/**
 *
 * @author joshjohnson
 */
public class Reminder {
	
	private final String email;
	private final String content;

	public Reminder(String content, String email) {
		this.email = email;
		this.content = content;
	}

	public String getContent() {
		return this.content;
	}

	public String getEmail() {
		return email;
	}
	
}
