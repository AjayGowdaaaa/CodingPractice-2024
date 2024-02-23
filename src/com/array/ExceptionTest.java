package com.array;

public class ExceptionTest {

  public static void exp() throws Exception {
    try {
      if (true) throw new Exception();
    } catch (Exception e) {
      System.out.println("Parent exception");
    }
  }

  public static void main(String[] args) {
    try {
      exp();
    } catch (Exception e) {
      System.out.println("Exception Handling");
      e.printStackTrace();
    }
  }
}
