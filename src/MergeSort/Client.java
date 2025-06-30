package MergeSort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Integer> A = List.of(2,4,9);
        List<Integer> B = List.of(3,11,19);

        TwoSortedArray twoSortedArray = new TwoSortedArray(A,B);
        System.out.println("Sort Merge Array " + twoSortedArray.merge());

        List<Integer> list = Arrays.asList(4,9,11,2,19,16);
        MergeSortAlgo mergeSortAlgo = new MergeSortAlgo(list);
        List<Integer> result = mergeSortAlgo.merge();
        System.out.println("Merge Sort " + result);
    }
}
