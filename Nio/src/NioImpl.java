import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface TotalCharCount {
	public void print();
}

public class NioImpl implements NioInterface{
	
	@Override
	public int lineCharCount(int lineNumber) {
		int charCount = 0;
		try {
			String lineString = (ApplicationConstant.allLines).get(lineNumber);
			for (int i = 0; i < lineString.length(); i++) {
				if (lineString.charAt(i) != ' ') {
					charCount++;
				}
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("No line exist");
		} catch (Exception e) {
			System.out.println("Invalid");
		}
		return charCount;
	}
	
	@Override
	public void sortAlphabetically() {
		System.out.println("Sorted Lines : \n");
		List<String> sortedListAlphabeticalOrders = (ApplicationConstant.allLines).stream()
				.map(s -> s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase()).sorted()
				.collect(Collectors.toList());
		for (String line : sortedListAlphabeticalOrders) {
			System.out.println(line);
		}
	}
	
	@Override
	public void totalLines() {
		int totalLinesCount = 0;
		System.out.println("Lines : \n");
		for (String line : (ApplicationConstant.allLines)) {
			System.out.println(line);
			totalLinesCount++;
		}
		System.out.println("Total Number of Lines : "+totalLinesCount);
	}
	
	@Override
	public void totalLineCount() {
		TotalCharCount totalCharCount = () -> {
			long totalCountTemp = 0;
			int totalLines = (ApplicationConstant.allLines).size();
			for (int i = 0; i < totalLines; i++) {
				totalCountTemp += lineCharCount(i);
			}
			System.out.println("\nTotal Characters in file = " + totalCountTemp);
		};
		
		totalCharCount.print();
	}
}
