import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    private Map<String, User> userDatabase = new HashMap<>();

    public void addUser(UserFactory factory, String username, String password) {
        User user = factory.createUser(username, password);
        userDatabase.put(username, user);
    }

    public User findUserByUsername(String username) {
        return userDatabase.get(username);
    }
}

