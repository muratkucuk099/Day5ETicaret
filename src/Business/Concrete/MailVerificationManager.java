package Business.Concrete;

import Business.Abstract.MailVerificationService;
import Business.Abstract.UserValidatorService;
import Entities.Concrete.User;

public class MailVerificationManager implements MailVerificationService {

    private UserValidatorService userValidatorService;

    public MailVerificationManager(UserValidatorService userValidatorService) {
        this.userValidatorService = userValidatorService;
    }

    @Override
    public void sendEmail(User user) {
        if (userValidatorService.validation(user)) {
            System.out.println("Sended email.");
        }

    }

    @Override
    public boolean verifySendEmail(User user) {

        System.out.println("Email activation completed ");

        return true;
    }
}
