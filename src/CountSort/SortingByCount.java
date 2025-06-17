package CountSort;

import java.util.List;

public class SortingByCount {

    List<Integer> list;
    SortingByCount(List<Integer> list){
        this.list = list;
    }

    public List<Integer> sort(){
        //Arrays.fill(freq, 1); if i want to fill 1 in all the index Because default 0 will be stored
        int[] freq = new int[10];
        for (int num : list){
            freq[num]++;
        }

        int k = 0;
        for (int digit = 0; digit <= 9; digit++) {
            for(int count = 1; count <= freq[digit]; count++){
                list.set(k++,digit);
            }
        }
        return list;
    }

    public List<Integer> sortByMax() {
        int max = Integer.MIN_VALUE;
        for(int num : list){
            if(max < num){
                max = num;
            }
        }

        int[] freq = new int[max + 1];
        for(int num : list){
            freq[num]++;
        }

        int mk = 0;
        for (int digit = 0; digit < max + 1; digit++) {
            for (int count = 0; count < freq[digit]; count++) {
                list.set(mk++,digit);
            }
        }
        return list;
    }

    public List<Integer> negativeSort() {
        return list;
    }
}
