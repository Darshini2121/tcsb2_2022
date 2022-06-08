package com.demo.add;
//passing parameters in method 
 class AddTwoNumbersParameter {

	void AddDemo(int num1, int num2) {

		int result = num1 + num2;

		System.out.println("sum of two num " + result);
	}

}

public class AddTwoNumbersUsingParameter {

	public static void main(String[] args) {

		AddTwoNumbersParameter b = new AddTwoNumbersParameter();// create object
		b.AddDemo(45, 45);// passing parameters here

	}

}