package c_15_Concurrent_Collections;

import java.util.*;

public class CollectionProblemDemo extends Thread {

    static ArrayList l=new ArrayList();
   // static List list = Collections.synchronizedList(l);
  //  static Vector v=new Vector();

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("child thread updating list..");
        l.add("D");  // ConcurrentModificationException
    }

    public static void main(String[] args) throws InterruptedException {
        l.add("A");
        l.add("B");
        l.add("C");

        CollectionProblemDemo cpd=new CollectionProblemDemo();
        cpd.start();

        Iterator itr = l.iterator();
        while (itr.hasNext()){
            String s1= (String) itr.next();
            System.out.println("main thread iterating list and current object is :: "+s1);
            Thread.sleep(3000);
        }
        System.out.println(l);
    }
}
