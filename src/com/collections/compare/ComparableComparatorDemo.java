package com.collections.compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {

  String name;
  String fatherName;
  int age;

  public Student(String name, String fatherName, int age) {
    this.name = name;
    this.fatherName = fatherName;
    this.age = age;
  }

  @Override
  public String toString() {
    return (
      "Student [name=" +
      name +
      ", fatherName=" +
      fatherName +
      ", age=" +
      age +
      "]"
    );
  }
}

public class ComparableComparatorDemo {

  public static void main(String[] args) {
    List<Student> list = Arrays.asList(
      new Student("Vijay", "Kumar", 31),
      new Student("Zahir", "Ahamed", 26),
      new Student("Ajay", "Devaraju", 21),
      new Student("Suresh", "Kumar", 18)
    );

    Comparator<Student> sortByAge = (i, j) -> i.age > j.age ? 1 : -1;

    Collections.sort(list, sortByAge);
    list.forEach(s -> System.out.println(s));
  }
}
