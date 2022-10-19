package Teachjava.src;

public class task5 {
    public static void main(String[] args) {
        final int r = 10;
        // Площадь круга S=3.14 * (r*r)
        double pi = 3.14;
        System.out.println("Радиус окружности: " + r);
        int r1 = r;
        int r2 = 2;

        double s = pi * (Math.pow(r1, r2));
        System.out.println("Площадь круга");
        System.out.println(s);

        double c = 2 * pi * r1;
        System.out.println("Длина окружности");
        System.out.println(c);


    }
}
