import java.util.Random;

public class Test {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        // 1st input
        selectionSort.sort(generateArray(100));
        // 2nd input
        selectionSort.sort(generateArray(10000));
        // 3rd input
        selectionSort.sort(generateArray(1000000));
    }

    public static int[] generateArray(int size){
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = (int)(Math.random()* 101);
        }
        return arr;
    }
}
