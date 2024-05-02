public class Main {
    public static void main(String[] args) {

        //Data must be sorted!!!
        //if value is equal to the value, we're done
        //if element id greater than the value, search the left half of the array and vice versa

        int[] intArray = {-22, -15, 1, 7, 20, 35, 55};

        System.out.println(iterativeBinarySearch(intArray, 20));
        System.out.println(iterativeBinarySearch(intArray, -1));
        System.out.println(iterativeBinarySearch(intArray, 35));
        System.out.println(iterativeBinarySearch(intArray, 88));

        //recursive
        System.out.println("Recursive");
        System.out.println("Index: " + recursiveSearch(intArray, -22));

    }


    public static int iterativeBinarySearch(int[] input, int value){
        int start = 0;
        int end = input.length;

        while (start < end){
            int midpoint = (start + end)/2;
            //System.out.println("Midpoint = " + midpoint);
            if (input[midpoint] == value){
                return midpoint;
            }
            else if (input[midpoint] < value){
                start = midpoint + 1;
            }
            else {
                end = midpoint;
            }
        }
        return -1;
    }


    //Most expensive
    public static int recursiveSearch(int[] input, int value){
        return recursiveSearch(input, 0, input.length, value);
    }

    private static int recursiveSearch(int[] input, int start, int end, int value) {
        if (start >= end){
            return -1;
        }
        int midpoint = (start + end) /2;
        //System.out.println("Midpoint = " + midpoint);

        if (input[midpoint] == value){
            return midpoint;
        }
        else if (input[midpoint] < value){
            return recursiveSearch(input, midpoint +1, end, value);
        }
        else {
            return recursiveSearch(input, start, midpoint, value);
        }
    }
}