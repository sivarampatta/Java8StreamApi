package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,2,15,5,18,25,35,42,8,1,6);
		List<Integer> sort = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sort);
		
		List<Integer> reversesorted = list.stream()
				                .sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(reversesorted);
		

	}

}
