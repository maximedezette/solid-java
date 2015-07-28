package solid.SRP;

import solid.common.MailMessage;
import solid.common.SmtpClient;
import solid.common.ValidationException;

public class EmailService {

	void sendMessage(String email, String message) {
		SmtpClient smtpClient = new SmtpClient();
		smtpClient.send(new MailMessage("mysite@nowhere.com", email, message));
	}

	void checkEmailFormat(String email) throws ValidationException {
		if (!email.contains("@")) {
			throw new ValidationException("Email is not a valid email");
		}
	}

}
