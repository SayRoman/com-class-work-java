package list.task3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainHashSet {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet();
        ShowArray showArray = new ShowArray();

        set.add(1);
        set.add(45);
        set.add(12);
        set.add(120);
        set.add(null);
        showArray.showArray(set);
        System.out.println();

        set.add(50);
        showArray.showArray(set);

    }
}
