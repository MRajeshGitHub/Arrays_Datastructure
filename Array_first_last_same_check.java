package com.virtusa.core;

public class Array_first_last_same_check {

	public static void main(String[] args) {
		
		System.out.println("Array first & last element same or not...");
		int []arr= {5,3,4,5,6,7,8,9,3};
		int first=arr[0];
		int last=arr[arr.length-1];
		//condition check of mian logic
		if(first==last) {
			System.out.println("same element");
		}
		else {
			System.out.println("not same...");
		}
		
	}
}
