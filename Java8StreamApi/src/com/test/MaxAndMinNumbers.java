package com.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMinNumbers {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(22,1,33,5,66,44,7,88,9,3);
		
		Integer i = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(i);
		
		Integer i1 = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(i1);
		
		

	}

}
