package by.step.class_work_part2.Main;

import by.step.class_work_part2.Task1.Person;
import by.step.class_work_part2.Task2.City;
import by.step.class_work_part2.Task5.Book;
import by.step.class_work_part2.Task6.Car;

public class MainClass {
    public static void main(String[] args) {

        Book [] books = new Book[2];
        Book book1 = new Book("The Hobbit", "Tolkian", "1990", "Druk", "Fantazy", 120);
        Book book2 = new Book("The Lord of the Ring", "Tolkian", "1996", "Druk", "Fantazy", 1200);

        Car [] cars = new Car[1];
        Car car1 = new Car("Audi", "GeneralMotors", 1989,1.6);

        City [] population = new City[1];
        Person person1 = new Person("Roman", "Kornyshev", "Valerievich", "8 december 1989", "292111972", "Vitebsk", "Belarus", "Pr. Pobedy", books, cars);

    }
}
