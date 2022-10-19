import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Task7 obj = new Task7();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите любую строку содержащую буквы верхнего и нижнего регистра, и цифры: ");
        String string = sc.nextLine();
        char[] arrayChar = string.toCharArray();
        obj.changeUpLittleToLowLittle(arrayChar);
        obj.changeDigitTo_(arrayChar);
        obj.showArray(arrayChar);

    }

    public void changeUpLittleToLowLittle(char[] array) {
        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            if (Character.isUpperCase(c)) {
                array[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                array[i] = Character.toUpperCase(c);

            }
        }
    }

    public void changeDigitTo_(char[] array) {
        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            if (Character.isDigit(c)) {
                array[i] = '_';
            }
        }
    }

    public void showArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
