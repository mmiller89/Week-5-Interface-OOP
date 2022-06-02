package work;

public class Application {

	public static void main(String[] args) {
		Logger AstLogger = new AsterikLogger();
		Logger SpaceLogger = new SpacedLogger();
		
		AstLogger.Error("Hello");
		System.out.println();
		AstLogger.Log("Hello");
		
		SpaceLogger.Log("Hello there comrade!");
		SpaceLogger.Error("This is a MALFUNCTION!");
		
		

	}

}
