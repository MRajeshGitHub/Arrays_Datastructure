package com.virtusa.core;

public class Array_Odd_ForEach {

	public static void main(String[] args) {
		
		System.out.println("Array Odd element print using ForEach loop");
		int arr[]= {1,2,3,4,5,6,7,8,911,13,15};
		for(int x:arr) {
			if(x%2==1) {
				System.out.println(x);
			}
		}
	}
}
