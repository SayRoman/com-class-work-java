import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

public class Task5 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку с клавиатры: ");
        String str = sc.nextLine();

        String[] arrayWorld = str.split(" ");
        int count = 0;
        for (int i = 0; i < arrayWorld.length; i++) {
            if (arrayWorld[i].length() % 2 == 0) {
                count++;
            }
        }
        System.out.println("Количество слов в строке, у которых четное количество букв: ");
        System.out.print(count);

    }
}
