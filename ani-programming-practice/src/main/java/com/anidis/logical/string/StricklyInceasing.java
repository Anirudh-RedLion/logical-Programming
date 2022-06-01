package com.anidis.logical.string;

public class StricklyInceasing {

	// 11:45
	public static void main(String[] args) {

		int arr[] = {8,4,2  };

		System.out.println("result :" + validateOrderACSC(arr));

		int arr1[] = {1,4,2  };

		System.out.println("result DSC :" + validateOrderDSC(arr));

		
	}

	public static Boolean validateOrderACSC(int[] arr) {

		if( arr.length == 1) return true;
		
		// for loop
		for (int i = 0; i < arr.length; i++) {
			// ist < 2nd Index - satisfy till last index return true

			if (!(arr[i] < arr[i + 1])) {

				return false;

			} else if (arr.length == i + 2) {
				return true;
			}

		}
		return null;
	}
	
	public static Boolean validateOrderDSC(int[] arr) {

		if( arr.length == 1) return true;
		
		// for loop
		for (int i = 0; i < arr.length; i++) {
			// ist < 2nd Index - satisfy till last index return true

			if (!(arr[i] > arr[i + 1])) {

				return false;

			} else if (arr.length == i + 2) {
				return true;
			}

		}
		return null;
	}

}
