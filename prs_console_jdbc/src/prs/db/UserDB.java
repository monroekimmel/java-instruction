package prs.db;

import java.util.List;

import prs.business.User;
import prs.exception.PrsDataException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDB {

	public UserDB() {
		
	}
	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/prs?useSSL=false&allowPublicKeyRetrieval=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";;
		String username = "prs_user";
		String password = "sesame";
		
		Connection connection = DriverManager.getConnection(dbURL, username, password);
		
		return connection;
				
	}
	public List<User> getAll() {
		String selectAll = "SELECT * FROM User";
		try (Connection con = getConnection(); 
				Statement stmt = con.createStatement(); 
				ResultSet rs = stmt.executeQuery(selectAll)) {
			
			List<Users> users = new ArrayList<>();
			
			while (rs.next()) {
				int id = rs.getInt("ID");
				String userName = rs.getString("Username");
				String password = rs.getString("Password");
				String firstName = rs.getString("Firstname");
				String lastName = rs.getString("Lastname");
				String phoneNumber = rs.getString("PhoneNumber");
				String email = rs.getString("Email");
				boolean isReviewer = rs.getBoolean("isReviewer");
				boolean isAdmin = rs.getBoolean("isReviewer");
				
				User user = new user
			}
			
		} catch (SQLException e) {
			throw new PrsDataException("Error retrieving users. Msg: " + e.getMessage());
		}
	}
}
