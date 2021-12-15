package Business.Abstract;

import Entities.Concrete.User;

public interface MailVerificationService {
    void sendEmail(User user);
    boolean verifySendEmail(User user);
}
