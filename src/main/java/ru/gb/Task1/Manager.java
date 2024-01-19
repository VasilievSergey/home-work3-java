package ru.gb.Task1;

import ru.gb.Task1.Employee;

import java.time.LocalDate;

import static ru.gb.Task1.Main.employees;

public class Manager extends Employee {
    public Manager(String name, String midName, String surName, String position, String phone, double salary, int age, LocalDate birthDate) {
        super(name, midName, surName, position, phone, salary, age, birthDate);
    }
   // статический метод надбавки директора
    public static void increaseSalary(Employee[] employees, double increase) {
        for (Employee employee : employees
        ) {
            if (!(employee instanceof Manager)) {
                employee.increaseSalary(increase);
            }
        }
    }

}
