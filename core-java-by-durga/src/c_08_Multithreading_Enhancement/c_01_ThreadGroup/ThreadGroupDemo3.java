package c_08_Multithreading_Enhancement.c_01_ThreadGroup;

// Write a program to display all active threads name belong to system group and its child groups.
public class ThreadGroupDemo3 {
    public static void main(String[] args) {
        ThreadGroup system=Thread.currentThread().getThreadGroup().getParent();
        Thread[] t=new Thread[system.activeCount()];
        system.enumerate(t);
        for (Thread t1:t) {
            System.out.println(t1.getName()+"-----"+t1.isDaemon());
        }
    }
}
