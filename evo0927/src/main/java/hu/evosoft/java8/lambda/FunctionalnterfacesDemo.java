package hu.evosoft.java8.lambda;

import java.time.LocalDateTime;
import java.util.Objects;

public class FunctionalnterfacesDemo {

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

	public static String getApplicationStatus() {
		System.out.println("getApplicationStatus invoked!");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "Current system time is : " + LocalDateTime.now();
	}

	public static Employee createEmployee(String name, Integer salary) {

		Objects.requireNonNull(name, "Name property cannot be null! " + getApplicationStatus());
		Objects.requireNonNull(salary, "Salary property cannot be null! " + getApplicationStatus());

		return new Employee(name, salary);
	}

	public static Employee createEmployee2(String name, Integer salary) {

		Objects.requireNonNull(name,() -> "Name property cannot be null! " + getApplicationStatus());
		Objects.requireNonNull(salary,()-> "Salary property cannot be null! " + getApplicationStatus());

		return new Employee(name, salary);
	}

	
	public static void main(String[] args) {
		
		System.out.println(createEmployee("Attila", null));
		System.out.println(createEmployee2("Attila", null));

	}

}
