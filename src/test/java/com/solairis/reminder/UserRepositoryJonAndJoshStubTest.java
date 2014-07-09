
package com.solairis.reminder;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author joshjohnson
 */
public class UserRepositoryJonAndJoshStubTest {
	
	private UserRepository userRepository;
	
	@Before
	public void before_each_test() {
		this.userRepository = new UserRepositoryJonAndJoshStub();
	}
	
	@Test
	public void verify_Joshs_phone() {
		User user = this.userRepository.findByEmail("joshpauljohnson@gmail.com");
		assertThat(user.getPhone(), is("+17168297276"));
	}
	
	
	@Test
	public void verify_Jons_phone() {
		User user = this.userRepository.findByEmail("jskulski@gmail.com");
		assertThat(user.getPhone(), is("+17162896054"));
	}
	
	@Test(expected = UserNotFound.class)
	public void verify_UserNotFound_for_bad_email() {
		User user = this.userRepository.findByEmail("bademail@example.com");
	}
	
}
