import by.step.class_work_part2.Task5.Book;
import by.step.class_work_part2.Task6.Car;

import java.util.Arrays;

public class Person {

    private String lastName;
    private String firstName;
    private String nameFather;
    private String dateBirthday;
    private String phoneNumber;
    private String city;
    private String country;
    private String adres;
    private Book [] countBook;
    private Car [] countCar;


    public Person(String firstName, String lastName, String nameFather) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nameFather = nameFather;
    }

    public Person(String firstName, String lastName, String nameFather, String dateBirthday, String phoneNumber) {
        this(firstName, lastName, nameFather);
        this.dateBirthday = dateBirthday;
        this.phoneNumber = phoneNumber;
    }

    public Person(String firstName, String lastName, String nameFather, String dateBirthday, String phoneNumber, String city, String country, String adres, Book[] countBook, Car[] countCar) {
        this(firstName, lastName, nameFather, dateBirthday, phoneNumber);
        this.city = city;
        this.country = country;
        this.adres = adres;
        this.countBook = countBook;
        this.countCar = countCar;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", nameFather='" + nameFather + '\'' +
                ", dateBirthday='" + dateBirthday + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", adres='" + adres + '\'' +
                ", countBook=" + Arrays.toString(countBook) +
                ", countCar=" + Arrays.toString(countCar) +
                '}';
    }
}

