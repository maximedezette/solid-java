package solid.DIP;

import solid.common.MailMessage;
import solid.common.SmtpClientImplementation;
import solid.common.ValidationException;

public class EmailServiceImplementation {
	
	private SmtpClientImplementation smtpClient;

	public void validateEmail(String email) {
		if (!email.contains("@")) {
			throw new ValidationException("Email is not a valid email");
		}
	}

	public void sendEmail(String email) {
		smtpClient = new SmtpClientImplementation();
		smtpClient.send(new MailMessage("mysite@nowhere.com", email, "Hello fool !"));
	}

}
