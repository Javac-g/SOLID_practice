import java.time.LocalDate;

class Employee {
    private String name;
    private LocalDate hireDate;

    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }
}

class EmployeePrinter {
    public void printDetails(Employee employee) {
        System.out.println("Employee: " + employee.getName());
        System.out.println("Hired: " + employee.getHireDate());
    }
}

public class SRPExample {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", LocalDate.of(2022, 1, 10));
        EmployeePrinter printer = new EmployeePrinter();
        printer.printDetails(emp);
    }
}
