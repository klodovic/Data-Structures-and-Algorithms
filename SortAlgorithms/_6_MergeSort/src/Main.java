public class Main {
    public static void main(String[] args) {

        /*Merge sort:
         *       recursive algorithm
         *       two phases: splitting anf merging
         *       splitting phase leads to faster sorting during the merge process
         *       stable algorithm
         *       time complexity: O(nlog n) - base2
         *       amount of needed memory is going to grow because of temporary array instances
         * */


        int[] intArray = {20, 35, -15, 7, 55, 1, -22, 300, 1520, -9547};

        mergeSort(intArray, 0, intArray.length);

        for (int j : intArray) {
            System.out.println(j);
        }
    }

    public static void mergeSort(int[] input, int start, int end){

        //break the recursion
        if (end - start < 2){
            return;
        }

        int mid = (start + end) / 2;

        //left partition
        mergeSort(input, start, mid);

        //right partition
        mergeSort(input, mid, end);

        //merging partition
        merge(input, start, mid, end);


    }

    private static void merge(int[] input, int start, int mid, int end) {

        //[mid - 1] = last element in left partition, and [mid] is the first element in the right partition
        if (input[mid - 1] <= input[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end){
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        //remaining element from the left partition change its own position
        // {32, 36}, {33, 34}
        // {32, 33, 34, "36"}
        // if remaining element is from the left partition we must handle it
        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);

    }


}