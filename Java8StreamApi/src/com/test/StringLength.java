package com.test;

import java.util.Arrays;
import java.util.Comparator;

public class StringLength {

	public static void main(String[] args) {
		String s="I am Learning Stream Api";
		
		//second Highest string
		Integer integer = Arrays.stream(s.split(" "))
				             .map(e->e.length()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(integer);
        
        //second lowest string
        Integer integer2 = Arrays.stream(s.split(" "))
        		.map(e->e.length()).sorted().skip(1).findFirst().get();
        
        System.out.println(integer2);

	}

}
