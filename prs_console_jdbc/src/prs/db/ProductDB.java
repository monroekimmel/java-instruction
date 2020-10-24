package prs.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import prs.business.product;
import prs.exception.PrsDataException;

public class ProductDB {
	
	public ProductDB() {
		
	}
	
	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/prs?useSSL=false&allowPublicKeyRetrieval=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";;
		String username = "prs_user";
		String password = "sesame";
		
		Connection connection = DriverManager.getConnection(dbURL, username, password);
		
		return connection;
				
	}
	
	public List<product> getAll() {
		String selectAll = "SELECT * FROM product";
		try (Connection con = getConnection(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(selectAll)) {
			List<product> products = new ArrayList<>();
			
			while(rs.next()) {
				int id = rs.getInt("ID");
				int vendorId = rs.getInt("VendorId");
				String partNumber = rs.getString("PartNumber");
				String name = rs.getString("Name");
				double price = rs.getDouble("Price");
				String unit = rs.getString("Unit");
				String photopath = rs.getString("PhotoPath");
				
				product product = new product(id, vendorId, partNumber, name, price, unit, photopath);
				
				products.add(product);
			}
			
			return products;
			
		} catch (SQLException e) {
			throw new PrsDataException("Error retrieving product. Msg: " + e.getMessage());
		}
	}

}
