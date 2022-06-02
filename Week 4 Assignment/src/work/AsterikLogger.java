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
		//n + n/2 asteriks length is n is equal to the total length of the entered message and each side of
		//the middle row would have n/4 asteriks.
		
		int length = error.length() + 7;
		int reducerTopBottom = length + Math.floorDiv(length, 2) - 1;
		
		
		
		
		while (reducerTopBottom != 0) {
			System.out.print("*");
			reducerTopBottom --;
		}
		
		int reducerMid = Math.floorDiv(length, 4) - 1;
		System.out.println("*");
		while (reducerMid >= 0) {
			System.out.print("*");
			reducerMid --;
		}
		
		System.out.print("Error: " + error);
		reducerMid = Math.floorDiv(length, 4) - 2;
		
		while (reducerMid >=  0) {
			System.out.print("*");
			reducerMid --;
		}
		
		reducerTopBottom = length + Math.floorDiv(length, 2) - 1;
		System.out.println("*");
		
		while (reducerTopBottom >= 0) {
			System.out.print("*");
			reducerTopBottom --;
		}
		System.out.println();
		
		
		
		
		
	}
}
