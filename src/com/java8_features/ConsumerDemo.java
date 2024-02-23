package com.java8_features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
//		Method 1
		Consumer<Integer> consumer = (i)-> System.out.println(i); 
		list.forEach(consumer);
		
//		Simplify method 1
		list.forEach((i)-> System.out.println(i));
		
	}

}
