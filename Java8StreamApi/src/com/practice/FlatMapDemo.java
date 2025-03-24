package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo {

	public static void main(String[] args) {
		List<String> javacourses = Arrays.asList("java8","springboot","corejava","advance java");
		List<String> uicourses = Arrays.asList("javascript","html","css","bootsrap");
		
		List<List<String>>  courses = Arrays.asList(javacourses, uicourses);
		
		courses.stream().flatMap(li->li.stream()).forEach(data->System.out.println(data));
		

	}

}
