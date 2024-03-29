package exception17102022.task1;

import java.util.Scanner;

public class MainException {
    Integer number;
    public static void main(String[] args) {

        MainException mainClass = new MainException();
        mainClass.getCorrectNumber();
        mainClass.verifyRange();
        System.out.println(mainClass.number + " this number in range");
    }

        public void getCorrectNumber () {
            Scanner sc = new Scanner(System.in);
            String s = null;
            try {
                System.out.println("Please, input number from 0 to 9: ");
                s = sc.nextLine();
                number = Integer.parseInt(s);

            } catch (NumberFormatException e) {
                System.out.println(s + " it's not a number!");
                getCorrectNumber();
            }
        }

        public void verifyInputNumber () throws IllegalArgumentException {
            if (number > 9 || number < 0) {
                throw new IllegalArgumentException("Not in range from 0 to 9");
            }
        }

        public void verifyRange () {
            try {
                verifyInputNumber();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                getCorrectNumber();
                verifyRange();
            }

        }
    }

