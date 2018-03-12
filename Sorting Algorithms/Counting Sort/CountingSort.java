import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class CountingSort {

    public int[] sort(int[] arr, int range){
        final long start = System.nanoTime();
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

        final long end = System.nanoTime();
        System.out.println("Running time is -> "+TimeUnit.MILLISECONDS.toSeconds(end-start)+" seconds");

        return output;
    }

    public void displayArray(int array[]){
        System.out.println("\nSorted array is ->");
        for(Integer k : array){
            System.out.print(k+" ");
        }
        System.out.println();
    }
}