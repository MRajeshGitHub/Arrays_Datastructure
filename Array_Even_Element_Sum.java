package com.virtusa.core;

public class Array_Even_Element_Sum {

	public static void main(String[] args) {
		
		System.out.println("Array Even Element Sum..!");
		int arr[]= {1,2,3,4,5,6,7,8,91,0,12,14,1,6,12,13,24,44};
		
		//logic for array element sum with even no
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				sum=sum+arr[i];
			}
			
		}
		System.out.println("Even elemen sum is : "+sum);
	}
}
