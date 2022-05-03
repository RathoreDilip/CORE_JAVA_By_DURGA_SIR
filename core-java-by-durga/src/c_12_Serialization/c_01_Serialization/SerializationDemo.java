package c_12_Serialization.c_01_Serialization;

import java.io.*;

class Dog implements Serializable {
    int i=10;
    transient int j=20;
}

public class SerializationDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("-------------------------------------");

        // Serialization
        Dog d1=new Dog();
        FileOutputStream fos=new FileOutputStream("abc.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d1);

        // Deserialization
        FileInputStream fis=new FileInputStream("abc.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Dog d2= (Dog) ois.readObject();
        System.out.println(" i == "+d2.i+"  j =="+d2.j);
    }
}