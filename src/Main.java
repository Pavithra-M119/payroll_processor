class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double calculatePay() {
        return 0.0;
    }
}

class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public double calculatePay() {
        return salary;
    }
}

class HourlyEmployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(String name, double hourlyRate, double hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked; // Weekly pay
    }
}

public class Main{
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee1 = new SalariedEmployee("pavi", 1000000);
        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("liya", 13.0, 50.0);

        System.out.println("Salaried employee name: " + salariedEmployee1.getName());
        System.out.println("monthly income of employee: $" + salariedEmployee1.calculatePay());

        System.out.println("\nHourly employee name : " + hourlyEmployee1.getName());
        System.out.println("Weekly income of employee: $" + hourlyEmployee1.calculatePay());
    }
}