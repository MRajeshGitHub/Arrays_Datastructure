package com.virtusa.core;

public class Array_Increase_Values {

	public static void main(String[] args) {
		
		System.out.println("Arrays Increase values by 1.----");
		
		int arr[]= {3,4,5,5,6,7,7,8,89,9,99,03};
		System.out.println("Before incerement");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\nAfter increase by 1");
		
		for(int i=0;i<arr.length;i++) {
			//arr[i]=arr[i]+1;
			arr[i]++;
			System.out.print(arr[i]+" ");
		}
	}
}
