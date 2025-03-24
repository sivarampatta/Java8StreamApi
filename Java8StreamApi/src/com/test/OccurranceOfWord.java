package com.test;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurranceOfWord {

	public static void main(String[] args) {
		String s = "I am Learning Streams Api java java";
		Map<String, Long> result = Arrays.stream(s.split(" "))
				.collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		System.out.println(result);

	}

}
