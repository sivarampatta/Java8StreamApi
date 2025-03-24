package com.practice;

public class Person {
	
	String name;
	String country;
	public Person(String name, String country) {
		
		this.name = name;
		this.country = country;
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", country=" + country + "]";
	}
	
	
	

}
