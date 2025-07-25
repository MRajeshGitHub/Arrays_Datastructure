package com.virtusa.core;

public class Array_Table_Elements {

	public static void main(String[] args) {
		
		System.out.println("Array all elements print in table formate.");
		
		int arr[]= {3,5,6,7,8,9};
		for(int i=0;i<arr.length;i++) {
		
			int x=arr[i];
			System.out.println("Table of :"+x);
			for(int j=1;j<=10;j++) {
				System.out.println(x+"*"+j+"="+x*j);
			}
			System.out.println("-----");
		}
	}
}
