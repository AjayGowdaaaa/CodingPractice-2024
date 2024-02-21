package com.wrappers;

interface Ajay{
	void test();
}
public class Test {

	public static void main(String args[]) {
		Ajay a = new Ajay() {
			
			@Override
			public void test() {
				// TODO Auto-generated method stub
				
			}
		};
		System.out.println(a.getClass());
		
	}
}