package c_08_Multithreading_Enhancement.c_04_ThreadLocal;

public class ThreadLocalDemo2 {
    public static void main(String[] args) {
        ThreadLocal t1=new ThreadLocal(){
            @Override
            protected Object initialValue() {
                return "abc";
            }
        };

        System.out.println(t1.get());  // abc
        t1.set("durga");
        System.out.println(t1.get()); //  durga
        t1.remove();
        System.out.println(t1.get()); //  abc
    }
}
