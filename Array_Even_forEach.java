package com.virtusa.core;

public class Array_Even_forEach {

	public static void main(String[] args) {
		
		int arr[]= {2,3,4,5,6,7,8,91,12};
		System.out.println("Even number print form given arrays...");
		for(int x:arr) {
			if(x%2==0) {
				System.out.println(x);
			}
		}
	}
}
