package com.siva;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Test {

	public static void main(String[] args) {
		Employee e1=new Employee("Dhana",100,"hyderebad",80000);
		Employee e2=new Employee("Ganesh",101,"banguluru",9000);
		Employee e3=new Employee("Ramesh",102,"chennai",75000);
		Employee e4=new Employee("Jagadesh",103,"kakinada",55000);
		Employee e5=new Employee("Gireesh",104,"vizag",40000);
		
		Stream<Employee> stream = Stream.of(e1,e2,e3,e4,e5);
		//stream.filter(e->e.EmployeeSalary>=80000).forEach(e->System.out.println(e));
		
		stream.filter(e->e.EmployeeSalary>=50000 && e.EmployeeName.startsWith("J")).forEach(e->System.out.println(e));
		
				
		
	
		
		

	}

}
