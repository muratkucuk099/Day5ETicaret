package Business.Concrete;

import Business.Abstract.MailVerificationService;
import Business.Abstract.UserService;
import Business.Abstract.UserValidatorService;
import Core.Abstract.LoggerService;
import DataAccess.Abstract.UserDao;
import Entities.Concrete.User;

public class UserManager implements UserService {

    private MailVerificationService mailVerificationService;
    private UserValidatorService userValidatorService;
    private UserDao userDao;
    private LoggerService loggerService;

    public UserManager(MailVerificationService mailVerificationService, UserValidatorService userValidatorService,
                       UserDao userDao, LoggerService loggerService) {
        this.mailVerificationService = mailVerificationService;
        this.userValidatorService = userValidatorService;
        this.userDao = userDao;
        this.loggerService = loggerService;
    }

    @Override
    public void SignIn(User user) {
        if (userDao.isinEmail(user.getEmail()) && userDao.isInPassword(user.getPassword())) {
            System.out.println("Sing in is succesfull " + user.getName());
        }else {
            System.out.println("Sign is failed");
        }

    }

    @Override
    public void SignUp(User user) {
        if (userValidatorService.validation(user) && mailVerificationService.verifySendEmail(user)) {
            System.out.println("Sign up completed.");
            userDao.add(user);

        }else {
            System.out.println("Sign up is failed");
        }

    }

    @Override
    public void SignInwithGoogleAccount(User user) {
        this.loggerService.logToService(user);

    }
}
