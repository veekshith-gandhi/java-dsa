package MergeSort;

import java.util.ArrayList;
import java.util.List;

public class MergeSortAlgo {
    List<Integer> list = new ArrayList<>();

    MergeSortAlgo(List<Integer> list){
        this.list = list;
    }

    public void merging(List<Integer> list, int left, int mid, int right){
        //left ------ mid --------right
        System.out.println(list);
        int n1 = mid - left + 1;
        int n2 = right - mid;

        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();
        for (int i = 0; i < n1; i++) {
          leftArray.add(list.get(left + i));
        }
        for (int j = 0; j < n2; j++) {
            rightArray.add(list.get(mid + 1 + j));
        }

        int i=0;
        int j=0;
        int k = left;
        while (i < n1 && j < n2){
            if(leftArray.get(i) < rightArray.get(j)){
                list.set(k++,leftArray.get(i++));
            }else{
                list.set(k++,rightArray.get(j++));
            }
        }
        while (i < n1){
            list.set(k++,leftArray.get(i++));
        }
        while (j < n2){
            list.set(k++,rightArray.get(j++));
        }
    }

    public void mergeSort (List<Integer> list , int left, int right){
        if(left < right){
            int mid = (left + right)/ 2 ;
            mergeSort(list , left , mid);
            mergeSort(list, mid + 1 , right);
            merging(list,left,mid,right);
        }
    }

    public List<Integer> merge(){
         mergeSort(this.list,0, list.size() - 1);
         return this.list;
    }
}
