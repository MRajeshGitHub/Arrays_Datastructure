package com.virtusa.core;

public class Array_Smallest_Element {

	public static void main(String[] args) {
		
		System.out.println("Search smallest element in the Arrys..");
		
		int arr[]= {1,4,5,6,7,8,9,3,5,4,7,8,6,54,2};
		
		int small=arr[0];
		
		//logic to find smallest element
		for(int i=0;i<arr.length;i++) {
		
			if(small>arr[i])
		{     small=arr[i];
			
		}
			}
		System.out.println("small element is :"+small);
	}
}
