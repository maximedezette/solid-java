package solid.DIP;

import solid.common.MailMessage;
import solid.common.SmtpClient;
import solid.common.ValidationException;

public class EmailServiceImplementation implements EmailService {
	
	private SmtpClient smtpClient;

	/* (non-Javadoc)
	 * @see solid.DIP.EmailSerivce#validateEmail(java.lang.String)
	 */
	@Override
	public void validateEmail(String email) {
		if (!email.contains("@")) {
			throw new ValidationException("Email is not a valid email");
		}
	}

	/* (non-Javadoc)
	 * @see solid.DIP.EmailSerivce#sendEmail(java.lang.String)
	 */
	@Override
	public void sendEmail(String email) {
		smtpClient = new SmtpClient();
		smtpClient.send(new MailMessage("mysite@nowhere.com", email, "Hello fool !"));
	}

}
