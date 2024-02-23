package com.java8_features;

//from java 8 Interface supports default and static methods
// but object class methods are not allowed

interface Interface1 {
	default void defaultMethod() {
		System.out.println("Interface1 defaultMethod()");
	}

	static void staticMethod() {
		System.out.println("Interface1 static Method");
	}
}

interface Interface2 {
	default void defaultMethod() {
		System.out.println("Interface2 defaultMethod()");
	}

	static void staticMethod() {
		System.out.println("Interface1 static Method");
	}
}

public class InterfaceDemo implements Interface1, Interface2 {

	public void defaultMethod() {
		System.out.println("OverRidden defaultMethod()");
	}

	public static void main(String[] args) {
		Interface1.staticMethod();
		Interface2.staticMethod();
	}
}

//Third rule
class Test {
	void defaultMethod() {
		System.out.println("Test defaultMethod()");
	}
}

class TestDemo extends Test implements Interface1 {

//	Interface's default() will have low priority and class methods have high priority
	public void defaultMethod() {
		System.out.println("Test defaultMethod()");
	}

}