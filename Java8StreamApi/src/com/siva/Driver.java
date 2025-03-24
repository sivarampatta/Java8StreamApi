package com.siva;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {
		Employee e1 = new Employee("Dhana", 100, "hyderebad", 80000);
		Employee e2 = new Employee("Ganesh", 101, "banguluru", 9000);
		Employee e3 = new Employee("Ramesh", 102, "chennai", 75000);
		Employee e4 = new Employee("Jagadesh", 103, "kakinada", 55000);
		Employee e5 = new Employee("Gireesh", 104, "kakinada", 40000);

		List<Employee> names = Arrays.asList(e1, e2, e3, e4, e5);

		Optional<Employee> op = names.stream().collect(Collectors.maxBy(Comparator.comparing(e -> e.EmployeeSalary)));
		if (op.isPresent()) {
			Employee emp = op.get();
			System.out.println("Max Salary::" + emp);
		}

		Optional<Employee> optional = names.stream()
				.collect(Collectors.minBy(Comparator.comparing(e -> e.EmployeeSalary)));
		System.out.println("Min Salary::" + optional.get());

		Double double1 = names.stream().collect(Collectors.averagingDouble(e -> e.EmployeeSalary));
		System.out.println("Avg By Salary::" + double1);

		Map<String, List<Employee>> result = names.stream().collect(Collectors.groupingBy(e -> e.EmployeeAddress));

		System.out.println("Grouping By address::" + result);
		
		names.stream().filter(m->m.getEmployeeSalary()>=40000)
		.forEach(m->System.out.println(m.getEmployeeName()+"--"+m.getEmployeeId()));

	}

}
