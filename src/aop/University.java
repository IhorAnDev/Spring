package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Igor Antonov", 4, 7.5);
        Student st2 = new Student("Egor Ampilov", 2, 5.3);
        Student st3 = new Student("Petr Ivanov", 1, 8.2);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Nachalo raboti getstudents ");
//        System.out.println(students.get(3));
        System.out.println("Info from method getStudents:");
        System.out.println(students);
        return students;
    }
}
