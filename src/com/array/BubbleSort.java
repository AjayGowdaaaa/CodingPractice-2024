package com.array;

public class BubbleSort {

  public static int bubbleSort(int nums[]) {
    int count = 0;
    int temp;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if (nums[j] > nums[i]) {
          temp = nums[j];
          nums[j] = nums[i];
          nums[i] = temp;
        }
        count++;
      }
    }
    return count;
  }

  public static int advanceBubbleSort(int nums[]) {
    int count = 0;
    int temp;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length-1; j++) {
        if (nums[j] > nums[j + 1]) {
          temp = nums[j];
          nums[j] = nums[j + 1];
          nums[j + 1] = temp;
        }
        count++;
      }
     
    }

    return count;
  }

  public static void main(String[] args) {
    int nums[] = { 1, 4, 6, 8, 3, 5, 83, 2, 7, 9, 2, 6, 90, 0 };

    System.out.println("Before Sorting");
    ArrayQuestions.printArray(nums);
    int count = bubbleSort(nums);
    System.out.println(count);

    System.out.println("After sorting");
    ArrayQuestions.printArray(nums);
  }
}
