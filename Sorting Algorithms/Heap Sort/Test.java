import java.util.Random;

public class Test {
    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort();
        // 1st input
        heapSort.sort(generateArray(100));
        // 2nd input
        heapSort.sort(generateArray(10000));
        // 3rd input
        heapSort.sort(generateArray(1000000));
    }

    public static int[] generateArray(int size){
        int array[] = new int[size];
        for(int i=0; i<size; i++){
            array[i] = (int)(Math.random()* 101);
        }
        return array;
    }
}
