import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task3 {

    public void changeIndex(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 || i == 0) {
                array[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Task3 obj = new Task3();
        ShowAray obj1 = new ShowAray();
        Scanner s = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int number = s.nextInt();



        int[] array = new int[number];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.floor(Math.random() * 10);

        }

        obj1.showArray(array);
        System.out.println();
        obj.changeIndex(array);
        obj1.showArray(array);
    }
}

