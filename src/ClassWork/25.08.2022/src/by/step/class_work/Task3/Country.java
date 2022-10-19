import java.util.Scanner;

public class Country {
    private Scanner sc = new Scanner(System.in);

    private String nameCountry = "";
    private String nameContinent = "";
    private int population = 0;
    private int phoneCode = 0;
    private String capital = "";
    private String namesCites = "";

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry() {
        System.out.print("Введите имя страны: ");
        this.nameCountry = sc.nextLine();
    }

    public String getNameContinent() {
        return nameContinent;
    }

    public void setNameContinent() {
        System.out.print("Введите имя континента: ");
        this.nameContinent = sc.nextLine();
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation() {
        System.out.print("Введите количество населения: ");
        this.population = sc.nextInt();
    }

    public int getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(int phoneCode) {
        System.out.print("Введите телефонный код страны: ");
        this.phoneCode = sc.nextInt();
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        System.out.print("Введите название столицы: ");
        this.capital = sc.nextLine();
    }

    public String getNamesCites() {
        return namesCites;
    }

    public void setNamesCites() {
        System.out.print("Введите именя городов: ");
        this.namesCites = sc.nextLine();
    }


}
