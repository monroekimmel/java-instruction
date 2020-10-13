package kimmel.app;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InstructionApp {

	public static void main(String[] args) {
		String dirString = "D:\\java";
		Path dirPath = Paths.get(dirString);
		System.out.println("exist returns " + Files.exists(dirPath));
		
		String fileString = "product.txt";
		Path filePath = Paths.get(dirString, fileString);
		System.out.println("exist returns ");
 
	}

}
