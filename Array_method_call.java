package com.virtusa.core;

public class Array_method_call {

	public static void main(String[] args) {
		
		int ary[]=createArry();
		printArray(ary);
	}
	
	
	public static int[] createArry() {
		int arr[]= {2,3,4,5,6,7,8,9};
		return arr;
	}
	
	public static void printArray(int []arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
