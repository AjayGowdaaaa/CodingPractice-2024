package com.java8_features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 4, 7, 9, 3, 5, 9, 6, 7, 8);
		Stream<Integer> stream = list.stream();
		stream.distinct().sorted().forEach(i -> System.out.println(i));

		System.out.println("**********************************************");

		Stream<Integer> sort = list.stream().sorted();
		sort.forEach(i -> System.out.println(i));

//		Stream objects can be used only Once if you try to use again it will throw an exception

//		stream.forEach(i -> System.out.println(i));

//		If i want to perform double action on a list

		Stream<Integer> doubledList = list.stream().map(n -> n * 2);
		doubledList.forEach(i -> System.out.println(i));

//		Above operations in a simplified way
		list.stream().map(n -> n * 2).forEach(i -> System.out.println(i));

//		Triple list elements
//		Builder design pattern
		list.stream().sorted().map(i -> i * 3).forEach(i -> System.out.println(i));

		System.out.println("------------------------------------------");
		list.stream().filter(n -> n % 2 != 0).sorted().distinct().forEach(i -> System.out.println(i));

	}
}