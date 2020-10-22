package bmdb.db;

import java.util.ArrayList;
import java.util.List;

import bmdb.business.Actor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class ActorDB {
	
	private Connection getConnection() throws SQLException {
		 String dbURL = "jdbc:mysql://localhost:3306/bmdb?useSSL=false&allowPublicKeyRetrieval=true";
		 String username = "bmdb_user";
		 String password = "sesame";
		 
		 Connection connection = DriverManager.getConnection(dbURL, username, password);
		 
		 return connection;
	}
	
	private Actor getActorFromResultSet(ResultSet actors) throws SQLException{
		long id = actors.getLong("ID");
		String firstName = actors.getString("FirstName");
		String lastName = actors.getString("LastName");
		String gender = actors.getString("Gender");
		String birthDate = actors.getString("BirthDate");
		
		Actor actor = new Actor(id,firstName,lastName,gender, LocalDate.parse(birthDate));
		
		return actor;
		
	}
	
	public List<Actor> getAll(){
		List<Actor> actorList = new ArrayList<>();
		
		try (Connection con = getConnection();
		Statement stmt = con.createStatement();
		ResultSet actors = stmt.executeQuery("SELECT * FROM Actor");) {
		
		while (actors.next()) {
			
			Actor actor = getActorFromResultSet(actors);
			
			actorList.add(actor);
			}
		} catch (SQLException e) {
			System.err.println("Caught exception." + e);
			return null;
		}
		
		return actorList;
		
	 public Actor getActorByLastName(String lastName) {

			  String actorSelect = "SELECT * FROM ACTOR WHERE LastName = ?";

			  try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(actorSelect);) {

			   ps.setString(1, lastName);
			   ResultSet actors = ps.executeQuery();

			   if (actors.next()) {
			    Actor actor = getActorFromResultSet(actors);

			    actors.close();

			    return actor;
			   } else {
			    actors.close();

			    return null;
			   }

			  } catch (SQLException e) {
			   System.err.println("Caught exception. " + e);
			   return null;
			  }

			 }
	}
	public Actor get(long id) {
		
		String actorSelect = "SELECT * FROM Actor WHERE ID = ?";
		try (Connection con = getConnection();
				PreparedStatement ps = con.prepareStatement(actorSelect);
				) {
			
			ps.setLong(1, id);
			ResultSet actors = ps.executeQuery();
			
			if (actors.next()) {
				Actor actor = getActorFromResultSet(actors);
				
				actors.close();

				return actor;
			} else {
				actors.close();
				
				return null;
			}
				
			

		} catch (SQLException e) {
			System.err.println("Caught exception. " + e);
			return null;
		}
	}
	
	public  boolean add(Actor actor) {
		String "INSERT INTO bmdb.actor(FirstName, LastName, Gender, BirthDate) VALUES (?, ?, ?, ?)";
		
		try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(actorInsert)) {
			ps.setString(1, actor.getFirstName());
			ps.setString(2, actor.getLastName());
			ps.setString(3, actor.getGender());
			ps.setString(4, actor.getBirthDate().toString());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println("Caught exception." + e);
			return false
		}
	}
	public boolean update(Actor actor) {
		String actorUpdate = "UPDATE actor SET FirstName = ?, LastName = ?, Gender + ?, BirthDate = ? WHERE ID + ?"; 
	}
}
