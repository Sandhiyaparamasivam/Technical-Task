package com.codoid; 

public class MethodOverloading {

	public static void main(String[] args) {
		
		int m=addition(5,7);
		int n=addition(2, 3, 4);
		String k= addition("5","7");
		System.out.println("first method-"+ m);
		System.out.println("second method-"+ n);
		System.out.println("third method-"+ k);
		
	}
	public static int addition(int a, int b) {
		return a+b;
		
	}
	public static String addition(String a, String b) {
		return a+b;
		
	}
	public static int addition(int a, int b, int c) {
		return a+b+c;
		
	}

}
