package hu.evosoft.generics;

import java.util.ArrayList;
import java.util.List;

public class CovarianceContravarianceDemo {

	
	
	@SuppressWarnings("deprecation")
	public static void main(String[]args) {
		
		
		Number[] numbers = new Number[10];
		
		numbers[0] = 1;
		numbers[1] = 3.14d;
		
		System.out.println(numbers.length);
		
		
		Integer[] integerNumbers = new Integer[10];
		
		numbers = integerNumbers;
		numbers[2] = 3.14;
		
		System.out.println(numbers.length);
		
		
		List<? super Number> list1 = new ArrayList();
		
		
		list1.add(new Integer(1));
		list1.add(Double.valueOf(3.14d));
	}
}
