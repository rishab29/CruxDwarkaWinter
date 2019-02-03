package Lecture14;

import Lecture13.DynamicStack;

public class QueueUsingStackEnqueueEfficient {

	private DynamicStack primary;
	private DynamicStack secondary;

	public QueueUsingStackEnqueueEfficient() throws Exception {
		// TODO Auto-generated constructor stub
		this.primary = new DynamicStack();
		this.secondary = new DynamicStack();
	}

	public int size() {
		return this.primary.size();
	}

	public boolean isEmpty() {
		return this.primary.size() == 0;
	}

	public void enqueue(int element) throws Exception {
		this.primary.push(element);
	}

	public int dequeue() throws Exception {
		while ((this.primary.size() != 1)) {
			this.secondary.push(this.primary.pop());
		}
		int rv = this.primary.pop();
		while (!this.secondary.isEmpty()) {
			this.primary.push(this.secondary.pop());
		}
		return rv;
	}

	public int front() throws Exception {
		while ((this.primary.size() != 1)) {
			this.secondary.push(this.primary.pop());
		}
		int rv = this.primary.pop();
		this.secondary.push(rv);
		while (!this.secondary.isEmpty()) {
			this.primary.push(this.secondary.pop());
		}
		return rv;
	}

	public void display() throws Exception {
		reverseStack(this.primary, this.secondary, 0);
		this.primary.display();
		reverseStack(this.primary, this.secondary, 0);

	}

	private static void reverseStack(DynamicStack stack, DynamicStack helper, int index) throws Exception {
		if (stack.isEmpty()) {
			return;
		}
		int element = stack.pop();
		reverseStack(stack, helper, index + 1);
		helper.push(element);
		if (index == 0) {
			while (!helper.isEmpty()) {
				stack.push(helper.pop());
			}
		}
	}
}
