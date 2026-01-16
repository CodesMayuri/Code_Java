import java.util.Vector;

class Employee {
    private int empId;
    private String name;
    private double salary;

    // Constructor
    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Getter methods
    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class CP32 {
    public static void main(String[] args) {

        Vector<Employee> employees = new Vector<>();

        // Adding employee objects
        employees.add(new Employee(101, "Rohit", 45000));
        employees.add(new Employee(102, "Priya", 65000));
        employees.add(new Employee(103, "Aman", 48000));

        // Increase salary by 10% if salary < 50000
        for (Employee e : employees) {
            if (e.getSalary() < 50000) {
                double updatedSalary = e.getSalary() * 1.10;
                e.setSalary(updatedSalary);
                System.out.println(
                    "Updated Salary for " + e.getName() + ": " + updatedSalary
                );
            }
        }

        // Search employee by ID
        int searchId = 102;
        boolean found = false;

        for (Employee e : employees) {
            if (e.getEmpId() == searchId) {
                System.out.println(
                    "\nEmployee Found: " + e.getName() +
                    " Salary: " + e.getSalary()
                );
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nEmployee not found");
        }

        // Display employees earning more than 60000
        System.out.println("\nEmployees earning above 60000:");
        for (Employee e : employees) {
            if (e.getSalary() > 60000) {
                System.out.println(e.getName());
            }
        }
    }
}
