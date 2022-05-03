package c_15_Concurrent_Collections;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap map=new ConcurrentHashMap();
        map.put(101,"A");
        map.put(102,"B");
        System.out.println(map); // {101=A, 102=B}
        map.putIfAbsent(103,"C");
        System.out.println(map); // {101=A, 102=B, 103=C}
        map.putIfAbsent(101,"D");
        System.out.println(map); // {101=A, 102=B, 103=C}
        map.remove(101,"D");
        System.out.println(map); // {101=A, 102=B, 103=C}
        map.remove(101,"A");
        System.out.println(map); // {102=B, 103=C}
        map.replace(102,"A","AAA");
        System.out.println(map); // {102=B, 103=C}
        map.replace(102,"B","BB");
        System.out.println(map); // {102=BB, 103=C}
    }
}
