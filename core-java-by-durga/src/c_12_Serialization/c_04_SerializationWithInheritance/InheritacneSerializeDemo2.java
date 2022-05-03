package c_12_Serialization.c_04_SerializationWithInheritance;

import java.io.*;

class Animal{
    int i=10;
    Animal(){
        System.out.println("Animal Contructor called");
    }
}

class Elephant extends Animal implements Serializable{

    int j=20;
    Elephant(){
        System.out.println("Elephant Contructor called");
    }
}

public class InheritacneSerializeDemo2 {
    public static void main(String[] args) throws Exception {
        System.out.println("--------------------------------------------");

        Elephant e1=new Elephant();
        e1.i=888;
        e1.j=999;

        FileOutputStream fos=new FileOutputStream("abc.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(e1);

        System.out.println("Deserializtion Started...");
        FileInputStream fis=new FileInputStream("abc.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Elephant e2=(Elephant) ois.readObject();
        System.out.println(e2.i+"-----"+e2.j);

    }
}
