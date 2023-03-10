package c24_Java8_New_Features.c_05_Streams.c_03_Examples;

import java.util.*;
import java.util.stream.Collectors;

class Student{
    String name;
    int id;
    String subject;
    double percentage;

    public Student(String name, int id, String subject, double percentage) {
        this.name = name;
        this.id = id;
        this.subject = subject;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    public double getPercentage() {
        return percentage;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", subject='" + subject + '\'' +
                ", percentage=" + percentage +
                '}';
    }
}

public class StudentsDemo {
    public static void main(String[] args) {
        ArrayList<Student> studList=new ArrayList<>();
        populate(studList);
        System.out.println(studList);

        // Given a list of students, partition the students who got above 60%
        // from those who didn't
        System.out.println("partition who got greater than 60");
        Map<Boolean, List<Student>> collectMap = studList.stream()
                .collect(Collectors.partitioningBy(student -> student.getPercentage() > 60));

        System.out.println(collectMap);

        System.out.println("----------------");
        Set<Map.Entry<Boolean, List<Student>>> entries = collectMap.entrySet();
        for (Map.Entry<Boolean, List<Student>> entry:entries) {
            System.out.println(entry);
        }

        System.out.println("-----------------");
        Set set=collectMap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry<Boolean,List<Student>> entry = (Map.Entry<Boolean, List<Student>>) iterator.next();
            System.out.println(entry);
        }

        // Given a list of student, get the names of top 3 performing students
        System.out.println("Given a list of student, get the names of top 3 performing students..");
        List<Student> collectTop3 = studList.stream()
                .sorted((s1, s2) -> (s1.getPercentage() > s2.getPercentage()) ? -1 : (s1.getPercentage() < s2.getPercentage()) ? 1 : 0)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(collectTop3);
        System.out.println("------------------");

        collectTop3 = studList.stream()
                .sorted(Comparator.comparingDouble(Student::getPercentage).reversed())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(collectTop3);

        // How do you get the name and percentage of each student
        System.out.println("How do you get the name and percentage of each student....");

        Map<String, Double> collectNameAndPer = studList.stream()
                .collect(Collectors.toMap(Student::getName, Student::getPercentage));
        System.out.println(collectNameAndPer);

        // How do you get the subjects offered in the college
        System.out.println("How do you get the subjects offered in the college......");
        Set<String> collectSub = studList.stream()
                .map(Student::getSubject)
                .collect(Collectors.toSet());
        System.out.println(collectSub);

        // Get highest,lowest and average percentage of students
        System.out.println("Get highest,lowest and average percentage of students...");
        DoubleSummaryStatistics collectStudSumm = studList.stream()
                .collect(Collectors.summarizingDouble(Student::getPercentage));
        System.out.println("Highest Per : "+collectStudSumm.getMax());
        System.out.println("Minimum Per : "+collectStudSumm.getMin());
        System.out.println("Average Per : "+collectStudSumm.getAverage());

        // How do you get total number of students from list
        System.out.println("How do you get total number of students from list...");
        Long collectCount = studList.stream()
                .collect(Collectors.counting());
        System.out.println(collectCount);

        // How do you get the Students grouped by subjects from the given list of students
        System.out.println("How do you get the Students grouped by subjects from the given list of students...");
        Map<String, List<Student>> collectGroupBySubject = studList.stream()
                .collect(Collectors.groupingBy(Student::getSubject));

        Set<Map.Entry<String, List<Student>>> entriesSubject = collectGroupBySubject.entrySet();
        for (Map.Entry<String, List<Student>> entry:entriesSubject) {
            System.out.println(entry);
        }

    }

    public static void populate(ArrayList<Student> list){
        list.add(new Student("Ajay",1,"GK",50));
        list.add(new Student("Brijesh",2,"Science",60));
        list.add(new Student("Chetan",4,"Maths",35));
        list.add(new Student("Dilip",3,"English",52));
        list.add(new Student("Irsad",5,"History",65));
        list.add(new Student("Khayati",9,"GK",80));
        list.add(new Student("Manju",8,"Chemistry",90));
        list.add(new Student("Varsha",6,"Hindi",70));
        list.add(new Student("Ajinkya",7,"Maths",25));
        list.add(new Student("Sanket",10,"Chemistry",30));
    }
}
