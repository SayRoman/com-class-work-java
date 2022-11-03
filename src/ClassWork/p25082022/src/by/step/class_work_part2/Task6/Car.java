package ClassWork.p25082022.src.by.step.class_work.Task1

public class Car {
    private String nameCar;
    private String nameCompany;
    private int yearBuild;
    private double volumeEngine;


    public Car(String nameCar, String nameCompany, int yearBuild, double volumeEngine) {
        this.nameCar = nameCar;
        this.nameCompany = nameCompany;
        this.yearBuild = yearBuild;
        this.volumeEngine = volumeEngine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "nameCar='" + nameCar + '\'' +
                ", nameCompany='" + nameCompany + '\'' +
                ", yearBuild=" + yearBuild +
                ", volumeEngine=" + volumeEngine +
                '}';
    }
}
