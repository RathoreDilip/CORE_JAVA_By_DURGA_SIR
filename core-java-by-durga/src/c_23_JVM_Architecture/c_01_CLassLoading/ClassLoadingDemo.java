package c_23_JVM_Architecture.c_01_CLassLoading;

import java.lang.reflect.Method;

class Student {
    public String getName(){
        return null;
    }
    public int getMarks(){
        return 10;
    }
}

public class ClassLoadingDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("-----------------------------------------");
        int count=0;
      //  Class c = Class.forName("c_23_JVM_Architecture.c_01_CLassLoading.Student");
        Class c = Class.forName("java.lang.Object");
        Method m[]=c.getDeclaredMethods();
        for (Method m1:m) {
            count++;
            System.out.println(m1.getName());
        }
        System.out.println("Total Number of methods : "+count);
    }
}
