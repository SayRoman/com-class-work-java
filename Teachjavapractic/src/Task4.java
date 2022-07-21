import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Task4 obj = new Task4();
        ShowAray obj1 = new ShowAray();
        Scanner s = new Scanner(System.in);
        System.out.print("Введите длину массива 1: ");
        int number = s.nextInt();
        System.out.print("Введите длину массива 2: ");
        int number1 = s.nextInt();

        int[] array = new int[number];
        int[] array2 = new int[number1];
        obj.fillArray(array);
        obj.fillArray(array2);


        obj1.showArray(array);
        System.out.println();
        obj1.showArray(array2);

        int firstResult = obj.arithmetic(array);
        int secondResult = obj.arithmetic(array2);
        System.out.println();

        obj.message(firstResult, secondResult);
    }

    public void message (int firstRes, int secondRes) {
        if (firstRes > secondRes) {
            System.out.println("First");
            return;

        } else if (firstRes < secondRes) {
            System.out.println("Second");
            return;
        }
        System.out.println("Equal");

    }

    public int arithmetic(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        int arithmetic = sum / array.length;
        return  arithmetic;
    }

    public int[] fillArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.floor(Math.random() * 5);
        }
        return array;
    }
}
