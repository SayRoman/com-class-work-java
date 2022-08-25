package by.step.class_work.Task1;

import java.util.Scanner;

public class Person {

    private Scanner sc = new Scanner(System.in);

    private String lastName;
    private String firstName;
    private String nameFather;
    private String dateBirthday;
    private String phoneNumber;
    private String city;
    private String country;
    private String adress;

    public String getLastName() {
        return lastName;
    }

    public void setLastName() {
        System.out.print("Введите Фамилию: ");
        this.lastName = sc.nextLine();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName() {
        System.out.print("Введите Имя: ");
        this.firstName = sc.nextLine();
    }

    public String getNameFather() {
        return nameFather;
    }

    public void setNameFather() {
        System.out.print("Введите отчество: ");
        this.nameFather = sc.nextLine();
    }

    public String getDateBirthday() {
        return dateBirthday;
    }

    public void setDateBirthday() {
        System.out.print("Введите дату рождения (формат даты дд.мм.гггг)");
        this.dateBirthday = sc.nextLine();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber() {
        System.out.print("Введите номер телефона (хххххххххххх): ");
        this.phoneNumber = sc.nextLine();
    }

    public String getCity() {
        return city;
    }

    public void setCity() {
        System.out.print("Введите название города: ");
        this.city = sc.nextLine();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry() {
        System.out.print("Введите название страны: ");
        this.country = sc.nextLine();
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress() {
        System.out.print("Введите домашний адресс: ");
        this.adress = sc.nextLine();
    }
}
