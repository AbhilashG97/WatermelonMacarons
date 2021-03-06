import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        long start = 0, end = 0;
        
        // Input 1
        start = System.nanoTime();
        mergeSort.sort(generateArray(100), 0, 99);
        end = System.nanoTime();
        System.out.println("Running time is -> "+TimeUnit.MILLISECONDS.toSeconds(end-start)+" seconds");
        // Input 2
        start = System.nanoTime();
        mergeSort.sort(generateArray(10000), 0, 9999);
        end = System.nanoTime();
        System.out.println("Running time is -> "+TimeUnit.MILLISECONDS.toSeconds(end-start)+" seconds");
        // Inpupt 3
        start = System.nanoTime();
        mergeSort.sort(generateArray(1000000), 0, 999999);
        end = System.nanoTime();
        System.out.println("Running time is -> "+TimeUnit.MILLISECONDS.toSeconds(end-start)+" seconds");
    }

    public static int[] generateArray(int size){
        int array[] = new int[size];
        for(int i=0; i<size; i++){
            array[i] = (int)(Math.random()* 101);
        }
        return array;
    }
}