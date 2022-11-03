


public class MainClassCalc {
    public static void main(String[] args) {
        Calc calculator = new Calc();
        System.out.println("Сложение");
        System.out.println(calculator.plus(5.0, 7.0));
        System.out.println("Вычитание");
        System.out.println(calculator.minus(5.0, 7.0));
        System.out.println("Умножение");
        System.out.println(calculator.multiply(5.0, 7.0));
        System.out.println("Деление");
        System.out.println(calculator.divide(5.0, 7.0));

    }
}
