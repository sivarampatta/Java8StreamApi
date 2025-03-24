package com.practice;

import java.util.Arrays;
import java.util.List;

public class FirstDemo {

	public static void main(String[] args) {
		Person p1 = new Person("Nagesh", "USA");
		Person p2 = new Person("Satya", "JAPAN");
		Person p3 = new Person("Anil", "INDIA");
		Person p4 = new Person("Ching", "CHINA");
		
		List<Person> names = Arrays.asList(p1,p2,p3,p4);
		
		boolean match = names.stream().anyMatch(p->p.country.equals("INDIA"));
		System.out.println(match);
		
		boolean match2 = names.stream().allMatch(p->p.country.equals("USA"));
		System.out.println(match2);
		
		boolean match3 = names.stream().noneMatch(p->p.country.equals("CHINA"));
		System.out.println(match3);

	}

}
