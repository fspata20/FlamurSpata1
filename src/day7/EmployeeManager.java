package day7;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private static final List<Employee> activeEmployees = new ArrayList<>();
    private static final List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        // Create employees
        Employee employee1 = new Employee("John");
        Employee employee2 = new Employee("Alice");
        Employee employee3 = new Employee("Bob");
        Employee employee4 = new Employee("Emily");
        Employee employee5 = new Employee("Mike");

        // Add employees to the list
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        // Start the simulation
        for (Employee employee : employees) {
            employee.start();
        }
    }

    static class Employee extends Thread {
        private final String name;
        private LocalTime arrivalTime;

        public Employee(String name) {
            this.name = name;
            this.arrivalTime = LocalTime.now();
            activeEmployees.add(this);
        }

        @Override
        public void run() {
            System.out.println(name + ": I came to work at " + arrivalTime);
            int count = 5;
            while (true) {
                try {
                    sleep(10000);
                    System.out.println(name + ": I'm still working!");

                    if (activeEmployees.size() > 1 && activeEmployees.get(count-=1) == this) {
                        releaseEmployee();
                        break;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        private void releaseEmployee() {
            System.out.println(name + ": " + LocalTime.now() + ", it's time to go home!");
            activeEmployees.remove(this);
            interrupt();

            for (Employee employee : activeEmployees) {
                employee.arrivalTime = employee.arrivalTime.minusSeconds(2);
            }
        }
    }
}