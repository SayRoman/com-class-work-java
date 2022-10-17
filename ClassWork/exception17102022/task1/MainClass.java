package exception17102022.task1;

import java.util.Scanner;

public class MainClass {

    Integer number;


    public static void main(String[] args) {

        MainClass mainClass = new MainClass();
        mainClass.getCorrectNumber();


    }

    public void getCorrectNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, input number from 0 to 9: ");
        String s = sc.nextLine();
        try { number = Integer.parseInt(s);

        } catch (NumberFormatException e){
            getCorrectNumber();
        }

    }

}
