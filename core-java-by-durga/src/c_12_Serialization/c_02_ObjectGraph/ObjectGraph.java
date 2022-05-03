package c_12_Serialization.c_02_ObjectGraph;

import java.io.*;

class Dog2 implements Serializable {
    Cat c=new Cat();
}

class Cat implements Serializable {
    Rat r=new Rat();
}

class Rat implements Serializable{
    int j=10;
}

public class ObjectGraph {
    public static void main(String[] args) throws Exception{
        System.out.println("-------------------------------------");

        Dog2 d2=new Dog2();
        FileOutputStream fos=new FileOutputStream("abc.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d2);

        FileInputStream fis=new FileInputStream("abc.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Dog2 d3= (Dog2) ois.readObject();
        System.out.println(d3.c.r.j);

    }
}
