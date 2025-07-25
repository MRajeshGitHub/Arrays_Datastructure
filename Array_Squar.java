package com.virtusa.core;

public class Array_Squar {

	public static void main(String[] args) {
		
		System.out.println("Array all element Squar and print");
		
		int arr[]= {2,3,4,5,6,7,8,9};
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr[i]*arr[i];//logic for square the all values
			System.out.println(arr[i]);
		}
		//second logic for square
		
		//for Each loop;
		for(int a:arr) {
			System.out.println("Square value is : "+a*a);
		}
	}
	
	
}
