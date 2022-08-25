import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        System.out.print("Введите  индекс символа: ");
        int index = sc.nextInt();

        for (int i = 1; i <= 1000; i++) {
            if (str.length() >= 1000) {
                break;
            } else {
                str = str + i;
            }
        }
        System.out.println(str.charAt(index));


    }

}

