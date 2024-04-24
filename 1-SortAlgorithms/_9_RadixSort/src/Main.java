public class Main {
    public static void main(String[] args) {

        /*Radix sort:
         *       makes assumptions about the data
         *       data must have same radix and width and data must be integers or strings
         *       start at the rightmost position
         *       time complexity: O(n) - linear
         *       stable sort
         *       counting sort is often used as the sort algorithm for radix sort
         * */

        int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};

        radixSort(radixArray, 10, 4);

        for (int j : radixArray) {
            System.out.println(j);
        }
    }

    public static void radixSort(int[] input, int radix, int width){
        for (int i=0; i < width; i++){
            radixSingleSort(input, i, radix);
        }

    }

    private static void radixSingleSort(int[] input, int position, int radix) {
        int numItems = input.length;
        int[] countArray = new int[radix];

        for (int value: input){
            countArray[getDigit(position, value, radix)]++;
        }

        //adjust the count array
        for (int j=1; j < radix; j++){
            countArray[j] += countArray[j-1];
        }

        //new array to store sorted values
        int[] temp = new int[numItems];
        for (int tempIndex = numItems -1; tempIndex>=0; tempIndex--){
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
        }

        for (int tempIndex = 0; tempIndex < numItems; tempIndex++){
            input[tempIndex] = temp[tempIndex];
        }
    }

    private static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % radix;
    }
}