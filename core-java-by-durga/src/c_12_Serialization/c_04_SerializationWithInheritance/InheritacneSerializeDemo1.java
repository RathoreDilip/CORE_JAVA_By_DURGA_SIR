package c_12_Serialization.c_04_SerializationWithInheritance;

import java.io.*;

class Vehicle implements Serializable {
    int i=10;
}

class Car extends Vehicle{
    int j=20;
}

public class InheritacneSerializeDemo1 {
    public static void main(String[] args) throws Exception {
        System.out.println("--------------------------------------------");
        Car c1=new Car();
        System.out.println(c1.i+"-----"+c1.j);
        FileOutputStream fos=new FileOutputStream("abc.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(c1);

        FileInputStream fis=new FileInputStream("abc.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Car c2=(Car)ois.readObject();
        System.out.println(c2.i+"-----"+c2.j);

    }
}
