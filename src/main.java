import Business.Abstract.UserService;
import Business.Concrete.MailVerificationManager;
import Business.Concrete.UserManager;
import Business.Concrete.UserValidatorManager;
import Core.Concrete.GoogleLoggerManagerAdapter;
import DataAccess.Concrete.HybernateUserDao;
import Entities.Concrete.User;

public class main {
    public static void main(String[] args) {

        User user1 = new User();

        user1.setId(1);
        user1.setEmail("muratkucuk099@gmail.com");
        user1.setName("Murat");
        user1.setLastName("Küçük");
        user1.setPassword(25051999);

        User user2 = new User();

        user2.setId(5);
        user2.setName("Barış");
        user2.setLastName("Demir");
        user2.setEmail("barisdemir09@gmail.com");
        user2.setPassword(25051999);

        UserService userService = new UserManager(new MailVerificationManager(null),
                new UserValidatorManager(null),
                new HybernateUserDao(), new GoogleLoggerManagerAdapter());

        userService.SignUp(user1);
        System.out.println("");
        userService.SignInwithGoogleAccount(user1);

    }
}
