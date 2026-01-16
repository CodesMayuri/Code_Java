import java.util.Vector;
class Student {
    private int id;
    private String name;
    private double marks;

    // Constructor
    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    // Method to assign grade
    public char getGrade() {
        if (marks >= 90)
            return 'A';
        else if (marks >= 75)
            return 'B';
        else if (marks >= 60)
            return 'C';
        else
            return 'D';
    }
}

public class CP31 {
    public static void main(String[] args) {

        Vector<Student> students = new Vector<>();

        // Adding student objects
        students.add(new Student(1, "Amit", 78));
        students.add(new Student(2, "Neha", 85));
        students.add(new Student(3, "Rahul", 65));
        students.add(new Student(4, "Sneha", 90));

        // Display all students
        System.out.println("All Students:");
        for (Student s : students) {
            System.out.println(
                s.getId() + " " + s.getName() + " " + s.getMarks() +
                " Grade: " + s.getGrade()
            );
        }

        // Calculate average marks
        double total = 0;
        for (Student s : students) {
            total += s.getMarks();
        }

        double average = total / students.size();
        System.out.println("\nAverage Marks: " + average);

        // Display students scoring above average
        System.out.print("Above Average Students: ");
        for (Student s : students) {
            if (s.getMarks() > average) {
                System.out.print(s.getName() + " ");
            }
        }
    }
}
