
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку текста: ");
        String str = sc.nextLine();
        System.out.print("Введите  один символ: ");
        String simbol = sc.next();

        char _char = simbol.charAt(0);
        char[] arrayChar = str.toCharArray();
        int count = 0;

        for (int i = 0; i < arrayChar.length; i++) {
            if (arrayChar[i] == _char) {
                count++;
            }
        }
        System.out.println("Количество совпадений: " + count);
        if (count == 0) {
            System.out.println("Совпадений нет");
        }
    }
}

