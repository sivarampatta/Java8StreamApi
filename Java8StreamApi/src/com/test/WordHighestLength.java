package com.test;

import java.util.Arrays;
import java.util.Comparator;

public class WordHighestLength {

	public static void main(String[] args) {
		String s="I am Learning Stream Api Java";
		
		String string = Arrays.stream(s.split(" "))
				              .max(Comparator.comparing(String::length)).get();
		System.out.println(string);

	}

}
