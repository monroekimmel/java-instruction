package prs.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import prs.business.product;
import prs.business.vendor;
import prs.exception.PrsDataException;

public class VendorDB {

	public VendorDB() {
		
	}
	
	private Connection getConnection() throws SQLException {
		
		String dbURL = "jdbc:mysql://localhost:3306/prs?useSSL=false&allowPublicKeyRetrieval=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";;
		String username = "prs_user";
		String password = "sesame";
		
		Connection connection = DriverManager.getConnection(dbURL, username, password);
		
		return connection;
		
	}
	
	public List<vendor> getAll() {
		
		String selectAll = "SELECT * FROM vendor";
		try (Connection con = getConnection(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(selectAll)) {
			List<vendor> vendors = new ArrayList<>();
			while(rs.next()) {
				int id = rs.getInt("ID");
				String code = rs.getString("Code");
				String name = rs.getString("Name");
				String address = rs.getString("Address");
				String city = rs.getString("City");
				String state = rs.getString("Zip");
				String phoneNumber = rs.getString("Phone number");
				String email = rs.getString("Email");
				
				vendor vendor = new vendor(id, code, name, address, city, state, phoneNumber, email);
				
				vendors.add(vendor);
			} 
		
			return vendors;
		} catch (SQLException e) {
			throw new PrsDataException("Error retrieving product. Msg: " + e.getMessage());
		}
	}
}
