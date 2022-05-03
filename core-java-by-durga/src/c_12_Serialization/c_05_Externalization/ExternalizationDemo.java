package c_12_Serialization.c_05_Externalization;

import java.io.*;

public class ExternalizationDemo implements Externalizable {
    String s;
    int i;
    int j;

    public ExternalizationDemo(){
        System.out.println("public no-arg constructor..");
    }

    public ExternalizationDemo(String s, int i, int j){
        this.s=s;
        this.i=i;
        this.j=j;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(s);
        out.writeInt(i);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        s= (String) in.readObject();
        i=in.readInt();
    }

    public static void main(String[] args) throws Exception {
        System.out.println("--------------------------------------------");
        ExternalizationDemo e1=new ExternalizationDemo("durga",10,20);

        FileOutputStream fos=new FileOutputStream("abcd.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(e1);

        FileInputStream fis=new FileInputStream("abcd.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        ExternalizationDemo e2=(ExternalizationDemo) ois.readObject();
        System.out.println(e2.s+"----"+e2.i+"----"+e2.j);
    }

}
