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
        for (int num : this.list){
            freq[num]++;
        }

        int k = 0;
        for (int digit = 0; digit <= 9; digit++) {
            for(int count = 1; count <= freq[digit]; count++){
                this.list.set(k++,digit);
            }
        }
        return this.list;
    }

    public List<Integer> sortByMax() {
        int max = Integer.MIN_VALUE;
        for(int num : this.list){
            if(max < num){
                max = num;
            }
        }

        int[] freq = new int[max + 1];
        for(int num : this.list){
            freq[num]++;
        }

        int mk = 0;
        for (int digit = 0; digit < max + 1; digit++) {
            for (int count = 0; count < freq[digit]; count++) {
                this.list.set(mk++,digit);
            }
        }
        return this.list;
    }

    public List<Integer> negativeSort() {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int num: this.list){
            if(max < num){
                max = num;
            }
            if(min > num){
                min = num;
            }
        }
        //-2,0,5,-7,1,2,3,3
        //5 + -7
        int[] freq = new int[max - min  + 1];

        for(int num: this.list){
            freq[num - min]++;
        }

        int k = 0;
        for (int digit = 0; digit < max - min  + 1; digit++) {
            for (int count = 1; count <= freq[digit]; count++) {
                this.list.set(k++,digit + min);
            }
        }
        return this.list;
    }
}
