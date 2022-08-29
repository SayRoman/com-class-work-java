package by.step.class_work_part2.Task2;

import by.step.class_work_part2.Task1.Person;

public class City {


    private String nameCity = "";
    private String nameRegion = "";
    private String nameCountry = "";
    private int population = 0;
    private int postCode = 0;
    private int phoneCode = 0;

    private Person[] populationPerson;

    public City(String nameCity, String nameRegion, String nameCountry) {
        this.nameCity = nameCity;
        this.nameRegion = nameRegion;
        this.nameCountry = nameCountry;
    }

    public City(String nameCity, String nameRegion, String nameCountry, int population, int postCode, int phoneCode, Person[] populationPerson) {
        this(nameCity, nameRegion, nameCountry);
        this.population = population;
        this.postCode = postCode;
        this.phoneCode = phoneCode;
        this.populationPerson = populationPerson;
    }

}
