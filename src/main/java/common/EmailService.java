package common;

public class EmailService {


    public static final String corporateMail = "mysite@nowhere.com";

    public void validateMail(String email) {
        if (!email.contains("@")) {
            throw new ValidationException("Email is not a valid email");
        }
    }

    public void sendMail(String email) {
        this.validateMail(email);

        SmtpClient smtpClient = new SmtpClient();
        smtpClient.send(new MailMessage(corporateMail, email, "Hello fool !"));
    }
}
