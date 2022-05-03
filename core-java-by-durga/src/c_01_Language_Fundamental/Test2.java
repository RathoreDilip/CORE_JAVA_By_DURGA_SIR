package c_01_Language_Fundamental;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Employee{
    int id;
    String fisrtName;
    String lastName;
    int age;

    public Employee(int id, String fisrtName, String lastName, int age) {
        this.id = id;
        this.fisrtName = fisrtName;
        this.lastName = lastName;
        this.age = age;
    }
}

class MyComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.id>o2.id)
            return -1;
        else if(o1.id<o2.id)
            return 1;
        else
            return 0;
    }
}
class nameComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
       return o1.fisrtName.compareTo(o2.fisrtName);
    }
}


public class Test2 {
    public static void main(String[] args) {
        ArrayList<Employee> l=new ArrayList<>();
        l.add(new Employee(1,"Dilip","Rathore",25));
        l.add(new Employee(10,"ABC","DEF",26));
        l.add(new Employee(15,"Mark","Zuckerburg",32));
        l.add(new Employee(4,"Bill","Gates",62));
        l.add(new Employee(8,"Steve","Jobs",55));
        System.out.println(l);

        Collections.sort(l,new MyComparator());
        Iterator iterator=l.iterator();
        while (iterator.hasNext()){
            Employee e=(Employee) iterator.next();
            System.out.println(e.id+"--"+e.fisrtName+"--"+e.lastName+"--"+e.age);
        }
        System.out.println("---------------------------------");
        Collections.sort(l,new nameComparator());
        Iterator iterator1=l.iterator();
        while (iterator1.hasNext()){
            Employee e=(Employee) iterator1.next();
            System.out.println(e.id+"--"+e.fisrtName+"--"+e.lastName+"--"+e.age);
        }


    }
}
