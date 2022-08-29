package by.step.class_work_part2.Task4;


public class Calc {

    private double x;
    private double y;

    public Calc(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Calc() {
    }

    private double plus(double x, double y) {
        return x + y;
    }

    private double minus(double x, double y) {
        return x - y;
    }

    private double multiply(double x, double y) {
        return x * y;
    }

    private double divide(double x, double y) {
        return x / y;
    }


    private double plus() {
        return x + y;
    }

    private double minus() {
        return x - y;
    }

    private double multiply() {
        return x * y;
    }

    private double divide() {
        return x / y;
    }
}
