package c_08_Multithreading_Enhancement.c_01_ThreadGroup;

public class ThreadGroupDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getThreadGroup().getName()); // main
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName()); // system

        ThreadGroup g1=new ThreadGroup("firstGroup");
        System.out.println(g1.getParent().getName()); // main
        ThreadGroup g2=new ThreadGroup(g1,"secondGroup");
        System.out.println(g2.getParent().getName()); // firstGroup
    }
}
