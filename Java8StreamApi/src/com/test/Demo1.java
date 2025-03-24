package com.test;

import java.util.stream.Stream;

public class Demo1 {

	public static void main(String[] args) {
		User u1 =new User("Sivaram",17);
		User u2 =new User("ram",26);
		User u3 =new User("raju",28);
		User u4 =new User("narayana",29);
		Stream<User> stream = Stream.of(u1,u2,u3,u4);
		
		//stream.filter(u-> u.age >= 18 ).forEach(u->System.out.println(u));
		
		//stream.filter(u->u.age>=18 && u.name.startsWith("r")).forEach(u->System.out.println(u));
		
		stream.filter(u->u.age >=18 ).filter(u->u.name.startsWith("r")).forEach(u->System.out.println(u));
		
		
		

	}

}
