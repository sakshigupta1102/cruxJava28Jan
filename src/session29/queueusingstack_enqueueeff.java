package session29;

import java.util.Stack;

public class queueusingstack_enqueueeff {
	Stack<Integer> stack;

	public queueusingstack_enqueueeff() {
		stack = new Stack();
	}

	public void enqueue(int item) {
		stack.push(item);
	}

	public int dequeue() {
		Stack<Integer> temp = new Stack();
		while (stack.size() != 1) {
			int val = stack.pop();
			temp.push(val);
		}
		int pop = stack.pop();
		while (!temp.isEmpty()) {
			int val = temp.pop();
			stack.push(val);
		}
		return pop;
	}

	public int getFront() {
		Stack<Integer> temp = new Stack();
		while (stack.size() != 1) {
			int val = stack.pop();
			temp.push(val);
		}
		int pop = stack.pop();
		stack.push(pop);
		while (!temp.isEmpty()) {
			int val = temp.pop();
			stack.push(val);
		}
		return pop;
	}

	public void display() {
		System.out.println(stack);
	}

}
