package com.virtusa.core;

import java.util.Scanner;

public class Array_Read_Scanner {

	public static void main(String[] args) {
		
		System.out.println("Array values form scanner inputs ans prints.");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array size.");
		int n=sc.nextInt();
		int arr[]= new int[n];
		//read values into arrays..
		System.out.println("Enter values for the arrays.");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Print the scaned values..");
		for(int x:arr) {
			System.out.println(x);
		}
	}
}
