package hu.evosoft.java8.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLabSolution {

	static class Employee {

		private String name;

		private int salary;

		private String cardNumber;

		public Employee(String name, int salary, String cardNumber) {
			this.name = name;
			this.salary = salary;
			this.cardNumber = cardNumber;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}

		public String getCardNumber() {
			return cardNumber;
		}

		public void setCardNumber(String cardNumber) {
			this.cardNumber = cardNumber;
		}

		@Override
		public String toString() {
			return "Employee [name=" + name + ", salary=" + salary + ", cardNumber=" + cardNumber + "]";
		}

	}

	private static long numberOfEmployeesInTheStream(List<Employee> emps) {
		return emps.stream().count();
	}

	private static Integer minSalaryOfEmps(List<Employee> emps) {
		return emps.stream().map(e -> e.getSalary()).min(Comparator.naturalOrder())
				.orElseThrow(() -> new IllegalArgumentException("No records found!"));
	}

	private static List<Employee> searchEmployeesByName(List<Employee> emps, String prefix) {
		return emps.stream().filter(e -> e.getName().startsWith(prefix))
				.sorted((e1, e2) -> e1.getName().compareTo(e2.getName())).collect(Collectors.toList());
	}

	private static Employee findFirstEmployeeWithSalaryGreaterThan(List<Employee> emps, int salaryTreshold) {
		return emps.stream().filter(e -> e.getSalary() >= salaryTreshold).findFirst()
				.orElseThrow(() -> new IllegalArgumentException("No records found!"));
	}

	private static boolean allEmployeeNameHasAtLeastNCharacter(List<Employee> emps, int min) {
		return emps.stream().allMatch(e -> e.getName().length() >= min);
	}

	private static int calculateLenghtOfAllEmployeesName(List<Employee> emps) {

		return emps.stream().map(e -> e.getName().length()).reduce(0, (i, i2) -> i + i2, (i, i2) -> i + i2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> emps = new ArrayList<StreamLabSolution.Employee>();

		emps.add(new Employee("Attila", 3500, "111111111111"));
		emps.add(new Employee("Bela", 3000, "211111111111"));
		emps.add(new Employee("Janos", 2500, "311111111111"));
		emps.add(new Employee("Adam", 4500, "411111111111"));

		System.out.println(numberOfEmployeesInTheStream(emps));
		System.out.println(minSalaryOfEmps(emps));
		System.out.println(searchEmployeesByName(emps, "A"));
		System.out.println(calculateLenghtOfAllEmployeesName(emps));
		System.out.println(findFirstEmployeeWithSalaryGreaterThan(emps, 3000));
		System.out.println(allEmployeeNameHasAtLeastNCharacter(emps, 5));

	}

}
