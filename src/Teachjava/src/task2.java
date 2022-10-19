package Teachjava.src;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        int n = 564;
        System.out.println("Значение n = " + n);
        int a = n / 100;
        int b = (n / 10) % 10;
        int c = n % 10;

        System.out.println("Сумма цифр числа n: ");
        System.out.println(a + b +c);



    }
}
