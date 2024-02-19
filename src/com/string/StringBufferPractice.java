package com.string;

public class StringBufferPractice {

	public static void main(String[] args) {

		StringBuffer str = new StringBuffer("Hello world");
		System.out.println(str);
		str.append(" in java");
		System.out.println(str);
		
		str.insert(0, "Hi ");
		System.out.println(str);
		str.append(" Ajay");
		
		str.replace(18, 22, "Python");
		System.out.println(str);
		
		str.delete(18, 23);
		System.out.println(str);
		
		System.out.println(str.capacity());
		System.out.println(str.length());

	}
}
