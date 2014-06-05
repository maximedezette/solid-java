package solid.SRP;

import solid.common.Database;
import solid.common.MailMessage;
import solid.common.SmtpClientImplementation;
import solid.common.User;
import solid.common.ValidationException;

public class UserService {
	
	private Database database;
	private SmtpClientImplementation smtpClient;

	public void register(String email, String password) throws ValidationException {
		if (!email.contains("@")) {
			throw new ValidationException("Email is not a valid email");
		}
		
		database = new Database();
		User user = new User(email, password);
		database.save(user);
		
		sendWelcomeEmail(email);
	}

	private void sendWelcomeEmail(String email) {
		smtpClient = new SmtpClientImplementation();
		smtpClient.send(new MailMessage("mysite@nowhere.com", email, "Hello fool !"));
	}
}
