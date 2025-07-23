package com.virtusa.core;

public class Array_sum {

	public static void main(String[] args) {
		System.out.println("Arry Sum...!!!");
		int arr[]= {2,3,4,5,6,7,8,9,10};
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		
		System.out.println(sum);
		long avg=sum/arr.length;//average logic...
		System.out.println(avg);
		
		System.out.println("------------------");
		for(int i=0;i<arr.length;i++) {
			if(avg<arr[i]) {
				System.out.println(arr[i]);
			}
		}
		
	}
}
