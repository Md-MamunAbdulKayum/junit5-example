package com.notearena.mathutils;

/**
 * Hello world!
 *
 */
public class Calculator {
    int threshold = 10;
	public int addNumbers(int num1, int num2) {
		return num1+num2;
	}
	
	public int subtractNumbers(int num1, int num2) {
		return num1-num2;
	}
	
	public int multiplyNumbers(int num1, int num2) {
		return num1*num2;
	}
	
	public int divideNumber(int num1, int num2) {
		return num1/num2;
	}
	
	public int getSquare(int num) {
		return num*num;
	}
	
	
	public int getAmout(int num) {		
		int amount;
		if(threshold == 10) {
			amount = num*100;
			return amount;
		} else {
			return 0;
		}
	       
		}
	
	public int getTotalAmout(int num) {
		int total = threshold + 100 + num;
		threshold = 20;
		return total;		
	}
	
	
	public boolean matchNumber(int num) {
		if(num == 10) {
			return true;
		} else {
			return false;
		}
		
	}

	
}
