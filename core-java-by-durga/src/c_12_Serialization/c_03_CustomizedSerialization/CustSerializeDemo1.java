package c_12_Serialization.c_03_CustomizedSerialization;

import java.io.*;

class Account implements Serializable {
    String username="durga";
    transient String password="anushka";

    private void writeObject(ObjectOutputStream os) throws Exception{
        os.defaultWriteObject();
        String epwd="123"+"anushka";
        os.writeObject(epwd);
    }

    private void readObject(ObjectInputStream is) throws Exception{
        is.defaultReadObject();
        String epwd= (String) is.readObject();
        password=epwd.substring(3);
    }

}

public class CustSerializeDemo1 {
    public static void main(String[] args) throws Exception {
        System.out.println("-------------------------------------");

        Account a1=new Account();
        System.out.println(a1.username+"-------"+a1.password);
        FileOutputStream fos=new FileOutputStream("abc.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(a1);

        FileInputStream fis=new FileInputStream("abc.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Account a2= (Account) ois.readObject();
        System.out.println(a2.username+"-------"+a2.password);


    }
}
