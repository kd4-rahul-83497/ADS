package assignment.q5;

public class ExpressionEvaluationMain {
	
	public static int calculate(int op1, char opr, int op2) {
		switch(opr) {
		case '+': return op1 + op2;
		case '-': return op1 - op2;
		case '/': return op1 / op2;
		case '*': return op1 * op2;
		case '%': return op1 % op2;
		case '$': return (int)Math.pow(op1, op2);
		}
		return 0;
	}
	
	public static int postfixEvaluation(String postfix) {
		Stack st = new Stack(15);
		
		for(int i = 0; i<postfix.length(); i++) {
			char element = postfix.charAt(i);
			if(Character.isDigit(element))
				st.push(element - '0');
			else {
				int op2 = st.pop();
				int op1 = st.pop();
				int result = calculate(op1, element, op2);
						st.push(result);
			}
		}
		if(!st.isEmpty())
			return st.peek();
			return 0;
		}
	
	public static int prefixEvaluation(String prefix) {
		Stack st = new Stack(15);
		
		for(int i = prefix.length() - 1; i >= 0; i--) {
			char element = prefix.charAt(i);
			if(Character.isDigit(element))
				st.push(element - '0');
			else {
				int op1 = st.pop();
				int op2 = st.pop();
				int result = calculate(op1, element, op2);
						st.push(result);
			}
		}
		if(!st.isEmpty())
			return st.peek();
			return 0;
		}

	public static void main(String[] args) {
String postfix = "59+4862/-*-173-$+";
		
		System.out.println("Postfix : " + postfix);
		int result = postfixEvaluation(postfix);
		System.out.println("Result : " + result);
		
		String prefix = "+-+59*4-8/62$1-73";
		System.out.println("Prefix  : " + prefix);
		result = prefixEvaluation(prefix);
		System.out.println("Result : " + result);
		
	}

}
