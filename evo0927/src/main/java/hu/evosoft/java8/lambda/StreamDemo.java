package hu.evosoft.java8.lambda;

import java.util.IntSummaryStatistics;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;
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
		
		IntStream stream1to10 = IntStream.rangeClosed(1, 10);
		double avg = stream1to10.average().getAsDouble();				
		System.out.println("Avg :"+ avg);
		
		IntStream stream1to9 = IntStream.range(1, 10);
		IntSummaryStatistics statistics = stream1to9.summaryStatistics();
		int min = statistics.getMin();
		int max = statistics.getMax();
		avg = statistics.getAverage();
		System.out.println("Min:"+min + " max:"+max + " avg:"+avg);
		
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
