package list.task2;

import java.util.List;

public class SumArray {

    int sum = 0;

    void sumArray(List<Integer> list) {
        for (Integer i : list) {
            try {
                sum += i;
            } catch (NullPointerException e) {
                System.out.println("Нет возможности произвести расчеты. Значение не может быть Null");
            }

        }
    }
}



