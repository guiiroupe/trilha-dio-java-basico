import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

public interface UserFactory {
  User createUser(String username, String password);
}
