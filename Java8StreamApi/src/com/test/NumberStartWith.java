package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberStartWith {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2,222, 238,22,456,789,987,655,298);
		List<Integer> map = numbers.stream().map(e->String.valueOf(e))
				                   .filter(e->e.startsWith("2")).map(Integer::valueOf)
				                   .collect(Collectors.toList());
		System.out.println(map);

	}

}
