import Person;

import java.util.Arrays;

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

    @Override
    public String toString() {
        return "City{" +
                "nameCity='" + nameCity + '\'' +
                ", nameRegion='" + nameRegion + '\'' +
                ", nameCountry='" + nameCountry + '\'' +
                ", population=" + population +
                ", postCode=" + postCode +
                ", phoneCode=" + phoneCode +
                ", populationPerson=" + Arrays.toString(populationPerson) +
                '}';
    }
}
