package com.practice;

import java.util.Arrays;
import java.util.List;

public class SlicingDemo {

	public static void main(String[] args) {
			List<String> list = Arrays.asList("ganesh","deva","parnika","leeyansh","parnika");
			
			
			list.stream().limit(2).forEach(name->System.out.println(name));
			System.out.println("-------------------------");
			list.stream().skip(1).forEach(names->System.out.println(names));
			System.out.println("--------------------------");
			list.stream().distinct().forEach(data->System.out.println(data));
			

	}

}
