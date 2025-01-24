package Java8;

import java.util.*;

class MyStudent{
    String name;
    int id;

    MyStudent(String name, int id){
        this.name = name;
        this.id = id;
    }
}

public class SortingObjects {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(3);
        list.add(5);
        Collections.sort(list, (a,b)-> b-a);
        System.out.println(list);

        Map<Integer, String> studentMap  = new TreeMap<>((a,b)-> b - a);
        studentMap.putIfAbsent(5, "John");
        studentMap.putIfAbsent(6, "Jane");
        studentMap.putIfAbsent(7, "Bob");

        System.out.println(studentMap);

        MyStudent student1 = new MyStudent("John", 1);
        MyStudent student2 = new MyStudent("Jane", 2);
        MyStudent student3 = new MyStudent("Bob", 3);

        List<MyStudent> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        Collections.sort(students, (a, b)-> a.id - b.id);
        System.out.println();
        for(MyStudent student : students){
            System.out.print(student.id+" : "+student.name+" \t");
        }

        Collections.sort(students, (a, b)-> a.name.compareTo(b.name));
        System.out.println();
        for(MyStudent student : students){
            System.out.print(student.id+" : "+student.name+" \t");
        }
    }
}
