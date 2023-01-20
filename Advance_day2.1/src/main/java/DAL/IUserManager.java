package DAL;
import java.sql.SQLException;

import pojo.User;

public interface IUserManager {
	public User authenticateUser(String email, String Password) throws SQLException;
}
