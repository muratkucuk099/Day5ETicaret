package DataAccess.Concrete;

import DataAccess.Abstract.UserDao;
import Entities.Concrete.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HybernateUserDao implements UserDao {
    List<User>Users = new ArrayList<User>();

    @Override
    public void add(User user) {
        System.out.println(user.getName() + " " + user.getLastName() + " added to system");
        Users.add(user);

    }

    @Override
    public void delete(User user) {
        System.out.println(user.getName() + " " + user.getLastName() + " deleted to system");


    }

    @Override
    public void update(User user) {
        System.out.println(user.getName() + " " + user.getLastName() + " updated to system");

    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public boolean isinEmail(String mail) {
        for (User x : Users) {
            if (Objects.equals(x.getEmail(), mail)){
                return true;
            }

        }
        return false;
    }

    @Override
    public boolean isInPassword(int password) {
        for (User x : Users) {
            if (x.getPassword() == password){
                return true;
            }

        }
        return false;
    }



}
