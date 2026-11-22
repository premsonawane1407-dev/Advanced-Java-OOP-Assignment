
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    int rollNo;
    String name;
    double marks;

    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return rollNo + " | " + name + " | " + marks;
    }
}

public class StudentSorting {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(3, "Aman", 82.5));
        students.add(new Student(1, "Sara", 91));
        students.add(new Student(2, "Neel", 76.5));

        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student a, Student b) {
                return Double.compare(b.marks, a.marks);
            }
        });

        System.out.println("Students sorted by marks:");

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
