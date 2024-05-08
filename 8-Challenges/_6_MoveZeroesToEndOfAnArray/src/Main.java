public class Main {
    public static void main(String[] args) {

        int[] intArray = {0, 2, 0, 7, 10, 6, 5, 12};
        //OutPut: 2, 7, 10, 6, 5, 12, 0, 0,

        for (int j : intArray) {
            System.out.print(j + ", ");
        }

        int[] zeros = moveZeros(intArray);
        System.out.println();
        for (int zero : zeros) {
            System.out.print(zero + ", ");
        }

    }

    private static int[] moveZeros(int[] intArray) {
        //j and i are pointers
        int j = 0;
        for (int i = 0; i < intArray.length; i++){
            if (intArray[i] != 0 && intArray[j] == 0){
                //if both conditions are true -> swap
                int temp = intArray[i];
                intArray[i] = intArray[j];
                intArray[j] = temp;
            }
            if (intArray[j] != 0){
                j++;
            }
        }
        return intArray;
    }
}