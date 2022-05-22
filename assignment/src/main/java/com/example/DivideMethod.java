package com.example;

public class DivideMethod {

	public static void main(String args[]) {
		DivideMethod divMethod = new DivideMethod(); //create an instance of the class
		divMethod.divide(1, 3); //call the divide method
	}
	
	//method to accept 2 numbers
	 protected double divide(int num1, int num2) {
		double result = (double)num1 / num2; //type cast to double to show decimal values
		System.out.println(result);
		return result;
	}
}
