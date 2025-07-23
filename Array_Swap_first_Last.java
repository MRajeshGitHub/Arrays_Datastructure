package com.virtusa.core;

public class Array_Swap_first_Last {

	public static void main(String[] args) {
		System.out.println("Swaping array element first and last....");
		
		int arr[]= {2,3,4,5,6,7,8,9};
		int n=arr.length;
		System.out.println("Array Length is : "+n);
		System.out.println("-------------");
		
		int temp=arr[0];
		arr[0]=arr[n-1];
		arr[n-1]=temp;
		
		for(int x:arr) {
			System.out.println(x);
		}
		
		
		
	
	}
}
