package com.wrappers;

import java.util.*;

public class WrapperClassesDemo {
	
	static Integer num ;


	public static void main(String[] args) {
		System.out.println(num);

		Set set = new HashSet();
		set.add(new StringBuffer("Ajay"));
		
		System.out.println(set);
	}


}
