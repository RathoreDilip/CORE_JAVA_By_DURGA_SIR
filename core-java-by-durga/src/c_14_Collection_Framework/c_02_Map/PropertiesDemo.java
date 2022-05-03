package c_14_Collection_Framework.c_02_Map;

// properties file        ==>  [  load  ] ==> java properties object
// java properties object ==>  [  store ] ==> properties file


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties p=new Properties();
        FileInputStream fis=new FileInputStream("abcd.properties");
        p.load(fis);
        System.out.println(p);

        String s=p.getProperty("venki");
        System.out.println(s); // 8888
        p.setProperty("nag","9999999");
        FileOutputStream fos=new FileOutputStream("abcd.properties");
        p.store(fos,"updated by dilip");

    }
}
