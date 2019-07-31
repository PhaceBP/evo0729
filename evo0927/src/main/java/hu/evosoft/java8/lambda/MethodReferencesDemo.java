package hu.evosoft.java8.lambda;

import java.util.Comparator;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class MethodReferencesDemo {

	@FunctionalInterface
	interface ThreadSupplier {

		Thread giveMeAThread();
	}

	static class Employee {

		private String name;
		private int salary;

		public Employee(String name, int salary) {
			super();
			this.name = name;
			this.salary = salary;
		}

		public String getName() {
			return name;
		}

		public int getSalary() {
			return salary;
		}

		@Override
		public String toString() {
			return "Employee [name=" + name + ", salary=" + salary + "]";
		}

	}

	public static void main(String[] args) {

		// Static method reference
		testStaticMethodReferences();
		testInstanceMethodReferences();
		testInstanceMethodReferencesWithoutInstance();
		testInstanceMethodReferenceWithoutInstanceComparator();

	}

	private static void testStaticMethodReferences() {

		Supplier<Thread> s1 = Thread::currentThread;
		// Custom functional interface
		ThreadSupplier ts = Thread::currentThread;

		System.out.println("Current thread is: " + ts.giveMeAThread());
	}

	private static void testInstanceMethodReferences() {

		Employee e = new Employee("Attila", 40000);
		Supplier<Integer> salary2 = e::getSalary;
		System.out.println(salary2.get());

		Consumer<String> c1 = System.out::println;

		c1.accept("Hello method reference!");

	}

	private static void testInstanceMethodReferencesWithoutInstance() {

		Function<Employee, Integer> fi = Employee::getSalary;
		Employee e = new Employee("Attila", 40000);
		Integer salary = fi.apply(e);

		System.out.println(salary);
	}

	private static void testInstanceMethodReferenceWithoutInstanceComparator() {

		Comparator<Employee> bySalary = Comparator.comparing(Employee::getSalary);

		Stream.Builder<Employee> builder = Stream.builder();

		// Adding elements in the stream of Strings
		Stream<Employee> stream = builder.add(new Employee("Attila", 3000)).add(new Employee("Roland", 2000))
				.add(new Employee("Janos", 1000)).build();

		stream.sorted(bySalary).forEach(System.out::println);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
