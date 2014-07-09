
package com.solairis.reminder;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author joshjohnson
 */
public class UserRepositoryJonAndJoshStub implements UserRepository {
	
	private Map<String, User> userMap;

	public UserRepositoryJonAndJoshStub() {
		this.userMap = new HashMap<String, User>() {{
			put("joshpauljohnson@gmail.com", new User("joshpauljohnson@gmail.com", "+17168297276"));
			put("jskulski@gmail.com", new User("jskulski@gmail.com", "+17162896054"));
		}};
	}

	@Override
	public User findByEmail(String email) {
		User user = this.userMap.get(email);
		
		if (user == null) {
			throw new UserNotFound("No user found for email "+email);
		}
		
		return user;
	}
	
}
