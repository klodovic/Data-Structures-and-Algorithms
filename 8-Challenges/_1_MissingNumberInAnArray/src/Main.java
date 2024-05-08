public class Main {
    public static void main(String[] args) {

        //find missing number with time complexity O(n)
        //2,4,1,8,6,3,7

        int[] intArray = {2, 4, 1, 8, 6, 3, 7};
        System.out.println("Missing number is: " + missingNumber(intArray));

    }

    private static int missingNumber(int[] intArray) {
        int n = intArray.length + 1;
        int sum = n * (n+1)/2;

        for (int num: intArray){
            sum = sum - num;
        }
        return sum;
    }


}