import java.util.Arrays;

public class AsteriskLogger {
	
	// Question 4
	public void log(String log) {
		System.out.println("***" + log + "***");
	}
	
	// Question 5
	public void error(String error) {
		String errorText = "***ERROR: " + error + "***";
		int i = (errorText.length());
		String errorBorder = "";
		char asterisk = '*';
		char[] repeat = new char[i];
		Arrays.fill(repeat, asterisk);
		errorBorder += new String(repeat);
		
		System.out.println(errorBorder);
		System.out.println(errorText);
		System.out.println(errorBorder);
	}
	
}
