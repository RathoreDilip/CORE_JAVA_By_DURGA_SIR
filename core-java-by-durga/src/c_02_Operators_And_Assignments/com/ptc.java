package c_02_Operators_And_Assignments.com;
class Employee{
    static int count=0;
    int salary;
    String name;

    Employee(){
        if(count < 4)
            count++;
        else
            throw new IllegalArgumentException("You don't allow to create more object.. ");
    }
}
public class ptc {
    public static void main(String[] args) {
        Employee employee1=new Employee();
        Employee employee2=new Employee();
        Employee employee3=new Employee();
        Employee employee4=new Employee();
        System.out.println(Employee.count);
        Employee employee5=new Employee();
        System.out.println(Employee.count);

    }
}
