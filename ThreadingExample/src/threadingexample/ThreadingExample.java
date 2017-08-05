
package threadingexample;

import java.util.LinkedList;
import java.util.List;

public class ThreadingExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> myList = new 
        LinkedList<>();
        SizePrinter t1 = new SizePrinter(myList);
        t1.start();
        
        SizeIncrementer t2 = new SizeIncrementer(myList);
        t2.start();
//           t1.run();
//           t2.run();
    }
    
}
