package c_17_Garbage_Collection.c_01_Runtime;

import java.util.Date;

public class RuntimeDemo {
    public static void main(String[] args) {
        Runtime r=Runtime.getRuntime();
        System.out.println("Total Memory :"+r.totalMemory());
        System.out.println("Free Memory  :"+r.freeMemory());
        for (int i = 0; i <=1000 ; i++) {
            Date d=new Date();
            d=null;
        }
        System.out.println("Free Memory  :"+r.freeMemory());
        r.gc();
        System.gc();
        System.out.println("Free Memory  :"+r.freeMemory());
    }
}
