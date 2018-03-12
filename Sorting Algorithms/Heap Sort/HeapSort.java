import java.util.concurrent.TimeUnit;

public class HeapSort {

    public void sort(int array[]){
        final long start = System.nanoTime();
        int size = array.length;
 
        for(int i = size / 2 - 1; i >= 0; i--) {
            heapify(array, size, i);
        }
            
        for (int i=size-1; i>=0; i--){
            
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
 
            heapify(array, i, 0);
        }
        final long end = System.nanoTime();
        System.out.println("Running time is -> "+TimeUnit.MILLISECONDS.toSeconds(end-start)+" seconds");
    }

    // Heapify 
    void heapify(int array[], int heapSize, int i) {
        int largest = i;  
        int l = 2*i + 1;  
        int r = 2*i + 2;  
 
        if (l < heapSize && array[l] > array[largest]) {
            largest = l;
        }

        if (r < heapSize && array[r] > array[largest]) {
            largest = r;
        }
 
        if (largest != i){
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;
 
            heapify(array, heapSize, largest);
        }
    }

    public void displayArray(int array[]){
        System.out.println("Array after sorting is ->");
        for(Integer i : array){
            System.out.print(i+" ");
        }
        System.out.println();
    }

}