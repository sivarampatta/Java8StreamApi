package com.test;

import java.util.Arrays;

public class FindVowels {

	public static void main(String[] args) {
		String s = "I am a Software Developer";
		Arrays.stream(s.split(" ")).filter(e -> e.replaceAll("[^aeiouAEIOU]", "").length() == 4)
				.forEach(System.out::print);

	}

}
