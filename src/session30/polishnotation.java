package session30;

import java.util.Stack;

public class polishnotation {
	public int evalRPN(String[] arr) {
		Stack<Integer> stack = new Stack();
		for (int i = 0; i < arr.length; i++) {
			String ch = arr[i];
			if (ch.equals("+")) {
				stack.push(stack.pop() + stack.pop());

			} else if (ch.equals("-")) {
				int second = stack.pop();
				int first = stack.pop();
				stack.push(first - second);

			} else if (ch.equals("*")) {
				stack.push(stack.pop() * stack.pop());

			} else if (ch.equals("/")) {
				int second = stack.pop();
				int first = stack.pop();
				stack.push(first / second);

			} else {
				stack.push(Integer.parseInt(ch));
			}

		}
		return stack.pop();

	}
}
