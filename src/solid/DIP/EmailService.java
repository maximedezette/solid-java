package solid.DIP;

import solid.common.MailMessage;
import solid.common.SmtpClient;
import solid.common.ValidationException;

public class EmailService {
	
	private SmtpClient smtpClient;

	public void validateEmail(String email) {
		if (!email.contains("@")) {
			throw new ValidationException("Email is not a valid email");
		}
	}

	public void sendEmail(String email) {
		smtpClient = new SmtpClient();
		smtpClient.send(new MailMessage("mysite@nowhere.com", email, "Hello fool !"));
	}

}
