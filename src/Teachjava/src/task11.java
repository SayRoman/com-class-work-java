package Teachjava.src;

public class task11 {
    public static void main(String[] args) {

        int a = 5555;
        int m;
        double sec;
        double q = 0.0166667;
        int d = a / 86400;
        int h = a / 3600;
        int m1 = a / 60;
        if (m1 < 60) {
            m = m1;
        } else {
            m = (m1 - 60);
            h++;
        }

        double sec1 = a * q;
        if (sec1 < 60) {
            sec = sec1;
        } else {sec = (sec1 - 60);
        m++;}


        System.out.println(d + " дней " + h + " час(ов) " + m + "минут " + sec + " секунд");
    }
}
