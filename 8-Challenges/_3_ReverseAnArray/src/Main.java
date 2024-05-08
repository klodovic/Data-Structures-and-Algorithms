public class Main {
    public static void main(String[] args) {
        int[] intArray = {3, 2, 4, 7, 10, 6, 5};
        //Output: 5, 6, 10, 7, 4, 2, 3

        //Print original array
        for (int i : intArray) {
            System.out.print(i + ", ");
        }

        int[] reverse = reverseArray(intArray, 0, intArray.length - 1);

        //Print reversed array
        System.out.println();
        for (int j : reverse) {
            System.out.print(j + ", ");
        }
    }

    private static int[] reverseArray(int[] intArray, int start, int end) {

        while (start < end){
            int temp = intArray[start];

            intArray[start] = intArray[end];
            intArray[end] = temp;
            start++;
            end--;
        }
        return intArray;
    }
}