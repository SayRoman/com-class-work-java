public class Task6 {
    public static void main(String[] args) {
        Task6 obj = new Task6();
        String[] array = new String[100000];
        obj.arrayNumber0_9(array);
        obj.arrayNumber10_99(array);
        obj.arrayNumber100_999(array);
        obj.arrayNumber1000_9999(array);
        obj.arrayNumber10000_99999(array);
        //obj.showArray(array);
        System.out.println("Всего придется исключить: " + obj.countExceptionOfNumber(array) + " номеров!");
        //System.out.print(obj.countExceptionOfNumber(array));

    }

    public int countExceptionOfNumber(String[] array) {
        int count = 0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i].contains("4") || array[i].contains("13")) {
                count++;
            }

        }
        return count;
    }

    public void arrayNumber0_9(String[] array) {
        for (int i = 0; i <= 9; i++) {
            array[i] = "00000" + i;
        }
    }

    public void arrayNumber10_99(String[] array) {
        for (int i = 10; i <= 99; i++) {
            array[i] = "0000" + i;
        }
    }

    public void arrayNumber100_999(String[] array) {
        for (int i = 100; i <= 999; i++) {
            array[i] = "000" + i;
        }
    }

    public void arrayNumber1000_9999(String[] array) {
        for (int i = 1000; i <= 9999; i++) {
            array[i] = "00" + i;
        }
    }

    public void arrayNumber10000_99999(String[] array) {
        for (int i = 10000; i <= 99999; i++) {
            array[i] = "" + i;
        }
    }

    public void showArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
