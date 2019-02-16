
public class SpacedLogger {

	// Question 6
	public void spaceLog(String log) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < log.length(); i++) {
			result.append(" " + log.charAt(i));
		}
		System.out.println(result.toString());
		
	}
	
	// Question 8
	public void spaceError(String error) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < error.length(); i++) {
			result.append(" " + error.charAt(i));
		}
		System.out.println("ERROR: " + result.toString());
	}
	
}
