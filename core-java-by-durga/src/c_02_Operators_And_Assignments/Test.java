package c_02_Operators_And_Assignments;

import java.util.*;

class Service{
    int no;
    String fName;
    String lName;

    public Service(int no, String fname, String lname) {
        this.no = no;
        this.fName = fname;
        this.lName = lname;
    }
}

class Employee{
    int eno;
    String firstName;
    String lastName;
    int salary;

    public Employee(int eno, String firstName, String lastName, int salary) {
        this.eno = eno;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
}
class myComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Employee e1=(Employee) o1;
        Employee e2=(Employee) o2;
        return e1.firstName.compareTo(e2.firstName);
    }
}

class serviceComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Service e1=(Service) o1;
        Service e2=(Service) o2;
        return e1.fName.compareTo(e2.fName);
    }
}

public class Test {
    public static void main(String[] args) {
        ArrayList<Employee> list=new ArrayList<>();
        list.add(new Employee(1,"Dilip","Rathore",5000));
        list.add(new Employee(5,"Bill","Gates",5000));
        list.add(new Employee(8,"Mark","Rathore",5000));
        list.add(new Employee(2,"Dilip","Rathore",5000));

       Collections.sort(list,new myComparator());
        System.out.println(list);


        ArrayList<Service> servicesList=new ArrayList<>();
        servicesList.add(new Service(1,"Chandu","Rathore"));
        servicesList.add(new Service(5,"Rajesh","Gates"));
       // Collections.sort();
       ArrayList listAll=new ArrayList();
       listAll.add(list);
       listAll.add(servicesList);

       // Iterator iterator=list.iterator();

    }
}
