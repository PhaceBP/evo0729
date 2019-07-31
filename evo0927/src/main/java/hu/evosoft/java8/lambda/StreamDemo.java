package hu.evosoft.java8.lambda;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {

		
		// Stream letrehozasa
		Stream<String> s1 = Stream.empty();

		Stream<Double> s2 = Stream.generate(Math::random);

		Stream<Integer> s3 = Stream.iterate(1, i -> i + 2);

		Stream<String> s4 = Stream.of("alma", "korte");

		Stream.Builder<String> builder = Stream.builder();

		Stream<String> s5 = builder.add("alma").add("korte").build();
		
		reduceExample();
	}
	
	
	private static void reduceExample() {
		
		BinaryOperator<Integer> op = (a,b) -> a*b;
		Stream<Integer> stream = Stream.of(3,5,6);
		System.out.println(stream.reduce(1,op));
		stream = Stream.of(3,5,6);
		System.out.println(stream.reduce(op).get());
		stream = Stream.of(3,5,6);
		System.out.println(stream.reduce(1,op,op));
	}
}
