package Teachjavapractic.src;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Напишите предложение состоящие более чем из одного слова : ");
        String enter = s.nextLine();
        int count = 0;

        if (enter.length() != 0) {
            count++;

            for (int i = 0; i < enter.length(); i++) {
                if (enter.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        System.out.println("Вы ввели " + count + " слов(а)");
    }
}
