package c_14_Collection_Framework.c_01_Collection.c_04_TypesOfCursor;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.add("balakrishna");
        l.add("venky");
        l.add("chiru");
        l.add("nag");
        System.out.println(l); // [balakrishna, venky, chiru, nag]
        ListIterator litr = l.listIterator();
        while (litr.hasNext()){
             String s = (String) litr.next();
             if(s.equals("venky"))
                 litr.remove();
             else if(s.equals("chiru"))
                 litr.set("charan");
             else if(s.equals("nag"))
                 litr.add("chaitu");
        }
        System.out.println(l);
    }
}
