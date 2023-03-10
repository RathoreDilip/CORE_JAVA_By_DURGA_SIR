package c24_Java8_New_Features.c_05_Streams.c_03_Examples;

import java.util.*;
import java.util.stream.Collectors;

class Employee{
    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearsOfJoining;
    double salary;

    public Employee(int id, String name, int age, String gender, String department, int yearsOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearsOfJoining = yearsOfJoining;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public int getYearsOfJoining() {
        return yearsOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", yearsOfJoining=" + yearsOfJoining +
                ", salary=" + salary +
                '}';
    }
}
public class EmployeeDemo {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList=new ArrayList<>();
        populate(employeeList);
        System.out.println(employeeList);

        // count the number of employees in each department
        System.out.println("count the number of employees in each department......");
        Map<String, Long> countEmpEachDept = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(countEmpEachDept);

        System.out.println("-------------");
        List<Employee> collectDeptBySort = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getDepartment))
                .collect(Collectors.toList());
        System.out.println(collectDeptBySort);

        // find out the average salary of male and female employees
        System.out.println("find out the average salary of male and female employees...");
        Map<String, Double> avgSalMaleAndFemale = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalMaleAndFemale);

        // Highest paid employees in the organization
        System.out.println("Highest paid employees in the organization...");
        List<Employee> collectHighestPaidEmp = employeeList.stream()
                .sorted((e1, e2) -> (e1.salary > e2.salary) ? -1 : (e1.salary < e2.salary) ? 1 : 0)
                .limit(1)
                .collect(Collectors.toList());
        System.out.println(collectHighestPaidEmp);

        System.out.println("----------------------");
        Employee employee = employeeList.stream()
                .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))).get();
        System.out.println(employee);

        // Get the average age of each department in an organization
        System.out.println("Get the average age of each department in an organization...");
        Map<String, Double> avgAgeDeptWise = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingInt(Employee::getAge)));
        System.out.println(avgAgeDeptWise);

        // How do you find out most senior employees in the organization
        System.out.println("How do you find out most senior employees in the organization...");
        Employee mostSeniorEmp = employeeList.stream()
                .collect(Collectors.maxBy(Comparator.comparingInt(Employee::getYearsOfJoining).reversed())).get();
        System.out.println(mostSeniorEmp);

        System.out.println("----------------------------");
        mostSeniorEmp = employeeList.stream()
                .sorted(Comparator.comparingInt(Employee::getYearsOfJoining))
                .findFirst().get();
        System.out.println(mostSeniorEmp);

        // Get the details of the most youngest employee in the organization
        System.out.println("Get the details of the most youngest employee in the organization....");
        Employee mostYounEmp = employeeList.stream()
                .collect(Collectors.minBy(Comparator.comparingInt(Employee::getAge))).get();
        System.out.println(mostYounEmp);

        System.out.println("----------------");
        mostYounEmp = employeeList.stream()
                .sorted(Comparator.comparingInt(Employee::getAge))
                .findFirst()
                .get();
        System.out.println(mostYounEmp);

        // How do you get the numbers of employees in each department
        System.out.println("How do you get the numbers of employees in each department...");
        Map<String, Long> collectNoOfEmpEachDept = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        System.out.println(collectNoOfEmpEachDept);

        // Find out the number of male and female employees in the organization
        System.out.println("Find out the number of male and female employees in the organization..");
        Map<String, Long> collectNoOFMaleAndFemale = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(collectNoOFMaleAndFemale);

        // Print the name of all departments in the organization
        System.out.println("Print the name of all departments in the organization.....");
        Set<String> collectAllDept = employeeList.stream()
                .map(employee1 -> employee1.department)
                .distinct().collect(Collectors.toSet());

        System.out.println(collectAllDept);

        // What is average age of male and female employees
        Map<String, Double> collectAvgAgeMaleAndFemale = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(collectAvgAgeMaleAndFemale);

        // Get the details of highest paid employee in the organization
        System.out.println("Get the details of highest paid employee in the organization......");
        Optional<Employee> collectHighestPaidEmployee = employeeList.stream()
                .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        System.out.println(collectHighestPaidEmployee);

        // get the names of all employee who have joined after 2015
        System.out.println("get the names of all employee who have joined after 2015....");
        List<Employee> employeesWhoJoinedAfter2015 = employeeList.stream()
                .filter(employee2 -> employee2.yearsOfJoining > 2015)
                .collect(Collectors.toList());
        System.out.println(employeesWhoJoinedAfter2015);

        // Count the numbers of employees in each department
        System.out.println("Count the numbers of employees in each department....");
        Map<String, Long> collectNoOfEmpEaachDept = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(collectNoOfEmpEaachDept);

        // What is the average salary of each department
        System.out.println("What is the average salary of each department........");
        Map<String, Double> avgSalEachDept = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalEachDept);

        // get the details of youngest male employee in the product development dept
        System.out.println("get the details of youngest male employee in the product development dept......");
        Employee youngEmp = employeeList.stream()
                .filter(e -> e.department.equals("Product Development") && e.gender.equals("Male"))
                .collect(Collectors.minBy(Comparator.comparingInt(Employee::getAge))).get();
        System.out.println(youngEmp);

        // Who has the most working experience in the organization
        System.out.println("Who has the most working experience in the organization...");
        Employee mostYearWorkingExp = employeeList.stream()
                .collect(Collectors.minBy(Comparator.comparingInt(Employee::getYearsOfJoining))).get();
        System.out.println(mostYearWorkingExp);

        // How many male and female employees are there in the sales and marketing team
        System.out.println("How many male and female employees are there in the sales and marketing team...");
        Map<String, Long> sales_and_marketing = employeeList.stream()
                .filter(employee1 -> employee1.department.equals("Sales And Marketing"))
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(sales_and_marketing);

        // List down name of all employees in each department
        System.out.println("List down name of all employees in each department....");
        Map<String, List<Employee>> allDeptEmp = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        Set<Map.Entry<String, List<Employee>>> entriesAllDeptEmp = allDeptEmp.entrySet();
        for (Map.Entry<String, List<Employee>> entry:entriesAllDeptEmp) {
            System.out.println(entry);
        }

        // What is the average and total salary of the whole organization
        System.out.println("What is the average and total salary of the whole organization...");
        DoubleSummaryStatistics collectSumm = employeeList.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println(collectSumm.getMax());
        System.out.println(collectSumm.getAverage());


        // Separated employees who are younger or equal to 25 years from those employees
        // who are older than 25 years
        System.out.println("Separated employees who are younger or equal to 25 years from those employees.....");
        Map<Boolean, List<Employee>> collectSepYoungerEqualTo25 = employeeList.stream()
                .collect(Collectors.partitioningBy(employee1 -> employee1.age >= 25));

        Set<Map.Entry<Boolean, List<Employee>>> entriesSepYoungerEqualTo25 = collectSepYoungerEqualTo25.entrySet();
        for (Map.Entry<Boolean, List<Employee>> entry:entriesSepYoungerEqualTo25) {
            System.out.println(entry);
        }

        // Who is the oldest employee in the organization and what is his age and which organization
        System.out.println("Who is the oldest employee in the organization and what is his age and which organization...");
        Employee oldEmployee = employeeList.stream()
                .collect(Collectors.maxBy(Comparator.comparingInt(Employee::getAge))).get();
        System.out.println(oldEmployee);

        System.out.println("--------------");

        Employee oldEmployee2 = employeeList.stream().
                max(Comparator.comparingInt(Employee::getAge)).get();
        System.out.println(oldEmployee2);

        System.out.println("---------------");
        Employee oldEmployee3 = employeeList.stream()
                .sorted((e1, e2) -> (e1.age > e2.age) ? -1 : (e1.age < e2.age) ? 1 : 0)
                .findFirst().get();
        System.out.println(oldEmployee3);
    }

    public static void populate(ArrayList<Employee> employeeList){
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
    }

}
