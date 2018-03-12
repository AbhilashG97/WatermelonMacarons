class Test {

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        // Input size 1
        insertionSort.sort(generateArray(100));
        // Input suze 2
        insertionSort.sort(generateArray(10000));
        // Input size 3
        insertionSort.sort(generateArray(1000000));    
    }

    // Generates an array of given size filled with 
    // randon integers between 0 and 100
    public static int[] generateArray(int size){
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = (int)(Math.random()* 101);
        }
        return arr;
    }
}