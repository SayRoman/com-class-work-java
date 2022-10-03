package Interfaces;

public interface Car {
    default void showCaName(){
        System.out.print("Default Car");
    }
}
