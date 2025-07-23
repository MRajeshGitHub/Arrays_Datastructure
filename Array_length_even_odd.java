package com.virtusa.core;

public class Array_length_even_odd {

	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,7,8,9,1,2,3,4,5,6,7};
		System.out.println("Array Length is even or Odd..!!!");
		int length=arr.length;
		
		//logic
		
		if(length%2==0) {
			System.out.println("Array Element ouunt is Even "+length);
			
		}
		else {
			System.out.println("Array element count is odd "+length);
		}
		
		for(int i=0;i<=arr.length/2;i++) {
			//System.out.println("middle element is "+arr[i]);
		}
	
	}
}
