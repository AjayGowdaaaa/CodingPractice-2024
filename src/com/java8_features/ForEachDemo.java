package com.java8_features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

//		External Loops

//		Normal for loop (index based)
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");

		System.out.println();
		
//		Enhanced for loop
		for (int i : list)
			System.out.print(i + " ");
		
		System.out.println();
		
//		Internal Iterations
//		ForEach Method
		
//		1 way
		Consumer<Integer> listOfNumbers = new Consumer<>() {
		    @Override
		    public void accept(Integer num) {
		      //More statements if needed
		      System.out.println(num);
		    }
		};
		list.forEach(listOfNumbers); 
		
//		2nd way
		list.forEach(System.out::println);
		
//		3rd way
		list.forEach(i -> System.out.println(i));
		
		
		

	}

}
