package Lecture12;

public class StackUsingArrays {
	protected int[] data;
	protected int tos;

	public static final int DEFAULT_CAPACITY = 10;

	public StackUsingArrays() throws Exception {
		// TODO Auto-generated constructor stub
		this(DEFAULT_CAPACITY);
	}

	public StackUsingArrays(int capacity) throws Exception {
		// TODO Auto-generated constructor stub
		if (capacity <= 0) {
			throw new Exception("Invalid Capcity");
		}
		this.data = new int[capacity];
		this.tos = -1;
	}

	public int size() {
		return this.tos + 1;
	}

	public boolean isEmpty() {
		if (this.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void push(int element) throws Exception {
		if (this.size() == this.data.length) {
			throw new Exception("Stack is Full");
		}

		this.tos++;
		this.data[this.tos] = element;
	}

	public int pop() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Stack is Empty");

		}

		int rv = this.data[this.tos];
		this.data[this.tos] = 0;
		this.tos--;
		return rv;
	}

	public int top() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Stack is Empty");

		}

		int rv = this.data[this.tos];
		return rv;
	}

	public void display() {
		for (int i = this.tos; i >= 0; i--) {
			System.out.print(this.data[i] + ", ");
		}
		System.out.println("END");
	}
}
