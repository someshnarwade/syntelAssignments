
public class Calculator {
	double firstNum  = 0.0;
	double secondNum = 0.0;
	//String answer = "";
	
	public double add(double a, double b) {
		firstNum = a;
		secondNum = b;
		return firstNum + secondNum;				
	}
	
	public double substract(double a, double b) {
		firstNum = a;
		secondNum = b;
		return firstNum - secondNum;				
	}
	
	public double multiply(double a, double b) {
		firstNum = a;
		secondNum = b;
		return firstNum * secondNum;				
	}
	
	public double divide(double a, double b) {
		firstNum = a;
		secondNum = b;
		return firstNum / secondNum;				
	}
	
	public double remainder(double a, double b) {
		firstNum = a;
		secondNum = b;
		return firstNum % secondNum;				
	}
}
