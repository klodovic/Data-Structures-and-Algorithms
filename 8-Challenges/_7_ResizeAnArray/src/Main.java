public class Main {
    public static void main(String[] args) {

        int[] intArray = {2, 7, 10, 6};
        System.out.println("Original array has: " + intArray.length + " elements");

        int[] resized = resize(intArray);
        System.out.println("Resized array has: " + resized.length + " elements");

        for (int item: resized){
            System.out.print(item + ", ");
        }

        int[] resized2 = resize(resized);
        System.out.println();
        System.out.println("Resized2 array has: " + resized2.length + " elements");

        for (int item: resized2){
            System.out.print(item + ", ");
        }
    }

    private static int[] resize(int[] intArray) {
        int[] temp = new int[intArray.length * 2];
        for (int i = 0; i < intArray.length; i++){
            temp[i] = intArray[i];
        }
        return temp;
    }
}