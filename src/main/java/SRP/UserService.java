package SRP;

import common.*;

public class UserService {
	
	private Database database;
	private SmtpClient smtpClient;

	public void register(String email, String password) throws ValidationException {
		if (!email.contains("@")) {
			throw new ValidationException("Email is not a valid email");
		}
		
		database = new Database();
		User user = new User(email, password);
		database.save(user);
		
		smtpClient = new SmtpClient();
		smtpClient.send(new MailMessage("mysite@nowhere.com", email, "Hello fool !"));
	}
}
