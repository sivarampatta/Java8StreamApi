package com.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Driver {

	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Ram",19,100000,"Male","Engineer","Pune",2019);
		Employee e2 = new Employee(2,"Narayana",28,200000,"Male","Engineer","Chennai",2020);
		Employee e3 = new Employee(3,"Bhavani",26,300000,"Female","Engineer","Banguluru",2022);
		Employee e4 = new Employee(4,"pavani",27,400000,"Female","HR","Hyderabad",2021);
		Employee e5 = new Employee(5,"Mallesh",31,500000,"Male","Engineer","kakinada",2019);
		
		List<Employee> list = Arrays.asList(e1,e2,e3,e4,e5);
		//Group Employee By City
		Map<String, List<Employee>> city = list.stream()
				                .collect(Collectors.groupingBy(Employee::getCity));
		System.out.println("Employee City:: "+city);
		
		//Group Employee By Age
		Map<Integer, List<Employee>> age = list.stream()
				                    .collect(Collectors.groupingBy(Employee::getAge));
		System.out.println("Employee Age:: "+age);
		
		//Count of male and female Employees
		Map<String, Long> Gendercount = list.stream()
				                  .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println("Count of male and female:: "+Gendercount);
		
		//All deptname in org
		list.stream().map(Employee::getDeptName).distinct().forEach(e->System.out.println(e));
		
		//Employee age is greater than 28
		System.out.println("Employee details whose age is greater than 28");
		list.stream().filter(e->e.getAge()>28).forEach(e->System.out.println(e));
		
		//find max.age
		OptionalInt a = list.stream().mapToInt(Employee::getAge).max();
		if(a.isPresent()) {
			System.out.println("Employee Maximum age"+a.getAsInt());
		}
		
		//Avg age male and female
		Map<String, Double> avgage = list.stream()
		       .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
		System.out.println("Male and Female Average Age::"+avgage);

		//No of Employees in each dept
		Map<String, Long> deptname = list.stream()
				       .collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()));
		System.out.println("No of Employees in Each Dept:: "+deptname);
		
		//Find Oldest Employee
		Optional<Employee> oldest = list.stream().max(Comparator.comparingInt(Employee::getAge));
		if(oldest.isPresent()) {
			Employee oldestemp =oldest.get();
			System.out.println("Oldest Employee ::"+oldestemp);
		}
		
		//Find Yougest Female Emplloyee
		Optional<Employee> yougestagefemale = list.stream()
				.filter(e->e.getGender().equals("Female")).min(Comparator.comparingInt(Employee::getAge));
		if(yougestagefemale.isPresent()) {
			Employee minagefemale = yougestagefemale.get();
			System.out.println("Yougest Female Employee::"+minagefemale);
		}else {
			System.out.println("No feamle Employees Found in the list");
		}
		
		//finding Employees by age range
		System.out.println("Employees wh age is greater than 25 lessthan 25");
		Map<Boolean,List<Employee>> collect = list.stream()
				               .collect(Collectors.partitioningBy(e->e.getAge()>30));
		Set<Map.Entry<Boolean, List<Employee>>> empSet = collect.entrySet();
		for(Map.Entry<Boolean, List<Employee>> entry:empSet) {
			if(Boolean.TRUE.equals(entry.getKey())) {
				System.out.println("Employee greater than 30 years::"+entry.getValue());
			}else {
				System.out.println("Employee less than 30 years::"+entry.getValue());
			}
			
			//Finding department name with highest no of employees
			
			Map.Entry<String, Long> dept = list.stream()
			.collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()))
			.entrySet().stream().max(Map.Entry.comparingByKey()).get();
		System.out.println("Max. Employees present in the dept name::"+dept.getKey());
		
		
		//Employees from HR dept
		Optional<Employee> any = list.stream()
				 .filter(e->e.getDeptName().equalsIgnoreCase("HR")).findAny();
		
		if(any.isPresent()) {
			Employee emp=any.get();
			System.out.println("NO Employees in HR dept"+emp);
		}
		
		//Finding dept with over 3 employees
		System.out.println("Department names where the number of employees in the department is over 3 :: ");
		
		list.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting())).entrySet()
		.stream().filter(e->e.getValue()>3).forEach(System.out::println);
		
		//Finding distinct dept names
		System.out.println("Distinct department names that employees work for::");
		list.stream().map(Employee::getDeptName).distinct().forEach(System.out::println);
		
		//sorting By employees city
		list.stream().filter(e->e.getCity().equalsIgnoreCase("Kakinada"))
		.sorted(Comparator.comparing(Employee::getName)).forEach(e->System.out.println(e));
		
		//Employee count in every dept
		Map<String, Long> count = list.stream()
				.collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()));
		System.out.println("Employee count in every dept::"+count);
		
		//Sorting Employees by name and age
		System.out.println("Sorting based on name and age");
		Comparator<Employee> comparator1 = Comparator.comparing(Employee::getName);

		// Comparator for sorting by age
		Comparator<Employee> comparator2 = Comparator.comparingInt(Employee::getAge);

		// Sorting the stream of employees using comparator chaining
		list.stream().sorted(comparator1.thenComparing(comparator2)).forEach(System.out::println);
		
		
		//Highest experinced employee
		Optional<Employee> optional = list.stream().sorted(Comparator.comparing(Employee::getYearOfJoining)).findFirst();
		System.out.println("Senior Employee Details: " +optional.get());
		
		//avg and total salary of org.
		  DoubleSummaryStatistics empSalary = list.stream()
		            .collect(Collectors.summarizingDouble(Employee::getSalary));
		        System.out.println("Average Salary in the organisation = " + empSalary.getAverage());
		        System.out.println("Total Salary in the organisation = " + empSalary.getSum());
		
		        //avg salary of each dept
		        System.out.println("Avg salary of each department");
		        Map<String,Double> map = list.stream()
		        .collect(Collectors.groupingBy(Employee::getDeptName,Collectors.averagingDouble(Employee::getSalary)));
		Set<Map.Entry<String,Double>> entrySet = map.entrySet();
		for(Map.Entry<String,Double> e:entrySet) {
			System.out.println(e.getKey()+" :"+e.getValue());
		}
		
		//Highest salary in the org
		
		Optional<Employee> Salary = list.stream()
				.sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst();
		
		 System.out.println("Highest salary in the org::"+Salary.get());
		 
		 //second highest salary in org
		 
		 Optional<Employee> secSalary = list.stream()
				 .sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();
			
		 System.out.println("Second Highest salary in the org::"+secSalary.get());
		 
		 //nth highest salary in org
		 int n = 3; // Represents the Nth highest salary to find

		 Optional<Employee> empNthHighest = list.stream()
				 .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())

		 .skip(n - 1)

		 .findFirst();

		 System.out.println("Nth Highest Salary in the organisation : " + empNthHighest.get().getSalary());
		
		
		//Highest Paid Salary in the Organization Based on Gender
		 Map<String,Optional<Employee>> highestMF = list.stream()
				 .collect(Collectors.groupingBy(Employee::getGender,Collectors.maxBy((t1, t2) -> (int) (t1.getSalary() - t2.getSalary()))));
		System.out.println("Highest paid salary in org based on gender::"+highestMF);
		
		//Finding the Lowest Paid Salary in the Organization Based on Gender
		 Map<String, Optional<Employee>> lowestMF = list.stream()
				 .collect(Collectors.groupingBy(Employee::getGender,Collectors.minBy((t1, t2) -> (int) (t1.getSalary() - t2.getSalary()))));
		System.out.println("Highest paid salary in org based on gender::"+lowestMF);
		
		//Sorting Employees' Salary in Ascending Order
		List<Employee> salaryasc = list.stream().sorted(Comparator.comparing(Employee::getSalary)).toList();
		System.out.println("Employees' Salary in Ascending Order::"+salaryasc);
		
		//Sorting Employees' Salary in Descending Order
				List<Employee> salarydsc = list.stream()
						.sorted(Comparator.comparing(Employee::getSalary).reversed()).toList();
				System.out.println("Employees' Salary in descending Order::"+salarydsc);
		
		
		}

	}

}
