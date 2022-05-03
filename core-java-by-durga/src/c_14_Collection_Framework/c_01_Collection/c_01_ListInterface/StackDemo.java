package c_14_Collection_Framework.c_01_Collection.c_01_ListInterface;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack); // [A, B, C]
       // System.out.println(stack.pop()); // C
        System.out.println(stack.search("A")); // 3


    }
}
