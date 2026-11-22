
import java.io.*;

class StudentRecord implements Serializable {
    int rollNo;
    String name;
    double marks;

    StudentRecord(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return rollNo + " | " + name + " | " + marks;
    }
}

public class StudentSerialization {
    public static void main(String[] args) {

        StudentRecord student =
                new StudentRecord(12, "Meera", 88.5);

        try {
            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream("student.dat"));

            out.writeObject(student);
            out.close();

            System.out.println("Serialization successful.");

            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream("student.dat"));

            StudentRecord restored =
                    (StudentRecord) in.readObject();

            in.close();

            System.out.println("Restored Student:");
            System.out.println(restored);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
