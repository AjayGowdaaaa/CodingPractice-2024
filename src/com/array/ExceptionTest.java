package com.array;

import java.util.ArrayList;
import java.util.List;

public class ExceptionTest {

	public static void exp() throws Exception {
		try {
			if (true)
				throw new Exception();
		} catch (Exception e) {
			System.out.println("Parent exception");
		}
	}

	public static void main(String[] args) {
		try {
			List l = new ArrayList<>();
			exp();
		} catch (Exception e) {
			System.out.println("Exception Handling");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
