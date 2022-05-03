package c_24_Java8.c_03_PredefinedFunctionalInteface.c_01_Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
    String name;
    String destination;
    double salary;
    String city;

    public Employee(String name, String destination, double salary, String city) {
        this.name = name;
        this.destination = destination;
        this.salary = salary;
        this.city = city;
    }

    @Override
    public String toString() {
        return String.format("(%s,%s,%.2f,%s)",name,destination,salary,city);
    }

    @Override
    public boolean equals(Object obj) {
        Employee e=(Employee)obj;
        if(name.equals(e.name) && destination.equals(e.destination)
                && salary==e.salary && city.equals(e.city))
            return true;
        else
            return false;
    }
}

public class EmpManagementApplication {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------");
        ArrayList<Employee> list=new ArrayList<>();
        populate(list);
        System.out.println("LIST OF ALL EMPLOYEES..");
        System.out.println("-----------------------------------------");
        System.out.println(list);

        System.out.println("-----------------------------------------");
        System.out.println("LIST OF ALL MANAGER..");
        System.out.println("-----------------------------------------");
        Predicate<Employee> p1=emp->emp.destination.equals("Manager");
        display(p1,list);

        System.out.println("-----------------------------------------");
        System.out.println("LIST OF ALL EMPLOYEE FROM BANGALORE..");
        System.out.println("-----------------------------------------");
        Predicate<Employee> p2=emp->emp.city.equals("Bangalore");
        display(p2,list);

        System.out.println("-----------------------------------------");
        System.out.println("LIST OF ALL EMPLOYEE WHICH SALARY IS < 20000 ..");
        System.out.println("-----------------------------------------");
        Predicate<Employee> p3=emp->emp.salary < 20000;
        display(p3,list);

        System.out.println("-----------------------------------------");
        System.out.println("LIST OF ALL MANAGERS FROM BANGALORE ..");
        System.out.println("-----------------------------------------");
        display(p1.and(p2),list);

        System.out.println("-----------------------------------------");
        System.out.println("LIST OF ALL EMPLOYEES WHO ARE MANAGER OR SALARY IS < 20000 ..");
        System.out.println("-----------------------------------------");
        display(p1.or(p3),list);

        System.out.println("-----------------------------------------");
        System.out.println("LIST OF ALL EMPLOYEES WHO ARE NOT MANAGER ..");
        System.out.println("-----------------------------------------");
        display(p1.negate(),list);

        System.out.println("-----------------------------------------");
        System.out.println("CHECK EMPLOYEE CEO OR NOT ..");
        System.out.println("-----------------------------------------");
        // required override employee class equals method
        Predicate<Employee> p4=Predicate.isEqual(new Employee("Durga","CEO",30000,"Hyderabad"));
        display(p4,list);

    }

    private static void display(Predicate<Employee> p, ArrayList<Employee> list) {
        for (Employee e:list)
            if(p.test(e))
                System.out.println(e);
    }

    private static void populate(ArrayList<Employee> list) {
        list.add(new Employee("Durga","CEO",30000,"Hyderabad"));
        list.add(new Employee("Sunny","Manager",20000,"Hyderabad"));
        list.add(new Employee("Mallika","Manager",20000,"Bangalore"));
        list.add(new Employee("Kareena","Lead",15000,"Hyderabad"));
        list.add(new Employee("Katrina","Lead",15000,"Bangalore"));
        list.add(new Employee("Anushka","Developer",10000,"Hyderabad"));
        list.add(new Employee("Alia","Manager",15000,"Bangalore"));
    }
}
