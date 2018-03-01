public class SelectionSort {

    private int minIndex;

    public void setMinIndex(int minIndex){
        this.minIndex = minIndex;
    }

    public int getMinIndex(){
        return minIndex;
    }

    public int[] sort(int arr[]){
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
        System.out.println("Array after sorting ->");
        for(Integer k : arr){
            System.out.print(k+" ");
        }
        System.out.println();
        return arr;
    }



}