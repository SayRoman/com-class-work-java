package list.task1;

import java.util.ArrayList;
import java.util.List;

public class MainArrayList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        ShowArray showArray = new ShowArray();

        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add(null);
        list.add("Third");

        showArray.showArray(list);

        list.add(2, "Add");
        System.out.println();

        showArray.showArray(list);




    }
}
