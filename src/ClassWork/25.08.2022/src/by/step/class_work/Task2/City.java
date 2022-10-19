import java.util.Scanner;


public class City {
    private Scanner sc = new Scanner(System.in);
    private String nameCity = "";
    private String nameRegion = "";
    private String nameCountry = "";
    private int population = 0;
    private int postCode = 0;
    private int phoneCode = 0;

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity() {
        System.out.print("Введите название города: ");
        this.nameCity = sc.nextLine();
    }

    public String getNameRegion() {
        return nameRegion;
    }

    public void setNameRegion() {
        System.out.print("Введите имя региона: ");
        this.nameRegion = sc.nextLine();
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry() {
        System.out.print("Введите имя страны: ");
        this.nameCountry = sc.nextLine();
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation() {
        System.out.print("Введите количество жителей: ");
        this.population = sc.nextInt();
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode() {
        System.out.print("Введите почтовый индекс города: ");
        this.postCode = sc.nextInt();
    }

    public int getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode() {
        System.out.print("Введите телефонный код города: ");
        this.phoneCode = sc.nextInt();
    }


}
