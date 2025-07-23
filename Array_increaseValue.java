package com.virtusa.core;

public class Array_increaseValue {

	public static void main(String[] args) {
		
		System.out.println("Program to rite to increase values of array....");
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0;i<arr.length;i++) {
			//System.out.println(arr[i]++);
			arr[i]++;
		}
		for(int x:arr) {
			System.out.println(x);
		}
		
	}
}
