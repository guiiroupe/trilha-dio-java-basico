public class AdminUser implements User {
  private String username;
  private String password;

  public AdminUser(String username, String password) {
      this.username = username;
      this.password = password;
  }

  @Override
  public String getUsername() {
      return username;
  }

  @Override
  public String getPassword() {
      return password;
  }

  @Override
  public String getRole() {
      return "ADMIN";
  }
}

public class RegularUser implements User {
  private String username;
  private String password;

  public RegularUser(String username, String password) {
      this.username = username;
      this.password = password;
  }

  @Override
  public String getUsername() {
      return username;
  }

  @Override
  public String getPassword() {
      return password;
  }

  @Override
  public String getRole() {
      return "USER";
  }
}

