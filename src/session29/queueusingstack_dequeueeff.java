package session29;

import java.util.Stack;

public class queueusingstack_dequeueeff {
	Stack<Integer> stack;

	public queueusingstack_dequeueeff() {
		stack = new Stack<Integer>();
	}

	public int dequeue() {
		return stack.pop();
	}

	public void enqueue(int item) {
		Stack<Integer> temp = new Stack<Integer>();
		while (!stack.isEmpty()) {
			temp.push(stack.pop());
		}
		stack.push(item);
		while (!temp.isEmpty()) {
			stack.push(temp.pop());

		}
	}

	public void display() {
		System.out.println(stack);
	}
}
