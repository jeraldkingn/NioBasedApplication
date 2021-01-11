import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
	
	/**
	 * 
	 *  
	 * ---------Nio Assessment-------------
	 * 
	 * 
	 * 1) totalLines prints all the lines and the total lines count of file
	 * 2) Provide sample input - int for linecharcount || lineCharCount(21) -----> Returns total char in the line  
	 * 3) sortAlphabetically prints the line in the sorted Format
	 * 4) totalLineCount prints the total characters in the file ( Implemented with lambda )
	 * 
	 * Added text file in the getInput Method 
	 * 
	 * !important ---> Change dir in getInput method before implementing
	 * 
	 * 
	 */

	static NioService nioServiceObject = NioService.getInterfaceObj();

	public static void main(String[] args) {

		getInput();

		nioServiceObject.totalLines();

		System.out.println("\n\n---------------------------------------\n\n");

		System.out.println("Total Character Count  Present is " + nioServiceObject.lineCharCount(24));

		System.out.println("\n\n---------------------------------------\n\n");

		nioServiceObject.sortAlphabetically();

		System.out.println("\n\n---------------------------------------\n\n");

		nioServiceObject.totalLineCount();

		System.out.println("\n\n---------------------------------------\n\n");
	}
	
	public static void getInput() {
		try {
			List<String> allLines = Files.readAllLines(Paths.get("/Users/jnavaraj/Downloads/test.txt"));
			ApplicationConstant.allLines = allLines;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
