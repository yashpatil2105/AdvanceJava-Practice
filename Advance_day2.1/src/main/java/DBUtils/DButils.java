package DBUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButils {

	private static Connection connection=null;

	public static Connection openConnection() throws ClassNotFoundException, SQLException {
		if (connection == null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3307/iacsd?useSSL=false&allowPublicKeyRetrieval=true";
			connection = DriverManager.getConnection(url,"root","root123");
		}
		return connection;
	}
	
	public static void closeConnection() throws SQLException{
		if (connection != null) {
			connection.close();
		}
	}

}
