import java.util.Random;

public class Test {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(generateArray(10));
    }

    public static int[] generateArray(int size){
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = (int)(Math.random()* 101);
        }
        System.out.println("\nGenerated Array is ->");
        for(Integer j : arr){
            System.out.print(j+" ");
        }
        System.out.println();
        return arr;
    }
}
