package com.assignment.a2;
import java.util.*;
class Employee {
    int empId;
    String name;
    double salary;

    Employee(int empId, String name, double salary) {
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
    @Override
    public String toString() {
        return "Employee [id=" + empId + ", name=" + name + ", salary=" + salary + "]";
    }
}

