package com.demo.add;

class AddDemoReturn {

	int AddDemo(int num1, int num2) {

		int result = num1 + num2;

		return result;
	}
}

//client int

public class AddTwoNumbersUsingReturnType {

	public static void main(String[] args) {

		AddDemoReturn b = new AddDemoReturn();// create object
		int result = b.AddDemo(45,45);// passing parameters here
        System.out.println("sum of two num is "+ result);
	}

}
