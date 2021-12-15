package Core.Concrete;

import Core.Abstract.LoggerService;
import Entities.Concrete.User;
import JLoggingWithGoogleAccount.GoogleLoggerManager;

public class GoogleLoggerManagerAdapter implements LoggerService {

    @Override
    public void logToService(User user) {
        GoogleLoggerManager googleLoggerManager = new GoogleLoggerManager();
        googleLoggerManager.googleLogger("Signin with your google account.");

    }
}
