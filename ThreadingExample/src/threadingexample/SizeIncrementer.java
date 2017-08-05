package threadingexample;

import java.util.List;
import java.util.UUID;

public class SizeIncrementer extends Thread {

    List<String> myList = null;

    public SizeIncrementer(List<String> list) {
        this.myList = list;
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
//            super.run(); 
            String uuid = UUID.randomUUID().toString();
            myList.add(uuid);
//            System.out.println(Thread.currentThread().getName()
//                    + " Says added " + uuid);
        }
    }

}
