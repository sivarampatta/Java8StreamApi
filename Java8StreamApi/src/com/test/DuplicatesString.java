package com.test;

import java.util.Arrays;

public class DuplicatesString {

	public static void main(String[] args) {
		String s = "ramarao";

		Arrays.stream(s.split("")).distinct().forEach(System.out::print);

	}

}
