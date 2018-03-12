import java.util.concurrent.TimeUnit;

public class InsertionSort {

    public void sort(int array[]){
        final long start = System.nanoTime();
        for (int i=1; i<array.length; ++i) {
            int key = array[i];
            int j = i-1;

            while (j>=0 && array[j] > key) {
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = key;
        }
        final long end = System.nanoTime();
        System.out.println("Running time is -> "+TimeUnit.MILLISECONDS.toSeconds(end-start)+" seconds");
    }

    public void displayArray(int array[]) {
        System.out.println("The sorted array is ->");
        for(Integer i : array) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}