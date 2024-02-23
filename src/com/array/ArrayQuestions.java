package com.array;

public class ArrayQuestions {

  public static void printArray(int[] array) {
    System.out.print("[ ");
    for (int num : array) {
      System.out.print(num + " ");
    }
    System.out.println("]");
  }

  public static int[] reverseArray(int[] array) {
    int start = 0;
    int end = array.length - 1;

    while (start < end) {
      int temp = array[end];
      array[end] = array[start];
      array[start] = temp;

      start++;
      end--;
    }
    return array;
  }

  public static int[] reverseNewArray(int[] array) {
    int length = array.length - 1;

    int[] reverseArray = new int[array.length];
    for (int i = 0; i <= length; i++) {
      reverseArray[length - i] = array[i];
    }
    return reverseArray;
  }

  public static int findMaxValue(int[] array) {
    int maxVal = array[0];
    for (int i = 0; i < array.length; i++) {
      if (array[i] > maxVal) {
        maxVal = array[i];
      }
    }
    return maxVal;
  }

  public static int findMinValue(int[] array) {
    int minVal = array[0];
    for (int i = 0; i < array.length; i++) {
      if (array[i] < minVal) {
        minVal = array[i];
      }
    }
    return minVal;
  }

  public static boolean areArraysEqual(int[] array1, int[] array2) {
    if (
      (array1 == null && array2 == null) ||
      (array1.length == 0 && array2.length == 0)
    ) {
      return true;
    } else {
      if (array1.length != array2.length) {
        return false;
      } else {
        for (int i = 0; i < array1.length; i++) {
          if (array1[i] != array2[i]) {
            return false;
          }
        }
        return true;
      }
    }
  }

  public static void main(String[] args) {
    // Reverse an array
    // int[][] array1 = { { 1, 2 }, { 3, 4 } };
    // int[][] array2 = { { 1, 1 }, { 1, 1 } };
  }
}
