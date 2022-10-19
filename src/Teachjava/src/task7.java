package Teachjava.src;

public class task7 {
    public static void main(String[] args) {

        final int a = 10;
        System.out.println("Годовой процент в банке:" + a + "%");

        int vklad = 100;
        System.out.println("Депозит на год_0:" + vklad);
        int year = 365;
        int _2years = year * 2;
        double vklad2goda = (vklad * a * _2years) / 100;

        System.out.println("Сумма вклада через 2 года: " + vklad2goda);

    }
}
