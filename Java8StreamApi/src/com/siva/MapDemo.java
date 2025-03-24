package com.siva;

import java.util.Arrays;
import java.util.List;

public class MapDemo {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("mallesh", "sivaram", "Ashok", "Anil", "hari", "lokesh", "ganesh");

		list.stream().filter(m -> m.startsWith("A")).map(m -> m + "---" + m.length())
				.forEach(m -> System.out.println(m));

	}

}
