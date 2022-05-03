package c_12_Serialization.c_06_serialVersionUid;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Receiver {
    public static void main(String[] args) throws Exception{
        System.out.println("--------------------------------------------");
        FileInputStream fis=new FileInputStream("ab.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Dog d=(Dog) ois.readObject();
        System.out.println(d.i+"----"+d.j);
    }
}
