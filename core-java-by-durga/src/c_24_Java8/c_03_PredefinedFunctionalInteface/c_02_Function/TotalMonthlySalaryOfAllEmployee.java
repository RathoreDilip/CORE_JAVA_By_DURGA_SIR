package c_24_Java8.c_03_PredefinedFunctionalInteface.c_02_Function;

import java.util.ArrayList;
import java.util.function.Function;

class Employee{
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name+":"+salary;
    }
}

public class TotalMonthlySalaryOfAllEmployee {
    public static void main(String[] args) {
        Function<ArrayList<Employee>,Double> f=l->{
            double totalSalary=0;
            for (Employee e:l) {
                totalSalary=totalSalary+e.salary;
            }
            return totalSalary;
        };

        ArrayList<Employee> l=new ArrayList<>();
        populate(l);
        System.out.println(f.apply(l));

    }

    public static void populate(ArrayList<Employee> l) {
        l.add(new Employee("Sunny",10000));
        l.add(new Employee("Bunny",15000));
        l.add(new Employee("Chinny",18000));
        l.add(new Employee("Vinny",16000));
        l.add(new Employee("Pinny",25000));
    }
}
