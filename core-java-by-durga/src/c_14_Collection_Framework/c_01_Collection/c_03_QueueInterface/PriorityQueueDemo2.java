package c_14_Collection_Framework.c_01_Collection.c_03_QueueInterface;

import java.util.Comparator;
import java.util.PriorityQueue;

class MyComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        String s1=o1.toString();
        String s2=o2.toString();
        return s2.compareTo(s1);
    }
}
public class PriorityQueueDemo2 {
    public static void main(String[] args) {
        PriorityQueue q=new PriorityQueue(new MyComparator());
        q.offer("A");
        q.offer("Z");
        q.offer("L");
        q.offer("M");
        System.out.println(q);
    }
}
