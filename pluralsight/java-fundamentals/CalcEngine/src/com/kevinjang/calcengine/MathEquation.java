package com.kevinjang.calcengine;

public class MathEquation {

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
	public double getResult() { return result; }

	public MathEquation() {}

	public MathEquation(char opCode) {
		this.opCode = opCode;
	}

	public MathEquation(char opCode, double leftVal, double rightVal) {
		this(opCode);
		this.leftVal = leftVal;
		this.rightVal = rightVal;
	}

	public void execute() {
		switch (opCode) {
		case 'a':
			result = leftVal + rightVal;
			break;
		case 's':
			result = leftVal - rightVal;
			break;
		case 'm':
			result = leftVal * rightVal;
			break;
		case 'd':
			result = rightVal != 0.0d ? leftVal / rightVal : 0.0d;
			break;
		default:
			System.out.println("Unrecognized opCode");
			result = 0.0d;
		}
	}
		
	public void execute(double leftVal, double rightVal) {
		this.leftVal = leftVal;
		this.rightVal = rightVal;
		
		execute();
	}
	
	void execute(int leftVal, int rightVal) {
		this.leftVal = leftVal;
		this.rightVal = rightVal;
		
		execute();
		
		result = (int) result;
	}
}
