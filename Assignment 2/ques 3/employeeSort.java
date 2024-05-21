package com.assignment.a2;


import java.util.Arrays;
import java.util.Comparator;

public class employeeSort {

    public static void main(String[] args) {
     Employee[] employees = {
                new Employee(1, "John", 50000),
                new Employee(2, "Alice", 60000),
                new Employee(3, "Bob", 55000),
                new Employee(4, "Emily", 62000)
        };
//        Arrays.sort(employees, Comparator.comparing(Employee::getSalary));

        // Display sorted employees

        insertionSort(employees);
        System.out.println("Employees sorted by salary:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
    public static void insertionSort(Employee[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Employee key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].getSalary() > key.getSalary()) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
