package Lecture12;

public class QueueUsingArraysClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		QueueUsingArrays queue = new QueueUsingArrays(5);
		for (int i = 1; i <= 5; i++) {
			queue.enqueue(i * 10);
			displayQueueInfo(queue);
		}
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(60);
		queue.enqueue(70);
		queue.display();

		while (!queue.isEmpty()) {
			displayQueueInfo(queue);
			queue.dequeue();
		}
		
		queue.dequeue();

	}

	public static void displayQueueInfo(QueueUsingArrays queue) throws Exception {
		System.out.println("***************************");
		queue.display();
		System.out.println("Size " + queue.size());
		System.out.println("Front " + queue.front());
		System.out.println("***************************");
	}

}
