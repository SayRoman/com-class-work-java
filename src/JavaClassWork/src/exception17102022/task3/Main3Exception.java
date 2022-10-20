package exception17102022.task3;

import java.util.Arrays;

public class Main3Exception {


    public static void main(String[] args) {
        Main3Exception task3 = new Main3Exception();
        int[] array1 = {7, 10, 42, 456, 424, 45};
        int[] array2 = {0, 12, 15, 45};
        int[] array3 = null;
        int[] array4 = null;

        task3.exceptionInArrays1(array1, 5, 3, array2, 3, 0);
        task3.exceptionInArrays2(array1, 1, 8, array2, 0, 1);
        task3.exceptionInArrays3(array3, 0, 0, array4, 0, 0);

    }

    public void exceptionInArrays1(int[] a, int aFromIndex, int aToIndex,
                                   int[] b, int bFromIndex, int bToIndex) {
        try {
            Arrays.compare(a, aFromIndex, aToIndex, b, bFromIndex, bToIndex);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException  " + e.getMessage());
        }
    }

    public void exceptionInArrays2(int[] a, int aFromIndex, int aToIndex,
                                   int[] b, int bFromIndex, int bToIndex) {
        try {
            Arrays.compare(a, aFromIndex, aToIndex, b, bFromIndex, bToIndex);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException  " + e.getMessage());
        }

    }

    public void exceptionInArrays3(int[] a, int aFromIndex, int aToIndex,
                                   int[] b, int bFromIndex, int bToIndex) {
        try {
            Arrays.compare(a, aFromIndex, aToIndex, b, bFromIndex, bToIndex);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException  " + e.getMessage());
        }

    }
}
