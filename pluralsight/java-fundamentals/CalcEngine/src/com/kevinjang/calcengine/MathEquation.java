package com.kevinjang.calcengine;

class MathEquation {

    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result;

    double getLeftVal() { return leftVal; }
    void setLeftVal(double leftVal) { this.leftVal = leftVal; }
    double getRightVal() { return rightVal; }
    void setRightVal(double rightVal) { this.rightVal = rightVal; }
    char getOpCode() { return opCode; }
    void setOpCode(char opCode) { this.opCode = opCode; }
    double getResult() { return result; }

    void execute() {

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

}
