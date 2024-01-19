package ru.gb.Task1;

import java.time.LocalDate;
import java.util.Comparator;

import static ru.gb.Task1.Main.employees;

public class Employee {
    private String name;
    private String midName;
    private String surName;
    private String position;
    private String phone;
    private double salary;
    private int age;
    private LocalDate birthDate;


    public Employee(String name, String midName, String surName, String position, String phone, double salary, int age, LocalDate birthDate) {
        this.name = name;
        this.midName = midName;
        this.surName = surName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
        this.birthDate = birthDate;
    }

    public java.lang.String getName() {
        return name;
    }

    public java.lang.String getMidName() {
        return midName;
    }

    public java.lang.String getSurName() {
        return surName;
    }

    public String getPosition() {
        return position;
    }

    public String getPhone() {
        return phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public java.time.LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(java.time.LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    // вывод информациии
    @Override
    public String toString() {
        return "Employee{" +
                "surName='" + surName + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
    // форматированный вывод
    public String infoFormat(){
        return String.format("Employee {name = '%s'," +
                        ", midName = '%s'" +
                        ", surName = '%s'" +
                        ", position = '%s'" +
                        ", phone = '%s'" +
                        ", salary = %f" +
                        ", age = %d }\n"
                , name
                , midName
                , surName
                , position
                , phone
                , salary
                , age);
    }
    // форматированный вывод 2
    public String infoFormat2(){
        return String.format("Employee {name = '%s'," +
                        ", Age = '%s'}\n"
                , name
                , birthDate);
    }
    // метод надбавки к зарплате сотрудников
    public void increaseSalary(double increase) {
        salary += increase;
    }

    public static Comparator<Employee> birthDateComparator() {
        return Comparator.comparing(employee -> employee.birthDate);
    }


}
