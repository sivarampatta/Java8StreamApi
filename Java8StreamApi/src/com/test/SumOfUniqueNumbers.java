package com.test;

import java.util.Arrays;
import java.util.List;

public class SumOfUniqueNumbers {

	public static void main(String[] args) {
		int [] a = {1,2,3,1,6};
		
		int i = Arrays.stream(a).distinct().sum();
		System.out.println(i);
		

	}

}
