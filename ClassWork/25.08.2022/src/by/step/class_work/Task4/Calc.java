package by.step.class_work.Task4;

import java.util.Scanner;

public class Calc {
    private Scanner sc = new Scanner(System.in);
    private double numerator = 0.0d;
    private double denominator = 0.0d;

    public double getNumerator() {
        return numerator;
    }

    public void setNumerator() {
        System.out.print("Введите числитель: ");
        this.numerator = sc.nextDouble();
    }

    public double getDenominator() {
        return denominator;
    }

    public void setDenominator() {
        System.out.println("Введите знаменатель: ");
        this.denominator = sc.nextDouble();
    }


}
