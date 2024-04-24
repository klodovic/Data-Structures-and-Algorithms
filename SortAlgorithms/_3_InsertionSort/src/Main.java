public class Main {
    public static void main(String[] args) {

        /*Insertion sort:
         *       time complexity = quadratic
         *       stable algorithm
         *       it will take 100 steps to sort 10 items, 10000 steps to sort 100 items and so on....
         * */

        int[] intArray = {20, 35, -15, 7, 55, 1, -22, 300, 1520, -9547};

        for (int firstSortedIndex = 1; firstSortedIndex < intArray.length; firstSortedIndex++) {
            int newElement = intArray[firstSortedIndex];
            int i;

            for (i = firstSortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
        }

        //Print sorted array
        for (int j : intArray) {
            System.out.println(j);
        }
    }
}