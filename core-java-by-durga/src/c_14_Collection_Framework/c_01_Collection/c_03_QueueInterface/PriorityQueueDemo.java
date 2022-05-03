package c_14_Collection_Framework.c_01_Collection.c_03_QueueInterface;

// Group of objects Prior to processing according to some priority
// if we are depending on default natural sorting order then the objects should be homogenous & comparable
// if we are defining our own sorting order by comparator then the objects not be homogenous & comparable
// duplicate objects are not allowed
// insertion order is not preserved
// null insertion is not possible even first element also

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
        System.out.println(q.peek()); // null
        //  System.out.println(q.element()); // java.util.NoSuchElementException
        for (int i = 0; i <= 10; i++) {
            q.offer(i);
        }
        System.out.println(q); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println(q.poll()); // 0
        System.out.println(q); // [1, 3, 2, 7, 4, 5, 6, 10, 8, 9]

    }
}
