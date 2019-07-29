package hu.evosoft.generics;

import java.io.Serializable;

public class GenericsDemo1 {

	public static void main(String[] args) throws Exception {

		Test obj = get(Test.class);

		obj.print();

	}

	static class Test implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = 3296315329474171839L;

		public void print() {
			System.out.println("Hello Generics!");
		}
	}

	public static <T extends Serializable> T get(Class<T> clazz) throws Exception {

		return clazz.getDeclaredConstructor().newInstance();
	}
}
