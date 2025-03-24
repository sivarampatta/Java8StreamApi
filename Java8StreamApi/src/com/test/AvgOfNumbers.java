package com.test;

import java.util.Arrays;
import java.util.List;

public class AvgOfNumbers {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,3,5,7,9,11,13,15,17,20);
		
		double d = list.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println("Avg is::"+d);

	}

}
