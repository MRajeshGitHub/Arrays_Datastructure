package com.virtusa.core;

public class Array_length {

	public static void main(String[] args) {
		
		int []arr= {};
		System.out.println("Print array element :");
		if(arr.length==0) {
			System.out.println("array empty");
		}
		else 
		{
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+"--");
			}
		}
	}
}
