package threadingexample;

import java.util.List;

public class SizePrinter extends Thread {
    List<String> myList = null;
    public SizePrinter(List<String> list) {
        this.myList = list;
    }

   
    @Override
    public void run() {
        while (!Thread.interrupted()) {
//            super.run(); 
            System.out.println(Thread.currentThread().getName() + 
                    " Says size of the list is " + myList.size());
        }
    }

}
