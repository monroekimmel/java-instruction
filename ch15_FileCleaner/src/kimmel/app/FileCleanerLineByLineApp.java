package kimmel.app;

public class FileCleanerLineByLineApp {

	public static void main(String[] args) { public static void main(String[] args) {

		  System.out.println("File Cleaner");
		  System.out.println();

		  try (BufferedReader in = new BufferedReader(new FileReader(inputFilename));
		    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(outputFilename)))) {

		   String line = in.readLine();
		   while (line != null) {
		    Prospect p = createProspect(line);

		    out.print(p.getFirstName());
		    out.print(",");
		    out.print(p.getLastName());
		    out.print(",");
		    out.println(p.getEmail());

		    line = in.readLine();
		   }
		  } catch (IOException e) {
		   System.err.println(e);
		  }

		  System.out.println("Source file: " + inputFilename);
		  System.out.println("Cleaned file: " + outputFilename);
		  System.out.println();
		  System.out.println("Congratulations!");
		 }

	}

}
