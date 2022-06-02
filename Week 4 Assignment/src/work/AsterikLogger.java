package work;

public class AsterikLogger implements Logger {

	@Override
	public void Log(String log) {
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void Error(String error) {
		//According to the word document instructions, I counted 12 total spaces in the middle line
		//with 6 asteriks (3 on each side) and so I would conclude that the top and bottom row have
		//n + n/2 asteriks length if n is equal to the total length of the entered message and each side of
		//the middle row would have n/4 asteriks.
		
		int length = error.length() + 7; //There are seven characters in "Error: " (line 36)
		int reducerTopBottom = length + length/2 - 1;
		int reducerMid = length/4 - 1;
		
		
		
		while (reducerTopBottom != 0) {
			System.out.print("*");
			reducerTopBottom --;
		}
		
		
		System.out.println("*");
		
		while (reducerMid >= 0) {
			System.out.print("*");
			reducerMid --;
		}
		
		System.out.print("Error: " + error);
		
		//Reassign for asteriks following error message.
		
		reducerMid = length/4;
		
		while (reducerMid !=  0) {
			System.out.print("*");
			reducerMid --;
		}
		
		//Reassing reducer for bottom layer
		reducerTopBottom = length + length/2;
		
		System.out.println("*");
		
		while (reducerTopBottom != 0) {
			System.out.print("*");
			reducerTopBottom --;
		}
		System.out.println();
		
		
		
		
		
	}
}
