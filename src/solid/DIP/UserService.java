package solid.DIP;

import solid.common.DataSource;
import solid.common.Database;
import solid.common.User;
import solid.common.ValidationException;

public class UserService {

	private EmailService emailService;
	private DataSource datasource;

	public UserService(EmailService emailService, DataSource datasource) {
		this.emailService = emailService;
		this.datasource = datasource;
	}

	public void register(String email, String password)
			throws ValidationException {
		emailService.validateEmail(email);

		User user = new User(email, password);
		datasource.save(user);

		emailService.sendEmail(email);
	}

}
