// Question 9
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Question 10
		AsteriskLogger asterisk = new AsteriskLogger();
		SpacedLogger space = new SpacedLogger();
		
		//Question 11
		asterisk.log("This looks important!");
		System.out.println();
		
		asterisk.error("Uh-oh, this can't be good!");
		System.out.println();
		
		space.spaceLog("Spaaaaaaaace.");
		System.out.println();
		
		space.spaceError("Too much space.");
		
		
		
	}

}
