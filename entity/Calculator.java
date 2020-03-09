package com.softuni.entity;

public class Calculator {
    private double leftOperand;
    private double rightOperand;
    private String operator;

    public Calculator(double leftOperand, double rightOperand, String operator) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operator = operator;
    }

    public double getLeftOperand() {
        return leftOperand;
    }

    public void setLeftOperand(double leftOperand) {
        this.leftOperand = leftOperand;
    }

    public double getRightOperand() {
        return rightOperand;
    }

    public void setRightOperand(double rightOperand) {
        this.rightOperand = rightOperand;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double addition(double num1, double num2) {
    	return num1 + num2;
    }
    
    public double subtraction(double num1, double num2) {
    	return num1 - num2;
    }
    
    public double multiply(double num1, double num2) {
    	return num1 * num2;
    }
    
    public double divide(double num1, double num2) {
    	return num1 / num2;
    }
    
    public double calculateResult() {
        double result;
        if(this.operator == "+") {
        	result = addition(this.getLeftOperand(), this.getRightOperand());
        }else if(this.operator == "-") {
        	result = subtraction(this.getLeftOperand(), this.getRightOperand());
        }else if(this.operator == "*") {
        	result = multiply(this.getLeftOperand(), this.getRightOperand());
        }else if(this.operator == "/") {
        	result = divide(this.getLeftOperand(), this.getRightOperand());
        }else {
        	result = 0;
        }
        return result;
    }
}
