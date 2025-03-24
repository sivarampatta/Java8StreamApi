package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenNumbers {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(11,2,4,3,5,8,9,6,13,19);
		List<Integer> even = list.stream().filter(e->e%2==0)
		                         .collect(Collectors.toList());
		System.out.println("Even Numbers::"+even);
		
		List<Integer> odd = list.stream().filter(e->e%2!=0)
		                     .collect(Collectors.toList());
		System.out.println("Odd numbers::"+odd);
		
		
		
	}

}
