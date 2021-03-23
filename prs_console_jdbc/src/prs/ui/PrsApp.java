package prs.ui;

import java.util.List;

import prs.business.product;
import prs.business.vendor;
import prs.db.ProductDB;
import prs.db.VendorDB;
import prs.exception.PrsDataException;

public class PrsApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the PRS App");
		System.out.println();
		
		System.out.println("COMMANDS");
		System.out.println("prod_la- List all products");
		System.out.println("vend_la- list all vendors");
		System.out.println("exit- Exit the application");
		System.out.println();
		
		String command = "";
		while (!command.equalsIgnoreCase("exit")) {
			command = console.getString("Enter command: ");
			switch (command.toLowerCase()) {
			case "prod_la":
				listProducts();
				break;
			case "vend_la":
				listVendors();
				break;
			case "exit":
				//nothing to do
				break;
					
			default: System.out.println("Invalid command");
				break;
			}
		}
		
	}
	
	private static void listProducts() {
		ProductDB productDb = new ProductDB();
		List<product> products = productDb.getAll();
		
		for (product product : products) {
			System.out.println(product);
		}
		System.out.println();
	} catch (PrsDataException e) {
		System.err.println("Couldn't retrieve products. Msg: " + e.getMessage());
	}
	private static void listVendors() {
		VendorDB vendorDB = new VendorDB();
		List<vendor> vendors = vendorDB.getAll();
		
		for (vendor vendor : vendor) {
			System.out.println(vendor);
		}
		System.out.println();
	} catch (PrsDataException e) {
		System.err.println("Couldn't retrieve vendors. Msg: " + e.getMessage());
	}

}
