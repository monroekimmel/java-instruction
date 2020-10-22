package bmdb.ui;

import java.util.List;
import java.sql.SQLException;
import java.time.LocalDate;

import bmdb.business.Actor;
import bmdb.db.ActorDB;

public class BMDBApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Bootcamp Movie Database!");
		System.out.println();
		System.out.println("COMMANDS");
		System.out.println("la- List Actors");
		System.out.println("aa- add actor");
		System.out.println("da- delete actor");
		System.out.println("gabn- get actor by last name");
		System.out.println("gabi- get actor by ID");
		System.out.println("exit- Exit the application");
		
		ActorDB actorDB = new ActorDB();
		
		String command = Console.getString("Enter command: ");
		while (command.equalsIgnoreCase("exit")) {
			
			switch (command) {
				case "la":
				List<Actor> actors = actorDB.getAll();
				System.out.println("Actors: ");
				for (Actor actor : actors) {
					System.out.println(actor);
				}
				break;
				
				case "aa":
				String newFirstName = Console.getString("First name");
				String newLastName = Console.getString("Last name: ");
				String newGender = Console.getString("Gender: ");
				String newBirthDate = Console.getString("Birthdate (YYYY-MM-DD): ");
				LocalDate newBirthDateStr = LocalDate.parse(newBirthDateStr);
				
				Actor newActor = new Actor(0, newFirstName, newLastName, newGender, newBirthDate);
				
				if (actorDB.add(newActor)) {
					System.out.println("Actor added successfully!");
				} else {
					System.out.println("Error adding actor.");
				}
				break;
				
				case "da":
				long idToDel = Console.getInt("Actor ID to delete: ");
				if (actorDB.delete(idToDel)) {
					System.out.println("Actor deleted");
				} else {
					System.out.println("Error deleting actor");
				}
				break;
			}	
				case "gabn":
				String lastName = Console.getString("actor's last name: ");
				Actor actor = actorDB.getActorByLastName(lastName);
				if (actor == null) {
					System.out.println("No actor found");
				} else {System.out.println(actor);
			
				break;
				case "gabi":
					long id = Console.getInt("Actor's ID: ");
					Actor actorById = actorDB.get(id);
					if (actorById == null) {
						System.out.println("No ID found");
					} else {
						System.out.println(actorById);
					}
				break;
			
			command = Console.getString("Enter command: ");
		}
	}

}

