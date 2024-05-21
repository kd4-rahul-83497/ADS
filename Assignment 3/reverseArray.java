package assignment.q3;

import java.util.Arrays;

public class reverseArray {
	public static int[] revArray(int arr[]) {
		int size = arr.length;
		int revArr[] = new int[size];
		int top = -1;
		
		for (int value : arr) {
			revArr[++top] = value;
		}
		
		for(int i = 0; i<size; i++) {
			arr[i] = revArr[top--];
		}
		return arr;
	}

	public static void main(String[] args) {
		int originalArray[] = {1,2,3,4,5};
		
		System.out.println("Original array : "+Arrays.toString(originalArray));
		
		int reversedArray[] = revArray(originalArray);
		
		System.out.println("Reversed array :"+Arrays.toString(reversedArray));
	}

}
