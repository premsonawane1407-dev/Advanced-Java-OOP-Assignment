
abstract class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    abstract double calculateSalary();

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: Rs. " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    double salary;

    FullTimeEmployee(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    double calculateSalary() {
        return salary + salary * 0.10;
    }
}

class PartTimeEmployee extends Employee {
    int hours;
    double rate;

    PartTimeEmployee(int id, String name, int hours, double rate) {
        super(id, name);
        this.hours = hours;
        this.rate = rate;
    }

    double calculateSalary() {
        return hours * rate;
    }
}

public class EmployeePayroll {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(101, "Riya", 30000);
        Employee e2 = new PartTimeEmployee(102, "Kabir", 80, 250);

        e1.display();
        System.out.println();
        e2.display();
    }
}
