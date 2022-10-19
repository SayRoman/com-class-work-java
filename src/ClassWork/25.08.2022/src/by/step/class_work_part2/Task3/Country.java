import City;

import java.util.Arrays;
import java.util.Scanner;

public class Country {

    private String nameCountry = "";
    private String nameContinent = "";
    private int population = 0;
    private int phoneCode = 0;
    private String capital = "";
    private String namesCites = "";
    private City [] countCities;

    public Country(String nameCountry, String nameContinent) {
        this.nameCountry = nameCountry;
        this.nameContinent = nameContinent;
    }

    public Country(String nameCountry, String nameContinent, int population, int phoneCode) {
        this(nameCountry, nameContinent);
        this.population = population;
        this.phoneCode = phoneCode;
    }

    public Country(String nameCountry, String nameContinent, int population, int phoneCode, String capital, String namesCites, City[] countCities) {
        this(nameCountry, nameContinent, population, phoneCode);
        this.capital = capital;
        this.namesCites = namesCites;
        this.countCities = countCities;
    }

    @Override
    public String toString() {
        return "Country{" +
                "nameCountry='" + nameCountry + '\'' +
                ", nameContinent='" + nameContinent + '\'' +
                ", population=" + population +
                ", phoneCode=" + phoneCode +
                ", capital='" + capital + '\'' +
                ", namesCites='" + namesCites + '\'' +
                ", countCities=" + Arrays.toString(countCities) +
                '}';
    }
}
