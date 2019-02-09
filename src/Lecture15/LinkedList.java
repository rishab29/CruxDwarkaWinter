package Lecture15;

public class LinkedList {
	private class Node {
		int data;
		Node next;

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	public LinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void addFirst(int data) {
		Node node = new Node(data, this.head);
		this.head = node;
		if (this.isEmpty()) {
			this.tail = node;
		}
		this.size++;
	}

	public void addLast(int data) {
		Node node = new Node(data, null);
		if (this.isEmpty()) {
			this.head = node;
			this.tail = node;
		} else {
			this.tail.next = node;
			this.tail = node;
		}
		this.size++;
	}

	private Node getNodeAt(int index) throws Exception {
		if (index < 0 || index >= this.size) {
			throw new Exception("invalid index");
		}

		int counter = 0;
		Node temp = this.head;
		while (counter < index) {
			temp = temp.next;
			counter++;
		}
		return temp;
	}

	public void addAt(int index, int data) throws Exception {
		if (index < 0 || index > this.size) {
			throw new Exception("invalid index");
		}

		if (index == 0) {
			this.addFirst(data);
		} else if (index == this.size) {
			this.addLast(data);
		} else {
			Node temp = this.getNodeAt(index - 1);
			Node node = new Node(data, temp.next);
			temp.next = node;
			this.size++;
		}
	}

	public int getFirst() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("list is Empty");
		}

		return this.head.data;
	}

	public int getLast() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("list is Empty");
		}

		return this.tail.data;
	}

	public int getAt(int index) throws Exception {
		if (this.isEmpty()) {
			throw new Exception("list is Empty");
		}

		if (index < 0 || index >= this.size) {
			throw new Exception("invalid index");
		}

		return this.getNodeAt(index).data;
	}

	public int removeFirst() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("list is empty");
		}
		int rv = this.head.data;
		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		} else {
			this.head = this.head.next;
		}
		this.size--;
		return rv;

	}

	public int removeLast() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("list is empty");
		}
		int rv = this.tail.data;
		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		} else {
			Node temp = this.getNodeAt(this.size - 2);
			temp.next = null;
			this.tail = temp;
		}
		this.size--;
		return rv;

	}

	public int removeAt(int index) throws Exception {
		if (this.isEmpty()) {
			throw new Exception("list is empty");
		}

		if (index < 0 || index >= this.size) {
			throw new Exception("Invalid index");
		}

		if (index == 0) {
			return this.removeFirst();
		} else if (index == this.size - 1) {
			return this.removeLast();
		} else {
			Node temp = this.getNodeAt(index - 1);
			Node rv = this.getNodeAt(index);
			temp.next = temp.next.next;
			this.size--;
			return rv.data;

		}
	}

	public void display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "=>");
			temp = temp.next;
		}
		System.out.println("END");
	}

	public void reverseDI() throws Exception {
		int i = 0, j = this.size - 1;
		while (i <= j) {
			Node left = this.getNodeAt(i);
			Node right = this.getNodeAt(j);
			int temp = left.data;
			left.data = right.data;
			right.data = temp;
			i++;
			j--;
		}
	}

	public void reversePI() {
		Node prev = this.head;
		Node curr = prev.next;
		while (curr != null) {
			Node tempprev = prev;
			Node tempcurr = curr;

			prev = curr;
			curr = curr.next;
			tempcurr.next = tempprev;
		}

		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		this.tail.next = null;
	}

	public void reversePR() {
		this.reversePR(this.head);
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		this.tail.next = null;
	}

	private void reversePR(Node node) {
		if (this.tail == node) {
			return;
		}
		reversePR(node.next);
		node.next.next = node;
	}
}
