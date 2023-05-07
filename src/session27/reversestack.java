package session27;

import java.util.Stack;

public class reversestack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack);
		reverse(stack);
		System.out.println(stack);
	}

	public static void pushdown(Stack<Integer> stack, int ele) {
		if (stack.isEmpty()) {
			stack.push(ele);
			return;
		}
		int currele = stack.pop();
		pushdown(stack, ele);
		stack.push(currele);
	}

	public static void reverse(Stack<Integer> stack) {
		if (stack.isEmpty())
			return;
		int item = stack.pop();
		reverse(stack);
		pushdown(stack, item);
	}
}
