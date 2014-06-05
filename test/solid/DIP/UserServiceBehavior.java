package solid.DIP;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import solid.common.Database;
import solid.common.SmtpClientImplementation;
import solid.common.ValidationException;

public class UserServiceBehavior {
	
	private UserService service;

	@Before
	public void setUp() throws Exception {
		service = new UserService(new EmailServiceImplementation(), new Database());
		Database.userIsSaved(false);
		SmtpClientImplementation.mailIsSent(false);
	}

	@Test
	public void shouldSaveUserToDatabaseWhenEmailIsValid() {
		
		service.register("toto@email.com", "toto");
		assertTrue(Database.userIsSaved());
	}

	@Test
	public void shouldSendEmailWhenEmailIsValid() throws ValidationException {
		
		service.register("toto@email.com", "toto");
		assertTrue(SmtpClientImplementation.mailIsSent());
	}

	@Test(expected=ValidationException.class) 
	public void shouldThrowValidationExceptionWhenEmailIsNotValid() {
		service.register("totoemail.com", "toto");
		fail("should have thrown a Validation Exception");
	}

	@Test 
	public void shouldNotSaveUserWhenEmailIsNotValid() {
		
		try {
			service.register("totoemail.com", "toto");
		} catch (ValidationException e) {
		}

		assertFalse(Database.userIsSaved());
	}

	@Test 
	public void shouldNotSendEmailEmailIsNotValid() {
		
		try {
			service.register("totoemail.com", "toto");
		} catch (ValidationException e) {
		}

		assertFalse(SmtpClientImplementation.mailIsSent());
	}
}
