package com.demo.add;

class BusinessLogic {

	void AddDemo() {

		int num1 = 10;// hard coded here
		int num2 = 20;
		int result = num1 + num2;
		System.out.println("sum of two num " + result);
	}
}

public class AddTwoNumbers {

	public static void main(String[] args) {

		BusinessLogic b = new BusinessLogic();// create object
		b.AddDemo();

	}

}
