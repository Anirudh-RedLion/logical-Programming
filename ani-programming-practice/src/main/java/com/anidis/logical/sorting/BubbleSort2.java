package com.anidis.logical.sorting;

import java.util.Arrays;
import java.util.stream.Stream;

public class BubbleSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Integer[] array = { 2, 1, 4, 6, 3, 5 };
	      Integer[] sortedArray = { 1, 2, 3, 4, 5, 6 };
	      System.out.println(" Input :: ");
	      display(array);
	      
	      optimizedBubbleSort(array);
	      System.out.println(" SOrted :: ");	
	      display(array);	      
	}

	public static void optimizedBubbleSort(Integer[] arr) {
	    int i = 0, n = arr.length;
	    boolean swapNeeded = true;
	    while (i < n - 1 && swapNeeded) {
	        swapNeeded = false;
	        for (int j = 1; j < n - i; j++) {
	            if (arr[j - 1] > arr[j]) {
	                int temp = arr[j - 1];
	                arr[j - 1] = arr[j];
	                arr[j] = temp;
	                swapNeeded = true;
	            }
	        }
	        if(!swapNeeded) {
	            break;
	        }
	        i++;
	    }
	}
	
	public static void display(Integer[] arr) {
		
	Stream<Integer> stream=	Arrays.stream(arr);
	stream.forEach(a -> System.out.println(a));
		
	}
	
}
