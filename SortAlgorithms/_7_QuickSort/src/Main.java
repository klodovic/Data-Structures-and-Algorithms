public class Main {
    public static void main(String[] args) {

        /*Quick sort:
         *       divide and conquer algorithm
         *       recursive algorithm
         *       uses a pivot element to partition the array into two parts
         *       don't need a large amount of memory to sort array, no need for temporary arrays
         *       unstable algorithm
         *       time complexity: O(nlog n) - base2, in worst case its quadratic
         *       but most of the time it performs better than merge sort
         * */


        int[] intArray = {20, 35, -15, 7, 55, 1, -22, 300, 1520, -9547};

        quickSort(intArray, 0, intArray.length);

        for (int j : intArray) {
            System.out.println(j);
        }
    }

    public static void quickSort(int[] input, int start, int end){

        //if end - start is less than two we are dealing with a one element array
        if (end - start < 2){
            return;
        }

        //index of the pivot
        int pivotIndex = partition(input, start, end);

        //left partition
        quickSort(input, start, pivotIndex);

        //right partition
        quickSort(input, pivotIndex + 1, end);

    }

    private static int partition(int[] input, int start, int end) {
        //this is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i<j){
            while (i < j && input[--j] >= pivot);
            if (i<j){
                input[i] = input[j];
            }

            while (i<j && input[++i] <= pivot);
            if (i<j){
                input[j] = input[i];
            }
        }

        input[j] = pivot;
        return j;
    }

}