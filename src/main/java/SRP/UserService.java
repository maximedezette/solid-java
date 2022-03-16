package SRP;

import common.*;

public class UserService {
	
	private Database database;
	private SmtpClient smtpClient;

	public void register(String email, String password) throws ValidationException {
		EmailService emailService = new EmailService();
		UserDAO userDAO = new UserDAO();

		emailService.validateMail(email);

		User user = new User(email, password);

		userDAO.save(user);

		emailService.sendMail(email);
	}
}
