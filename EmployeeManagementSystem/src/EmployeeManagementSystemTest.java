public class EmployeeManagementSystemTest {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(5);

        // Add employees
        ems.addEmployee(new Employee("E001", "Alice", "Manager", 80000));
        ems.addEmployee(new Employee("E002", "Bob", "Developer", 60000));
        ems.addEmployee(new Employee("E003", "Charlie", "Designer", 55000));

        // Traverse employees
        System.out.println("All Employees:");
        ems.traverseEmployees();

        // Search for an employee
        System.out.println("\nSearching for Employee with ID E002:");
        Employee employee = ems.searchEmployee("E002");
        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Employee not found.");
        }

        // Delete an employee
        System.out.println("\nDeleting Employee with ID E001:");
        ems.deleteEmployee("E001");

        // Traverse employees after deletion
        System.out.println("All Employees after deletion:");
        ems.traverseEmployees();
    }
}
