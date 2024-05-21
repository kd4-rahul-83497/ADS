package com.assignment.a4;

import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    double salary;
    Employee next;

    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.next = null;
    }
}

public class EmployeeLinkedList {
    private Employee head;

    public EmployeeLinkedList() {
        head = null;
    }

    public void addEmployee(int empId, String empName, double salary) {
        Employee newEmployee = new Employee(empId, empName, salary);
        if (head == null) {
            head = newEmployee;
        } else {
            Employee current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newEmployee;
        }
        System.out.println("Employee added successfully.");
    }

    public void displayEmployees() {
        if (head == null) {
            System.out.println("No employees found.");
            return;
        }
        System.out.println("Employee List:");
        Employee current = head;
        while (current != null) {
            System.out.println("Employee ID: " + current.empId + ", Name: " + current.empName + ", Salary: " + current.salary);
            current = current.next;
        }
    }

    public Employee searchEmployeeByName(String empName) {
        Employee current = head;
        while (current != null) {
            if (current.empName.equals(empName)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void deleteEmployeeById(int empId) {
        if (head == null) {
            System.out.println("No employees found.");
            return;
        }
        if (head.empId == empId) {
            head = head.next;
            System.out.println("Employee with ID " + empId + " deleted successfully.");
            return;
        }
        Employee current = head;
        while (current.next != null) {
            if (current.next.empId == empId) {
                current.next = current.next.next;
                System.out.println("Employee with ID " + empId + " deleted successfully.");
                return;
            }
            current = current.next;
        }
        System.out.println("Employee with ID " + empId + " not found.");
    }

    public void updateEmployeeSalary(int empId, double newSalary) {
        Employee current = head;
        while (current != null) {
            if (current.empId == empId) {
                current.salary = newSalary;
                System.out.println("Salary updated successfully for employee with ID " + empId);
                return;
            }
            current = current.next;
        }
        System.out.println("Employee with ID " + empId + " not found.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeLinkedList employeeList = new EmployeeLinkedList();

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by Name");
            System.out.println("4. Delete Employee by ID");
            System.out.println("5. Update Employee Salary");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int empId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Employee Name: ");
                    String empName = scanner.nextLine();
                    System.out.print("Enter Employee Salary: ");
                    double salary = scanner.nextDouble();
                    employeeList.addEmployee(empId, empName, salary);
                    break;
                case 2:
                    employeeList.displayEmployees();
                    break;
                case 3:
                    System.out.print("Enter Employee Name to search: ");
                    String searchName = scanner.nextLine();
                    Employee foundEmployee = employeeList.searchEmployeeByName(searchName);
                    if (foundEmployee != null) {
                        System.out.println("Employee found:");
                        System.out.println("Employee ID: " + foundEmployee.empId + ", Name: " + foundEmployee.empName + ", Salary: " + foundEmployee.salary);
                    } else {
                        System.out.println("Employee with name " + searchName + " not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = scanner.nextInt();
                    employeeList.deleteEmployeeById(deleteId);
                    break;
                case 5:
                    System.out.print("Enter Employee ID to update salary: ");
                    int updateId = scanner.nextInt();
                    System.out.print("Enter new salary: ");
                    double newSalary = scanner.nextDouble();
                    employeeList.updateEmployeeSalary(updateId, newSalary);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        } while (choice != 0);
        scanner.close();
    }
}

