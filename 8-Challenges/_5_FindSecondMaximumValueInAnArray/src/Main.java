public class Main {
    public static void main(String[] args) {

        int[] intArray = {3, 2, 4, 7, 10, 6, 5, 10};
        //Output: 7

        System.out.println("Second Maximum value is: " + findSecondMax(intArray));

    }

    private static int findSecondMax(int[] intArray) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < intArray.length; i++){
            if (intArray[i] > max){
                secondMax = max;
                max = intArray[i];
            }
            else if (intArray[i] > secondMax && intArray[i] != max){
                secondMax = intArray[i];
            }
        }
        return secondMax;
    }
}