public class QuickSort {
    
    private int[] tmpArray;

    public QuickSort(int[] arr){
        tmpArray = arr;
    }

    public int[] getTmpArray(){
        return tmpArray;
    }

    public void sort(int[] arr, int low, int high){
        
        if(low < high){
            int pi = partition(arr, low, high);
            sort(arr, low, pi-1); //Before
            sort(arr, pi+1, high); // After
        }
    }

    public int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int pIndex = low;

        for(int i = low; i<high-1; i++){
            if(arr[pIndex] <= pivot){
                // Swap the two elemenst
                int tmp = arr[pIndex];
                arr[pIndex] = arr[i];
                arr[i] = tmp;
                pIndex++;
            }
        }

        int tmp = arr[pIndex];
        arr[pIndex] = arr[high];
        arr[high] = tmp;

        return pIndex;
    }

    public void displaySortedArray(){
        System.out.println("\nSorted array is ->");
        for(Integer k : getTmpArray()){
            System.out.print(k+" ");
        }
        System.out.println();
    }
}