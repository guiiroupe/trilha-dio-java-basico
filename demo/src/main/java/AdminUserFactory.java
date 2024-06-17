public class AdminUserFactory implements UserFactory {
  @Override
  public User createUser(String username, String password) {
      return new AdminUser(username, password);
  }
}

public class RegularUserFactory implements UserFactory {
  @Override
  public User createUser(String username, String password) {
      return new RegularUser(username, password);
  }
}

