package hu.evosoft.java8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReferenceLabSolution {

	static class Employee {

		private String name;
		private Integer salary;

		public Employee(String name, Integer salary) {
			super();
			this.name = name;
			this.salary = salary;
		}

		public String getName() {
			return name;
		}

		public Integer getSalary() {
			return salary;
		}

		@Override
		public String toString() {
			return "Employee [name=" + name + ", salary=" + salary + "]";
		}

	}

	public static void main(String[] args) {

		List<Employee> emps = new ArrayList<MethodReferenceLabSolution.Employee>();

		emps.add(new Employee("Attila", 3000));
		emps.add(new Employee("Roland", 2000));
		emps.add(new Employee("Janos", 1000));

		Function<Employee, Integer> extractor = Employee::getSalary;

		printObjects(emps, extractor);

		Function<Employee, String> extractor2 = Employee::getName;

		printObjects(emps, extractor2);

		Consumer<Employee> cons = o -> System.out.println(o.getName());

		printObjects(emps, cons);
	}

	private static <T, U> void printObjects(List<T> objects, Function<T, U> extractor) {
		objects.stream().forEach(o -> System.out.println("Object data: " + extractor.apply(o)));
	}

	private static <T, U> void printObjects(List<T> objects, Consumer<T> consumer) {
		objects.stream().forEach(consumer);
	}

}
