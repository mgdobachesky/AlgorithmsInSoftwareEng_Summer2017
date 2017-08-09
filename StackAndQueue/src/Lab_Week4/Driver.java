package Lab_Week4;

public class Driver {

	public static void main(String[] args) {
		
		ArrayStack as = new ArrayStack(15);

        as.push(10);

        as.push(11);

        as.push(1);

        as.push(0);

        as.push(5);

        System.out.println(as.size()); // this should print 5

        System.out.println(as.pop()); // this should print 5
        
        /*System.out.println(as.find(11));
        System.out.println(as.find(7));
        
        System.out.println(as.indexOf(11));
        System.out.println(as.indexOf(7));*/
	}

}
