package bmdb.ui;

import java.util.List;
import java.sql.SQLException;

import bmdb.business.Actor;
import bmdb.db.ActorDB;

public class BMDBApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Bootcamp Movie Database!");
		System.out.println();
		System.out.println("COMMANDS");
		System.out.println("la- List Actors");
		System.out.println("exit- Exit the application");
		
		String command = Console.getString("Enter command: ");
		while (command.equalsIgnoreCase("exit")) {
			
			switch (command) {
			case "la":
				ActorDB actorDB =  new ActorDB();
				List<Actor> actors = actorDB.getAll();
				System.out.println("Actors: ");
				for (Actor actor : actors) {
					System.out.println(actor);
				}
				break;
			}
			
			command = Console.getString("Enter command: ");
		}
	}

}
