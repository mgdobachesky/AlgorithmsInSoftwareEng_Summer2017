package Lab_Week3;

public class Driver {

	public static void main(String[] args) {
		IntSLList ll = new IntSLList();
		ll.addToHead(8);
		ll.addToHead(7);
		ll.addToTail(20);
		ll.addToHead(-12);
		ll.addToTail(8);
		ll.addToHead(8);
		ll.addToTail(2);
		ll.addToTail(9);
		ll.addToTail(7);
		ll.addToHead(10);
		ll.addToTail(9);
		ll.printAll();
		
		System.out.println();
		
		ll.sum();
		ll.max();
		ll.min();
		
		System.out.println();
		System.out.println("Removing Duplicates: ");
		ll.removeDuplicates();
		ll.printAll();
		
		System.out.println();
		System.out.println("Removing Median: ");
		ll.removeMedian();
		ll.printAll();
	}

}
