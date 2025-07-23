package com.virtusa.core;

public class Array_Sum_first_last {

	public static void main(String[] args) {
		
		int []arr= {1,3456,78,90,12,9};
		System.out.println("Arraay sum first aand last element:");
		int first=arr[0];
		int last=arr[arr.length-1];
		
		int sum=first+last;
		
		if(sum==10) {
			System.out.println("sum is equal");
		}
		else {
			System.out.println("sum not equal");
		}
	}
}
