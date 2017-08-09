package queue;

public class Driver {

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(new Integer(7));
		queue.enqueue(new Integer(10));
		queue.dequeue();
		
		System.out.println(queue.firstEl());
	}

}
