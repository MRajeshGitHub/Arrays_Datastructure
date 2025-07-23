package com.virtusa.core;

public class Array_ele_average {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50,60,70,80};
		
	System.out.println("Array lement Average...!!");
	
	int sum=0;
	for(int x:arr) {
		sum=sum+x;
	}
	double avg=sum/arr.length;
	System.out.println("Average of array element is  :"+avg);
	}
}
