package hu.evosoft.generics;

import java.util.ArrayList;
import java.util.List;

public class CovarianceContravarianceDemo2 {

	
	public static void main(String[] args) {

		List<? extends Number> list1 = new ArrayList<Number>();
		list1 = new ArrayList<Integer>();
		list1 = new ArrayList<Double>();

		///////////////////////////////////////////////////

		List<? super Integer> list2 = new ArrayList<Number>();
		list2 = new ArrayList<Integer>();
		list2 = new ArrayList<Object>();
	
	}
}
