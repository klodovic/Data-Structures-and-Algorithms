public class Main {
    public static void main(String[] args) {
        int[] intArray = {3, 2, 4, 7, 10, 6, 5};
        //Output should be: 3,7,5

        //getting number of non even numbers
        int oddCount = 0;
        for (int i = 0; i < intArray.length; i++){
            if (intArray[i] % 2 != 0){
                oddCount++;
            }
        }

        //copping non even numbers into new array
        int[] result = new  int[oddCount];
        int index = 0;
        for (int i = 0; i < intArray.length; i++){
            if (intArray[i] % 2 !=0){
                result[index] = intArray[i];
                index++;
            }
        }

        //print new array with non even numbers
        for (int i = 0; i < result.length; i++){
            System.out.print(result[i] + ", ");
        }
    }
}