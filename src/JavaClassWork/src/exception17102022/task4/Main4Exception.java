package exception17102022.task4;


import java.util.Scanner;

public class Main4Exception {

    String inputedString = "";
    String[] numbers;

    public static void main(String[] args) {
        Main4Exception task4 = new Main4Exception();
        task4.getString();
        task4.splitString();
        task4.verifyNumbers();
        System.out.println(task4.calculateSum());
    }

    public void getString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input any Math simbol: ");
        inputedString = sc.nextLine();
    }

    public void splitString() {
        numbers = inputedString.split("\\+");
    }


    public void verifyNumbers() {
        for (String number : numbers) {
            try {
                Integer.parseInt(number);
            } catch (NumberFormatException e) {
                System.out.println("Wrong numbers");
                getString();
                splitString();
                verifyNumbers();
            }
        }

    }

    public int calculateSum() {
        int sum = 0;
        for (String number : numbers) {
            sum += Integer.valueOf(number);
        }
        return sum;
    }
}
