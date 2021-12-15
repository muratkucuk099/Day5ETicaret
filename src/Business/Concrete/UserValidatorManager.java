package Business.Concrete;

import Business.Abstract.MailVerificationService;
import Business.Abstract.UserValidatorService;
import Entities.Concrete.User;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class UserValidatorManager implements UserValidatorService {

    List<String> emails = new ArrayList<String>();

    public UserValidatorManager(MailVerificationService mailVerificationService) {
        super();
    }

    @Override
    public boolean firstNameValid(User user) {

        if (user.getName().isEmpty()) {
            System.out.println("Firstname can not be empty");
            return false;
        }else if (user.getName().length() < 2 ) {
            System.out.println("First name index must be higher than 1");
            return false;
        }
        return true;
    }

    @Override
    public boolean lastNameValid(User user) {
        if (user.getLastName().isEmpty()) {
            System.out.println("Lastname can not be empty");
            return false;
        }else if (user.getLastName().length() < 2 ) {
            System.out.println("Last name index must be higher than 1");
            return false;
        }
        return true;
    }

    @Override
    public boolean passwordValid(User user) {
         if (user.getName().length() < 1 ) {
            System.out.println("First name index must be higher than 1");
            return false;
        }

        return true;
    }

    @Override
    public boolean emailValid(User user) {
        String regex="^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2,})?$";
        Pattern pattern=Pattern.compile(regex, Pattern.CASE_INSENSITIVE );

        if(user.getEmail().isEmpty()) {
            System.out.println("E-mail cannot be empty");

        }else if(!pattern.matcher(user.getEmail()).find()) {
            System.out.println("E-mail format is wrong");
            return false;
        }
        return true;
    }

    @Override
    public boolean uniqueEmailValid(User user) {
        if (emails.contains(user.getEmail())){
            System.out.println("This email is used.");
            return false;
        }else {
            emails.add(user.getEmail());
            return true;
        }

    }

    @Override
    public boolean validation(User user) {
        if(firstNameValid(user) && lastNameValid(user) && passwordValid(user) && emailValid(user) && uniqueEmailValid(user)) {

            System.out.println("Validation successful");
            return true;
        }else {
            System.out.println("Validation failed");
            return false;
        }
    }
}
