package c_24_Java8.c_01_LambdaExpression.c_02_Collections;

import java.util.TreeMap;

public class TreeMapSortLambdaExpression {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm=new TreeMap<>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0); // Lambda expression
        tm.put(100,"Durga");
        tm.put(600,"Sunny");
        tm.put(300,"Bunny");
        tm.put(200,"Chinny");
        tm.put(700,"Vinny");
        tm.put(400,"Pinny");
        System.out.println(tm); //  {700=Vinny, 600=Sunny, 400=Pinny, 300=Bunny, 200=Chinny, 100=Durga}


    }
}
