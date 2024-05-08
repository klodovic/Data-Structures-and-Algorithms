public class Main {
    public static void main(String[] args) {
        int[] intArray = {3, 2, 4, 7, 10, 6, 5, 1};

        System.out.println("Minimum value is: " + findMinimumValue(intArray));
    }

    private static int findMinimumValue(int[] intArray) {
        int min = intArray[0];
        for (int i = 1; i < intArray.length; i++){
            if (intArray[i] < min){
                min = intArray[i];
            }
        }
        return min;
    }
}