package exception17102022.task2;

import java.nio.charset.IllegalCharsetNameException;
import java.util.Scanner;

public class Main2Exception {

    Integer number = 0;

    public static void main(String[] args) {

        Main2Exception task2 = new Main2Exception();
        task2.getCorrectNumber();
        task2.tryAgainInputNumber();

    }

    public void getCorrectNumber() {

        Scanner sc = new Scanner(System.in);
        String s = null;

        try {
            System.out.println("Input any set of 0 and 1: ");
            s = sc.nextLine();
            number = Integer.parseInt(s, 2);

        } catch (NumberFormatException e) {
            System.out.println(s + " this is not a numbers");
            getCorrectNumber();
        }

    }

    public void verifyRange() throws IllegalArgumentException {
        if (number < -5 || number > 5){
            throw new IllegalArgumentException("Not in range from -5 to 5");
        }
    }

    public void tryAgainInputNumber (){
        try {
            verifyRange();
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            getCorrectNumber();
            tryAgainInputNumber();
        }
    }
}
