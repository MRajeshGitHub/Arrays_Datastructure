package com.virtusa.core;

public class Array_ExceptionCheck {

	public static void main(String[] args) {
		
		int []arr= {1,2,3,4,5,6,7,8,9};
		System.out.println("Print array element with arrayIndexout od bound");
		
		try {
			int first=arr[22];
			System.out.println("First element is :"+first);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("EXCEPTION: NO INDEX TO ACCESS ELEMENT..");
		}
	}
}
