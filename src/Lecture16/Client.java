package Lecture16;

import java.util.LinkedList;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 50 true 25 true 10 false false true 15 false false true 75 true 6 false false true 9 false false
		BinaryTree tree = new BinaryTree();

		tree.display();
		System.out.println(tree.max());
//		tree.mirror();
//		tree.display();

		System.out.println(tree.size2());
		System.out.println(tree.height());
		System.out.println(tree.find(100));

		tree.preOrder();
		tree.inOrder();
		tree.postOrder();

		System.out.println();
		tree.levelOrder();
		
		System.out.println();
		tree.preOrderIterative();
	}

}
