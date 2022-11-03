package JavaClassWork.src.collection.task1;

import java.util.*;

public class MainClass {

   private List<Integer> dB = new ArrayList<>();
   private Map<Integer, String> menu = new HashMap<>();


    public static void main(String[] args) {
        MainClass main = new MainClass();
        main.dB.add(main.getNumberFromConsole());
        main.dB.add(main.getNumberFromConsole());
        main.dB.add(main.getNumberFromConsole());

    }

    public int getNumberFromConsole(){
        System.out.println("Input numbers: ");
        return new Scanner(System.in).nextInt();
    }

    public void createMenu (){
        menu.put(1,"Add element to the list.");
        menu.put(2,"Delete element to the list.");
        menu.put(3,"Show element from the list.");
        menu.put(4,"Check element in the list.");
        menu.put(5,"Insert element to the list.");
        menu.put(6,"Close");
    }
}
