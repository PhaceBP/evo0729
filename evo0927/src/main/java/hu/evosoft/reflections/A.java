package hu.evosoft.reflections;

public class A {

	private String message;

	public A() {

	}

	public A(A obj) {

		System.out.println(obj.message);
	}
}
