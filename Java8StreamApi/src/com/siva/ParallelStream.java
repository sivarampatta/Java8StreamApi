package com.siva;

import java.util.stream.Stream;

public class ParallelStream {

	public static void main(String[] args) {
		System.out.println("-----serial stream-----");
		Stream<Integer> stream = Stream.of(1,2,3,4,5);
		stream.forEach(e->System.out.println(e+"::"+Thread.currentThread()));
		
		System.out.println("-----Parallel stream-----");
		Stream<Integer> of = Stream.of(1,2,3,4,5);
		of.parallel().forEach(e->System.out.println(e+"::"+Thread.currentThread()));
		

	}

}
