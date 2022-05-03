package c_12_Serialization.c_06_serialVersionUid;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Sender {
    public static void main(String[] args) throws Exception{
        Dog d=new Dog();
        FileOutputStream fos=new FileOutputStream("ab.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d);
    }
}
