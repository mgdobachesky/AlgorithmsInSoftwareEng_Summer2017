package Lab_Week4;

public class Driver {

	public static void main(String[] args) {
		
		ArrayStack as = new ArrayStack(15);

        as.push(10);

        as.push(11);

        as.push(1);

        as.push(0);

        as.push(5);
        
        System.out.println("Array Stack: ");

        System.out.println("Size: " + as.size()); // this should print 5

        System.out.println("Pop: " + as.pop()); // this should print 5
        
        System.out.println("Size: " + as.size()); // this should print 4
        
        System.out.println("Pop: " + as.pop()); // this should print 0
        
        
        System.out.println();
        
        
        ArrayQueue aq = new ArrayQueue(15);

        aq.enqueue(10);

        aq.enqueue(11);

        aq.enqueue(1);

        aq.enqueue(0);

        aq.enqueue(5);
        
        System.out.println("Array Queue: ");

        System.out.println("Size: " + aq.size()); // this should print 5

        System.out.println("Dequeue: " + aq.dequeue()); // this should print 10
        
        System.out.println("Size: " + aq.size()); // this should print 4
        
        System.out.println("Dequeue: " + aq.dequeue()); // this should print 11
	}

}
