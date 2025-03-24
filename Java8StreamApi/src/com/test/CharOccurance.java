package com.test;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CharOccurance {

	public static void main(String[] args) {
		String s = "Mississippi";
		Map<String, Long> CharOcc = Arrays.stream(s.split(""))
				.collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		System.out.println(CharOcc);

	}

}
