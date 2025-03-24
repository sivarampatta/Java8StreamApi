package com.test;

import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("kamesh","syam","karthik","mallesh");
		list.stream().filter(i->i.startsWith("m")).forEach(i->System.out.println(i));

	}

}
