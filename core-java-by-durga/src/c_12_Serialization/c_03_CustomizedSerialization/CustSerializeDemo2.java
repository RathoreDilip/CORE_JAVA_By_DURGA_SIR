package c_12_Serialization.c_03_CustomizedSerialization;

import java.io.*;

class AccountDemo implements Serializable{
    String username="durga";
    transient String pwd="anushka";
    transient int pin=1234;

    private void writeObject(ObjectOutputStream os) throws Exception{
        os.defaultWriteObject();
        String epwd="123"+pwd;
        int epin=4444+pin;
        os.writeObject(epwd);
        os.writeInt(epin);
    }

    private void readObject(ObjectInputStream is) throws Exception{
        is.defaultReadObject();
        String epwd=(String) is.readObject();
        int epin=is.readInt();
        pwd=epwd.substring(3);
        pin=epin-4444;
    }

}

public class CustSerializeDemo2 {
    public static void main(String[] args) throws Exception {
        System.out.println("--------------------------------------------");
        AccountDemo a1=new AccountDemo();
        System.out.println(a1.username+"-----"+a1.pwd+"-----"+a1.pin);

        FileOutputStream fos=new FileOutputStream("abc.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(a1);

        FileInputStream fis=new FileInputStream("abc.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        AccountDemo a2=(AccountDemo) ois.readObject();
        System.out.println(a2.username+"-----"+a2.pwd+"-----"+a2.pin);

    }
}
