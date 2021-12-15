package Business.Abstract;

import Entities.Concrete.User;

public interface UserService {

    void SignIn(User user);
    void SignUp(User user);
    void SignInwithGoogleAccount(User user);
}
