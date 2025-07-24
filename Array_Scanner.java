package com.virtusa.corescanner;

import java.util.Scanner;

public class Array_Scanner {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter the array size : ");
	int n=sc.nextInt();
	int arr[]=new int [n];//array size declearation
	
	System.out.println("Array created with specific length..."+arr.length);
	for(int x:arr) {
		System.out.println(x);
	}

	
}
}
