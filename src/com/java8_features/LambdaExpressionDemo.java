package com.java8_features;

interface LambdaInterface {
  void show();
}

interface LambdaInterfaceGetName {
  void displayName(String name);
}

class LambdaImpl implements LambdaInterface {

  @Override
  public void show() {
    System.out.println("Show method calling in LambdaImpl class");
  }
}

interface Calculation {
  int add(int a, int b);
}

public class LambdaExpressionDemo {

  public static void main(String[] args) {
    // Method 1
    LambdaInterface lam = new LambdaImpl();
    lam.show();

    // Method 2
    LambdaInterface lamInt = new LambdaInterface() {
      // Anonymous Inner class : since it is Anonymous class .class file for this is
      // created as LambdaExpressionDemo$1.class
      @Override
      public void show() {
        System.out.println("Show method calling in Inner class");
      }
    };
    lamInt.show();

    System.out.println(lamInt.getClass());

    // Method 3
    // since above 2 approach are boiler plate code, we can simplify the the Method
    // 2 using lambda expression
    // Lambda expressions will works for only functional interfaces
    // If we use lambda expression no .class files are created for Impl inner
    // classes
    LambdaInterface lambdaExpression1 = () ->
      System.out.println(
        "Show method calling in Inner class by lambda expression for single line functionality"
      );
    LambdaInterface lambdaExpression2 = () -> {
      System.out.println(
        "Show method calling in Inner class by lambda expression2"
      );
      System.out.println("For more than 1 line fnctionality");
    };

    lambdaExpression1.show();
    lambdaExpression2.show();

    LambdaInterfaceGetName getName = (String name) ->
      System.out.println("My name is " + name);
    LambdaInterfaceGetName getNameSimplified = name ->
      System.out.println("My name is " + name + " getting by simplified code");

    getName.displayName("Ajay");
    getNameSimplified.displayName("AjayGowda");

    Calculation add = (a, b) -> a + b;
    Calculation sub = (a, b) -> {
      int c = a - b;
      return c;
    };
    System.out.println(add.add(1, 2));
    System.out.println(sub.add(10, 4));
  }
}
