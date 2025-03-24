package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitNumbers {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(8, 7, 66, 54, 32, 12, 16, 9, 20);
		// limit
		List<Integer> limit = list.stream().limit(3).collect(Collectors.toList());
		System.out.println(limit);

		Integer num = list.stream().limit(3).reduce((p, q) -> p + q).get();
		System.out.println(num);

		// skip
		List<Integer> skip = list.stream().skip(3).collect(Collectors.toList());
		System.out.println(skip);

		Integer num1 = list.stream().skip(3).reduce((p, q) -> p + q).get();
		System.out.println(num1);

	}

}
