package com.array;

public class SearchArray {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(linearSearch(array, 4));

	}

	public static int linearSearch(int[] array, int target) {

		for (int i = 0; i < array.length; i++) {
			if (target == array[i])
				return i;
		}
		return -1;
	}

	public static int binarySearch(int[] array, int target) {

		int left = 0, right = array.length - 1;
		while (left <= right) {
			int mid = (right + left) / 2;
			
			if (array[mid] == target) {
				return mid;
			} else if (array[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}

		}

		return -1;
	}

}
