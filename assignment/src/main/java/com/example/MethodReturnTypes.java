package com.example;

public class MethodReturnTypes {

	public static void main(String args[]) {
		MethodReturnTypes returnTypes = new MethodReturnTypes(); //create an instance of class
		System.out.println(returnTypes.method1()); //call string method
		System.out.println(returnTypes.method2()); //call int method
		System.out.println(returnTypes.method3()); //call boolean method
	}
	
	//method that returns string
	protected String method1() {
		return "String of Text";
	}
	//method that returns int
	protected int method2() {
		return 5;
	}
	//method that returns boolean
	protected boolean method3() {
		return false;
	}
}
