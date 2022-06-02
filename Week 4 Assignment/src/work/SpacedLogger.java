package work;

public class SpacedLogger implements Logger{

	@Override
	public void Log(String log) {
		//Should print spaces between each letter : Hello = "H e l l o"
		System.out.println(spacedString(log));
		
	}

	@Override
	public void Error(String error) {
		//Same as above but with a preceding ERROR: 
		System.out.println("ERROR: " + spacedString(error));

		
	}
	
	public String spacedString(String str) {
		String newString = "";
		for (int i=0; i <= str.length() - 1; i++) {
			char index = str.charAt(i);
			newString += index + " ";
		}
		return newString;
		
	}


}
