package com.collections.list;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		System.out.println(list);
		list.add(0, 10);
		System.out.println(list);

		System.out.println(list.contains(1));
		
		list.set(0, 11);
		System.out.println(list);
		
//		list.clear();
		
		System.out.println(list.isEmpty());
		
		
	}
}
