package DIP;

import common.Database;
import common.User;
import common.ValidationException;

public class UserService {

	private EmailService emailService;
	private Database database;

	public UserService() {
		this.emailService = new EmailService();
		this.database = new Database();
	}

	public void register(String email, String password)
			throws ValidationException {
		emailService.validateEmail(email);

		User user = new User(email, password);
		database.save(user);

		emailService.sendEmail(email);
	}

}
