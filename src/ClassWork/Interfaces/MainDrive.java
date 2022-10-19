package ClassWork.Interfaces;

public class MainDrive {
    public static void main(String[] args) {
       Car [][] cars = new Car [2][2];
       cars[0][0] = new LeftSideCar();
       cars [0][1] = new DriversPlace();
       cars [1][0] = new LeftSideCar();
       cars [1][1] = new DriversPlace();
    }
}
