package com.kevinjang.calcengine;

public abstract class CalculateBase {
	private double leftVal;
	private double rightVal;
	private char opCode = 'a';
	private double result;

	double getLeftVal() { return leftVal; }
	void setLeftVal(double leftVal) { this.leftVal = leftVal; }
	double getRightVal() { return rightVal; }
	void setRightVal(double rightVal) { this.rightVal = rightVal; }
	char getOpCode() { return opCode; }
	void setOpCode(char opCode) { this.opCode = opCode; }
	double getResult() { return result; }
	void setResult(double result) { this.result = result; }
	
	CalculateBase() {}
	
	CalculateBase(double leftVal, double rightVal) {
		this.leftVal = leftVal;
		this.rightVal = rightVal;
	}
	
	abstract void calculate();
}
