package DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DBUtils.DButils;
import pojo.User;


public class UserManager implements IUserManager {
	
	private Connection con;
	private PreparedStatement pstmt;
	
	public UserManager() throws ClassNotFoundException, SQLException{
		con =DButils.openConnection();
		pstmt = con.prepareStatement("Select * from users where email=? and password=?");
	}

	@Override
	public User authenticateUser(String email, String password) throws SQLException {
		System.out.println("In Authenticate User Method ");
		pstmt.setString(1,email);
		pstmt.setString(2,password);
		try(ResultSet rset = pstmt.executeQuery()){
			if(rset.next()) {
				User user = new User(rset.getInt(1),rset.getString(2),rset.getString(3),rset.getString(4),rset.getString(5));
				return user;
			}
		}
		return null;
	}
	
	
	

}
