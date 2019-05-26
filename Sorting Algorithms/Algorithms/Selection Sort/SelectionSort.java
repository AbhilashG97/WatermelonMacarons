import java.util.concurrent.TimeUnit;

public class SelectionSort {

    private int minIndex;

    public void setMinIndex(int minIndex){
        this.minIndex = minIndex;
    }

    public int getMinIndex(){
        return minIndex;
    }

    public int[] sort(int arr[]){
        final long start = System.nanoTime();
        for(int i=0; i<arr.length-1; i++){
            setMinIndex(i);
            for(int j=i+1; j<arr.length; j++){
                if(arr[getMinIndex()]>arr[j]){
                    int tmp = arr[getMinIndex()];
                    arr[getMinIndex()] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        final long end = System.nanoTime();
        System.out.println("Running time is -> "+TimeUnit.MILLISECONDS.toSeconds(end-start)+" seconds");
        return arr;
    }

    public void displayArray(int array[]){
        System.out.println("Array after sorting ->");
        for(Integer k : array){
            System.out.print(k+" ");
        }
        System.out.println();
    }
}