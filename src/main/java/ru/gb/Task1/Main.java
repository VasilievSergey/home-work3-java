package ru.gb.Task1;
import java.time.LocalDate;
import java.util.*;
import static ru.gb.Task1.Employee.birthDateComparator;

public class Main {
    static ArrayList<Employee> employees = new ArrayList<>();

    // метод увеличеличения зарплаты сотрудникам указанного диапазона возраста
    public static void changeSalary(ArrayList<Employee> arr, int age, int increase) {
        for (Employee item : arr) {
            if (item.getAge() > age) {
                item.setSalary(item.getSalary() + increase);
            }
        }
    }

    // метод вывода среднего возраста и средней зарплаты
    public static void printAverages(ArrayList<Employee> employees) {
        int avAge = 0;
        int avSalary = 0;
        for (Employee item : employees) {
            avAge += item.getAge();
            avSalary += (int) item.getSalary();
        }
        System.out.println("Средний возраст равен: " + avAge / employees.size());
        System.out.println("Средняя зарплата равна: " + avSalary / employees.size());
    }

    public static void main(String[] args) {

        employees.add(new Manager("Ivan", "Petrivich", "Samoylov", "director", "+7(924)345-67-12", 60000, 43, LocalDate.of(1980,10,9)));
        employees.add(new Employee("Olga", "Petrovna", "Morozova", "salesperson", "+7(924)345-67-12", 30000, 48, LocalDate.of(1975,3,13)));
        employees.add(new Employee("Andrey", "Stepanovich", "Volkov", "driver", "+7(924)345-67-12", 25000, 38,LocalDate.of(1985,11,23)));
        employees.add(new Employee("Petr", "Andreevich", "Matveev", "driver", "+7(924)345-67-12", 25000, 22,LocalDate.of(2001,3,23)));
        employees.add(new Employee("Anton", "Maksimovich", "Potapov", "secretary", "+7(924)345-67-12", 45000, 23,LocalDate.of(2000,9,7)));
        employees.add(new Employee("Sonya", "Valentinovich", "Tolpin", "security", "+7(924)345-67-12", 40000, 44,LocalDate.of(1979,10,1)));
        employees.add(new Employee("Pavel", "Antonovich", "Ivanov", "security", "+7(924)345-67-12", 40000, 40,LocalDate.of(1983,6,3)));

        // вывод форматированной информации
        for (Employee item : employees) {
            //System.out.println(item.infoFormat());
        }

        // вывод информации до увеличении зарплаты всем, кроме директора
        for (Employee item : employees) {
            //System.out.println(item.toString());
        }
        Manager.increaseSalary(employees.toArray(new Employee[0]), 1000);

        System.out.println("  ");

        // вывод информации после увеличении зарплаты всем, кроме директора
        for (Employee item : employees) {
            //System.out.println(item.toString());
        }
        Employee ivan = (new Manager("Ivan", "Petrivich", "Samoylov", "director", "+7(924)345-67-12", 60000, 43, LocalDate.of(1980,10,9)));
        Employee olga = (new Employee("Olga", "Petrovna", "Morozova", "salesperson", "+7(924)345-67-12", 30000, 48, LocalDate.of(1975,3,13)));

        if (birthDateComparator().compare(ivan, olga) < 0) {
            System.out.println(ivan.getSurName() + " старше " + olga.getSurName());
        } else if (birthDateComparator().compare(ivan, olga) > 0) {
            System.out.println(ivan.getSurName() + " младше " + olga.getSurName());
        } else {
            System.out.println(ivan.getSurName() + " равен " + olga.getSurName());
        }
    }
}

