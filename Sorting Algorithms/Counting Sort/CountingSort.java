import java.util.Arrays;

public class CountingSort {

    public int[] sort(int[] arr, int range){

        int output[] = new int[arr.length];
        int count[] = new int[range];

        Arrays.fill(count, 0);

        for(int i=0; i<arr.length; ++i){
            ++count[arr[i]];
        }

        for(int i=1; i<range; ++i){
            count[i]+=count[i-1];
        }

        for(int i=0; i<arr.length; ++i){
            output[count[arr[i]-1]] = arr[i];
            --count[arr[i]];
        }

        System.out.println("\nSorted array is ->");
        for(Integer k : output){
            System.out.print(k+" ");
        }

        System.out.println();
        return output;
    }
}