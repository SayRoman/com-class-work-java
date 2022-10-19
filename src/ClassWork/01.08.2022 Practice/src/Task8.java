import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Task8 obj = new Task8();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите индентификатор переменной: ");
        String string = sc.nextLine();
        obj.convertingToC_Plus_Plus(string);


        char[] arrayChar = string.toCharArray();
        System.out.println("Это язык " + obj.defineProgrammingLanguage(arrayChar));

        System.out.println(obj.convertingToC_Plus_Plus(string));
    }

    public String defineProgrammingLanguage(char[] array) {
        String language = "";
        for (int i = 0; i < array.length; i++) {
            char c = array[i];

            if (Character.isUpperCase(c)) {
                language = "Java";
                break;
            } else if (c == '_') {
                language = "C++";
                break;
            }
        }
        return language;
    }

    public String convertingToC_Plus_Plus(String s) {
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {

            if (Character.isUpperCase(array[i])) {
        s = s.replaceAll(String.valueOf(array[i]), "_" + Character.toLowerCase(array[i]));
            }


        }return s;
    }

    public void showArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
