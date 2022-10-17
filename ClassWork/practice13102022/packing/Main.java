package practice13102022.packing;

public class Main {



    public static void main(String[] args) {

        Number1 number1 = new Number1();
        Number2 number2 = new Number2();
        //NotNumber notNumber = new NotNumber();

        System.out.println(number1.i1 == number2.i2);
        System.out.println(number1.i1.equals(number2.i2));
        System.out.println(number1.i1.compareTo(number2.i2));
        //System.out.println(number2.i2.compareTo(notNumber.i3));
    }





}
