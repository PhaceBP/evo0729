package hu.evosoft.java8.lambda;

import java.util.function.Consumer;

public class VariableCapturingDemo {

	
	private static final int SECRET = 42;
	
	public static void main(String[] args) {

		testWithNormalAnonymusClass();
		testLambdaExpressionWithoutVC();
		testLambdaExpressionWithStaticVC();
		testLambdaExpressionWithInstanceVC();
	}
	
	public static void testWithNormalAnonymusClass() {
		
		for (int i = 0; i < 5; i++) {

			Consumer<String> printer = new Consumer<String>() {

				@Override
				public void accept(String t) {
					System.out.println(t);
				}
			};
			
			printer.accept("Consuming with anonymus class > "+printer.toString());
		}
	}

	public static void testLambdaExpressionWithoutVC() {
		
		for (int i = 0; i < 5; i++) {

			Consumer<String> printer = msg -> System.out.println("Consuming without VC > " + msg);

			printer.accept(printer.toString());
		}
	}
	
	public static void testLambdaExpressionWithStaticVC() {
		
		for (int i = 0; i < 5; i++) {

			Consumer<String> printer = msg -> System.out.println("Consuming with static VC "+ SECRET + " > "+msg);

			printer.accept(printer.toString());
		}
	}
	
	
	public static void testLambdaExpressionWithInstanceVC() {
		
		
		int localSecret = 42;
		
		for (int i = 0; i < 5; i++) {
			Consumer<String> printer = msg -> System.out.println("Consuming with instance VC "+ localSecret + " > "+msg);
			printer.accept(printer.toString());
		}
	}

}
