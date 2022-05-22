package com.example;

public class AverageMethod {

	public static void main(String[] args) {
		AverageMethod avgMethod = new AverageMethod(); //create instance of class
		System.out.println("The average is: "+avgMethod.average(2, 5, 8)); // call averare method
	}
	
	//method to sum 3 numbers
	 int sum(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	
	//method to get average of 3 numbers
	 float average(int num1, int num2, int num3) {
		return (float) sum(num1,num2,num3) / 3 ;
	}
}
