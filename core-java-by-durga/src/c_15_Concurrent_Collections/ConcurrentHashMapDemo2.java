package c_15_Concurrent_Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo2 extends Thread {
     // static HashMap map=new HashMap();
    static ConcurrentHashMap map=new ConcurrentHashMap();

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Child thread updating Map");
        map.put(103,"C");
    }

    public static void main(String[] args) throws InterruptedException {
        map.put(101,"A");
        map.put(102,"B");
        ConcurrentHashMapDemo2 chm=new ConcurrentHashMapDemo2();
        chm.start();
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Integer I1 = (Integer) iterator.next();
            System.out.println("Main thread iterating and current entry is "+I1+"====="+map.get(I1));
            Thread.sleep(3000);
        }
        System.out.println(map); // {101=A, 102=B, 103=C}

    }
}
