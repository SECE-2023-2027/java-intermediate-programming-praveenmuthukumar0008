// Base Class
class Employee {
    protected String name;
    protected double baseSalary;

    // Constructor
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Method to calculate salary
    public double calculateSalary() {
        return baseSalary;
    }
}

// Subclass
class Manager extends Employee {
    private double bonus;

    // Constructor using super
    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    // Overridden method
    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}

// Driver Class
public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee("Bob", 3000);
        Manager mgr = new Manager("Charlie", 5000, 1500);

        System.out.println(emp.calculateSalary());
        System.out.println(mgr.calculateSalary());
    }
}