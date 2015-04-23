package solid.common;

public class SmtpClient {
	
	private static boolean mailIsSent;

	public static void mailIsSent(boolean isSent) {
		mailIsSent = isSent;
	}

	public static boolean mailIsSent() {
		return mailIsSent;
	}

	public void send(MailMessage mailMessage) {
		mailIsSent = true;
	}

}
