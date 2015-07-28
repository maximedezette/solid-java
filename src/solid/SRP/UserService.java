package solid.SRP;

import solid.common.DataSource;
import solid.common.Database;
import solid.common.User;
import solid.common.ValidationException;

public class UserService {
	
	private DataSource database;
	private EmailService emailService;
	
	public UserService() {
		database = new Database();
		emailService = new EmailService();
	}

	public void register(String email, String password) throws ValidationException {
		emailService.checkEmailFormat(email);
		
		saveUser(email, password);
		
		sendWelcomeMessage(email);
	}

	private void sendWelcomeMessage(String email) {
		emailService.sendMessage(email, "Hello fool !");
	}

	private void saveUser(String email, String password) {
		User user = new User(email, password);
		database.save(user);
	}
}
