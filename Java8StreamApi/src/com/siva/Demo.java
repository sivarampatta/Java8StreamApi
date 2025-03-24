package com.siva;

import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("india", "uk", "us", "korea", "china", "korea");

		// list.stream().map(m->m.toUpperCase()).forEach(m->System.out.println(m));

		list.stream().mapToInt(m -> m.length()).forEach(m -> System.out.println(m));

	}

}
