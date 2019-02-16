package Lecture15;

public class LinkedListAsStack {
	private LinkedList list;
	
	public LinkedListAsStack() {
		this.list=new LinkedList();
	}
	
	public boolean isEmpty() {
		return this.list.size()==0;
	}
	
	public int size() {
		return this.list.size();
	}
	
	public void push(int data) {
		this.list.addFirst(data);
	}
	
	public int pop() throws Exception {
		return this.list.removeFirst();
	}
	
	public int top() throws Exception {
		return this.list.getFirst();
	}
	
	public void display() {
		this.list.display();
	}
}
