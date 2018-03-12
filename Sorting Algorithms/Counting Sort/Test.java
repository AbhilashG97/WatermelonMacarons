class Test {

    public static void main(String[] args) {
        CountingSort countingSort = new CountingSort();
        // Input 1
        countingSort.sort(generateArray(100), 101);
        // Input 2
        countingSort.sort(generateArray(10000), 101);
        // Input 3
        countingSort.sort(generateArray(1000000), 101);
    }

    public static int[] generateArray(int size){
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = (int)(Math.random()* 101);
        }
        return arr;
    }

}