package Lecture15;

public class client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
//		list.addFirst(10);
//		list.addFirst(5);
//		
//		list.addLast(50);
//		list.addAt(2, 20);
//		list.addAt(3, 30);
//		list.addAt(4, 40);
//		
//		list.addLast(60);
//		list.display();
//		
//		System.out.println(list.getFirst());
//		System.out.println(list.getLast());
//		System.out.println(list.getAt(4));
//		
//		System.out.println(list.removeFirst());
//		list.display();
//		System.out.println(list.removeLast());
//		list.display();
//		
//		System.out.println(list.removeAt(2));
//		list.display();

		list.addLast(10);
		list.addLast(20);
		list.addLast(30);	
		list.addLast(40);
		list.addLast(50);

		list.display();
//		
		list.reverseDR();
		list.display();

//		LinkedList list1 = new LinkedList();
//		list1.addLast(10);
//		list1.addLast(40);
//		list1.addLast(60);
//		LinkedList list2 = new LinkedList();
//		list2.addLast(5);
//		list2.addLast(8);
//		list2.addLast(25);
//		list2.addLast(50);

//		LinkedList sorted = list1.merge(list2);
//		sorted.display();

	}

}
