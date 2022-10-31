package list.task2;

import java.util.LinkedList;
import java.util.List;

public class MainLinkedList {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        ShowArray showArray = new ShowArray();
        SumArray sumArray = new SumArray();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(null);

        showArray.showArray(list);
        System.out.println();
        System.out.println();

        list.add(3, 0);

        showArray.showArray(list);
        System.out.println();
        System.out.println();

        sumArray.sumArray(list);


    }
}
