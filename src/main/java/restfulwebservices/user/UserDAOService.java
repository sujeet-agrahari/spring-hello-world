package restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class UserDAOService {
  private static List<User> users = new ArrayList<>();

  static {
    users.add(new User(1, "John", new Date()));
    users.add(new User(2, "Mary", new Date()));
    users.add(new User(3, "Peter", new Date()));
    users.add(new User(4, "Jane", new Date()));
    users.add(new User(5, "Jill", new Date()));
  }

  public List<User> findAll() {
    return users;
  }

  public User findById(Integer id) {
    return users.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
  }

  public User save(User user) {
    if (user.getId() == null) {
      user.setId(users.size() + 1);
    }
    users.add(user);
    return user;
  }

  public User deleteUserById(Integer id) {
    User user = findById(id);
    if (user == null) {
      return null;
    }
    users.remove(user);
    return user;
  }
}
