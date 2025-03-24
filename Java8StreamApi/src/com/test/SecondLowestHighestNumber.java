package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class SecondLowestHighestNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,15,18,23,26,29,32,37,43,48);
		//Second Highest
		Integer secH = list.stream().sorted(Collections.reverseOrder())
				.limit(2).distinct().skip(1).findFirst().get();
		System.out.println(secH);
		
		Integer secHh = list.stream()
			  .sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println(secHh);
		
		//Second Lowest
		Integer secL = list.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println(secL);
		

	}

}
