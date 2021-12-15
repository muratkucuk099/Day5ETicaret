package DataAccess.Abstract;

import Entities.Concrete.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    void delete(User user);
    void update(User user);
    List<User> getAll();
    boolean isinEmail(String mail);
    boolean isInPassword(int password);
}
