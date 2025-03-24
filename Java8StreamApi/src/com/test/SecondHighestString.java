package com.test;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestString {

	public static void main(String[] args) {
		String s="I am Learning Stream Java";
		
		String secSh = Arrays.stream(s.split(" "))
		         .sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst().get();
		System.out.println(secSh);

	}

}
