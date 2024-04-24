public class Main {
    public static void main(String[] args) {

        /*Counting sort:
         *       works with non-negative values (can't work with floats, strings)
         *       values must be within a specific range
         *       unstable algorithm, if we want the sort to bi stable we have to do some extra steps
         *       time complexity: O(n) - linear
         * */

        int[] intArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        countingSort(intArray, 1, 10);

        for (int j : intArray) {
            System.out.println(j);
        }

    }

    public static void countingSort(int[] input, int min, int max){
        int[] countArray = new int[(max - min) +1];

        for (int i = 0; i < input.length; i++){
            countArray[input[i] - min]++;
        }

        int j = 0;
        for (int i = min; i<= max; i++){
            while (countArray[i - min] > 0){
                input[j++] = i;
                countArray[i - min]--;
            }
        }
    }
}