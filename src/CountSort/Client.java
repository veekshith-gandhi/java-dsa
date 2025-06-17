package CountSort;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Integer> list =  Arrays.asList(8,1,5,6,1,2,3,3);
        SortingByCount sorter = new SortingByCount(list);
        List<Integer> sorted = sorter.sort();
        System.out.println("Sorted: " + sorted);


        List<Integer> list1 =  Arrays.asList(8,308,5,122,1,2,3,3);
        SortingByCount sorter1 = new SortingByCount(list1);
        List<Integer> sortedMax = sorter1.sortByMax();
        System.out.println("Sorted-Max: " + sortedMax);

        List<Integer> list2 =  Arrays.asList(-2,0,5,-7,1,2,3,3);
        SortingByCount sorter2 = new SortingByCount(list2);
        List<Integer> sortedNegative = sorter2.negativeSort();
        System.out.println("Sorted-Negative: " + sortedNegative);
    }
}
