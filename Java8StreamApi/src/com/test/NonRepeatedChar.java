package com.test;

import java.util.Arrays;

public class NonRepeatedChar {

	public static void main(String[] args) {
		String s="Hello World";
		
		String string = Arrays.stream(s.split(""))
				  .filter(c->s.indexOf(c)==s.lastIndexOf(c)).findFirst().get();
		System.out.println(string);

	}

}
