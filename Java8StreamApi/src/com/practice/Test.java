package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		Person p1=new Person("Siva","India");
		Person p2=new Person("Satish","Uk");
		Person p3=new Person("Girish","India");
		Person p4=new Person("Ganesh","Usa");
		Person p5=new Person("Srinu","Canada");
		
		List<Person> names = Arrays.asList(p1,p2,p3,p4,p5);
		
		List<Person> list = names.stream().filter(p->p.country.equals("India"))
				.collect(Collectors.toList());
		list.forEach(p->System.out.println(p));
		
		List<String> list2 = names.stream().filter(p->p.country.equals("Usa")).map(p->p.name)
				.collect(Collectors.toList());
		list2.forEach(p->System.out.println(p));
		
		

	}

}
