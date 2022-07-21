public class Task2 {
    public static void main(String[] args) {

        System.out.println("Массив ");

        int array[] = new int[12];
        int max = array[0];
        int index = 0;


        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.floor(Math.random() * 31) - 15;
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println("\n\nСамое максимальное число " + max + "\nи индекс его последнего вхождения " + index);
    }
}
