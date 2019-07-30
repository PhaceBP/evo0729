package hu.evosoft.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {

		List<Employee> emps = new ArrayList<Employee>();

		Employee e = new Employee();
		e.setId(1L);
		e.setSalary(10000000L);
		e.setName("Peter");
		emps.add(e);
		e = new Employee();
		e.setId(2L);
		e.setSalary(100L);
		e.setName("Attila");
		emps.add(e);

		getEmployeesBy(emps, emp -> emp.getSalary() > 1000).stream().forEach(System.out::println);
	}

	public static List<Employee> getEmployeesBy(List<Employee> emps, Predicate<Employee> cond) {
		return emps.stream().filter(cond).collect(Collectors.toList());
	}

}
