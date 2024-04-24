public class Main {
    public static void main(String[] args) {

        /*Bubble sort:
         *       time complexity = quadratic
         *       stable algorithm
         *       it will take 100 steps to sort 10 items, 10000 steps to sort 100 items and so on....
         *       algorithm degrades quickly
         * */

        int[] intArray = {20, 35, -15, 7, 55, 1, -22, 300, 1520, -9547};
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for(int i=0; i<lastUnsortedIndex; i++){
                if(intArray[i] > intArray[i+1]){
                    swap(intArray, i, i+1);
                }
            }
        }

        //Print sorted array
        for (int j : intArray) {
            System.out.println(j);
        }
    }


    public static void swap(int[] array, int i, int j){

        if (i == j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}