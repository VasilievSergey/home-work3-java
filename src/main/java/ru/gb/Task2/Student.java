package ru.gb.Task2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
    private String name;
    private List<Double> grades;
    private String specialty;

    public double getAverageGrade() {
        return grades.stream().mapToDouble(Double::doubleValue).average().orElse(0);
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public Student(String name, List<Double> grades, String specialty) {
        this.name = name;
        this.grades = grades;
        this.specialty = specialty;
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Максим", Arrays.asList(4.5, 4.7, 4.8), "Информатика"),
                new Student("Кристина", Arrays.asList(4.0, 4.2, 4.7), "Биология"),
                new Student("Сергей", Arrays.asList(4.9, 4.8, 5.0), "Информатика"),
                new Student("Геннадий", Arrays.asList(4.5, 4.9, 4.8), "Информатика"),
                new Student("Леонид", Arrays.asList(4.9, 4.9, 4.8), "Информатика"),
                new Student("Татьяна", Arrays.asList(4.1, 4.0, 4.2), "Химия"),
                new Student("Мария", Arrays.asList(4.1, 4.0, 4.2), "Химия"),
                new Student("Степан", Arrays.asList(4.5, 4.8, 5.0), "Информатика"),
                new Student("Петр", Arrays.asList(4.5, 4.6, 4.8), "Информатика"),
                new Student("Анастасия", Arrays.asList(2.1, 4.0, 4.2), "Химия")
        );

        // добавить студентов в список

        List<Student> result = students.stream()
                .filter(student -> student.getSpecialty().equals("Информатика"))
                .filter(student -> student.getAverageGrade() > 4.5)
                .sorted((s1, s2) -> Double.compare(s2.getAverageGrade(), s1.getAverageGrade()))
                .limit(5)
                .toList();

        NumberFormat formatter = new DecimalFormat("#0.0");
        result.forEach(student ->
                System.out.println("Имя: " + student.getName() +
                        ", Специальность: " + student.getSpecialty() +
                        ", Средний балл: " + formatter.format(student.getAverageGrade())));
    }


}