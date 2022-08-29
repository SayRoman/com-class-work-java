package by.step.class_work_part2.Task3;

import java.util.Scanner;

public class Country {

    private String nameCountry = "";
    private String nameContinent = "";
    private int population = 0;
    private int phoneCode = 0;
    private String capital = "";
    private String namesCites = "";

    public Country(String nameCountry, String nameContinent) {
        this.nameCountry = nameCountry;
        this.nameContinent = nameContinent;
    }

    public Country(String nameCountry, String nameContinent, int population, int phoneCode) {
        this(nameCountry, nameContinent);
        this.population = population;
        this.phoneCode = phoneCode;
    }

    public Country(String nameCountry, String nameContinent, int population, int phoneCode, String capital, String namesCites) {
        this(nameCountry, nameContinent, population, phoneCode);
        this.capital = capital;
        this.namesCites = namesCites;
    }
}
