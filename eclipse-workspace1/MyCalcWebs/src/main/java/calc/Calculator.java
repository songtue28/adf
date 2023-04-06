package calc;

public class Calculator {
public int Calculator( int number1, int number2, String operator) {
	int result = 0;
	if (operator.equals("+")) {
		result = number1 + number2;
	}else if (operator.equals("-")) {
		result = number1 - number2;
	}else if (operator.equals("*")) {
		result = number1 * number2;
	}else if (operator.equals("/")) {
		result = number1 / number2;
	}	
	return result;
}
}