package com.virtusa.core;

public class Array_loops_forEach {

	public static void main(String[] args) {
		
		int arr[]= {2,3,4,5,6,7,8,91,22};
		System.out.println("Print array elements...!");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		//using foreach loops print only in forward direction
		System.out.println("-------------------------");
		for(Integer i:arr) {
			System.out.println(i);
		}
		System.out.println("reverce");
		//reverse order
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}
}
