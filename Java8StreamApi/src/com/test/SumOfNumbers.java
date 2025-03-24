package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(22,31,2,3,4,5,6,12,16,5,9,8);
		
		Optional<Integer> reduce = list.stream().reduce((a,b)->a + b);
		System.out.println("Sum of number::"+reduce.get());
		

	}

}
