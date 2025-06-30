package MergeSort;

import java.util.ArrayList;
import java.util.List;

public class TwoSortedArray {
    List<Integer> A = new ArrayList<>();
    List<Integer> B = new ArrayList<>();

    TwoSortedArray(List<Integer> A, List<Integer> B){
       this.A = A;
       this.B = B;
    }

    public List<Integer> merge(){
        int n = this.A.size();
        int m = this.B.size();

        List<Integer> mergedList = new ArrayList<>();

        int i=0;
        int j=0;
        while(i < n && j < m){
            if(this.A.get(i) < this.B.get(j)){
                mergedList.add(this.A.get(i++));
            }else{
                mergedList.add(this.B.get(j++));
            }
        }
        while (j < m){
            mergedList.add(this.B.get(j++));
        }
        while (i < n){
            mergedList.add(this.A.get(i++));
        }
        return mergedList;
    }

}
