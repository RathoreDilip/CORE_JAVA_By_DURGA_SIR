package c_08_Multithreading_Enhancement.c_04_ThreadLocal;

public class ThreadLocalDemo1 {
    public static void main(String[] args) {
        ThreadLocal t1=new ThreadLocal();
        System.out.println(t1.get()); // null
        t1.set("durga");
        System.out.println(t1.get()); // durga
        t1.remove();
        System.out.println(t1.get()); // null
    }
}
