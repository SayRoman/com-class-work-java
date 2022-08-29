package by.step.class_work_part2.Main;

import by.step.class_work_part2.Task1.Person;
import by.step.class_work_part2.Task2.City;
import by.step.class_work_part2.Task3.Country;
import by.step.class_work_part2.Task5.Book;
import by.step.class_work_part2.Task6.Car;

public class MainClass {
    public static void main(String[] args) {

        Book[] books = new Book[2];
        books[0] = new Book("The Hobbit", "Tolkian", "1990", "Druk", "Fantazy", 120);
        books[1] = new Book("The Lord of the Ring", "Tolkian", "1996", "Druk", "Fantazy", 1200);

        Car[] cars = new Car[1];
        cars[0] = new Car("Audi", "GeneralMotors", 1989, 1.6);

        Person[] population = new Person[1];
        population[0] = new Person("Roman", "Kornyshev", "Valerievich", "8 december 1989",
                "292111972", "Vitebsk", "Belarus", "Pr. Pobedy", books, cars);

        City[] cities = new City[3];
        cities[0] = new City("Vitebsk", "Vitebskaya oblast'", "Belarus", 1, 233222, 212, population);
        cities[1] = new City("Mogilev", "Mog", "Belarus");
        cities[2] = new City("Minsk", "Mincsk", "Belarus");

        Country Belarus = new Country("Belarus", "Evrazia", 1, 375, "Minsk", "Vitebsk, Minsk, Mogilev", cities);

    }
}
