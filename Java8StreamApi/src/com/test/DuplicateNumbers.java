package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateNumbers {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(22,3,4,1,5,6,7,22,2,7);
		List<Integer> dup = list.stream().filter(e->Collections.frequency(list, e)>1)
				                  .collect(Collectors.toList());
		System.out.println(dup);
		
		

	}

}
