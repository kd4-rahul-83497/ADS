package com.assignment.a1;

import java.util.Scanner;

public class EmployeeSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array of employees
        Employee[] employees = {
                new Employee(1, "John", 50000),
                new Employee(2, "Alice", 60000),
                new Employee(3, "Bob", 55000),
                new Employee(4, "Emily", 62000)
        };

        boolean exit = false;
        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Search by Employee ID");
            System.out.println("2. Search by Name");
            System.out.println("3. Search by Salary");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = scanner.nextInt();
                    Employee foundById = searchById(employees, searchId);
                    if (foundById != null) {
                        System.out.println("Employee found: " + foundById.getName());
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;
                case 2:
                    System.out.print("Enter Name to search: ");
                    String searchName = scanner.nextLine();
                    Employee foundByName = searchByName(employees, searchName);
                    if (foundByName != null) {
                        System.out.println("Employee found with ID: " + foundByName.getEmpId());
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter Salary to search: ");
                    double searchSalary = scanner.nextDouble();
                    Employee foundBySalary = searchBySalary(employees, searchSalary);
                    if (foundBySalary != null) {
                        System.out.println("Employee found with ID: " + foundBySalary.getEmpId());
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
        scanner.close();
    }

    // Linear search by employee ID
    public static Employee searchById(Employee[] employees, int id) {
        for (Employee employee : employees) {
            if (employee.getEmpId() == id) {
                return employee;
            }
        }
        return null; // Employee not found
    }

    // Linear search by employee name
    public static Employee searchByName(Employee[] employees, String name) {
        for (Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(name)) {
                return employee;
            }
        }
        return null; // Employee not found
    }

    // Linear search by employee salary
    public static Employee searchBySalary(Employee[] employees, double salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() == salary) {
                return employee;
            }
        }
        return null; // Employee not found
    }
}

