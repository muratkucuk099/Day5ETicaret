package Business.Abstract;

import Entities.Concrete.User;

public interface UserValidatorService {

    boolean firstNameValid(User user);
    boolean lastNameValid(User user);
    boolean passwordValid(User user);
    boolean emailValid(User user);
    boolean uniqueEmailValid(User user);
    boolean validation(User user);
}
