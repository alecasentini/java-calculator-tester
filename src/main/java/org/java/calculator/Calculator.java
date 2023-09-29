package org.java.calculator;

public class Calculator {
	
    public float add(float num1, float num2) {
        return num1 + num2;
    }

    public float subtract(float num1, float num2) {
        return num1 - num2;
    }

    public float divide(float num1, float num2) {
        if (num2 == 0) {
           throw new IllegalArgumentException("Impossibile dividere per 0");      
        } else {
        	return num1 / num2;
        }
    }

    public float multiply(float num1, float num2) {
        return num1 * num2;
    }
}