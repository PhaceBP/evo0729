package hu.evosoft.java8.lambda;

import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	class Employee {

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

	}

	public List<Employee> sortByName(List<Employee> employees) {
		employees.sort(Comparator.comparing(Employee::getName));
		return employees;
	}

	public List<Employee> sortBySalaryThanName(List<Employee> employees) {
		employees.sort(Comparator.comparingInt(Employee::getSalary).thenComparing(Employee::getName));
		return employees;
	}

	public List<Employee> sortByCardNumberNullsFirst(List<Employee> employees) {
		employees.sort(Comparator.comparing(Employee::getCardNumber, Comparator.nullsFirst(Comparator.naturalOrder()))
				.thenComparing(Employee::getName));
		return employees;
	}

	public List<Employee> sortByNameReversed(List<Employee> employees) {
		employees.sort(Comparator.comparing(Employee::getName).reversed());
		return employees;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
