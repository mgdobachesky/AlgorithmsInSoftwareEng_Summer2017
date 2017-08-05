package SinglyLinkedList;

public class Driver {

	public static void main(String[] args) {
		IntSLList ll = new IntSLList();
		ll.addToHead(8);
		ll.addToHead(7);
		ll.addToTail(20);
		ll.addToHead(-12);
		ll.printAll();
	}

}
