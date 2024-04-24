public class Main {
    public static void main(String[] args) {

        /*Shell sort:
         *       - The method starts by sorting pairs of elements far apart from each other,
         *        then progressively reducing the gap between elements to be compared until gap value is equal to 1
         *       - Time complexity = difficulty to nail down the time complexity because it will depend on the gap
         *       - Worst case: quadratic, but it can perform much better than that
         *       - Unstable algorithm
         *       - Doesn't require as much shifting as Insertion sort, so it usually performs better
         *       - More: https://en.wikipedia.org/wiki/Shellsort
         * */

        int[] intArray = {20, 35, -15, 7, 55, 1, -22, 300, 1520, -9547};

        for (int gap = intArray.length/2; gap>0; gap/=2){
            for (int i = gap; i< intArray.length; i++){

                int newElement = intArray[i];
                int j = i;

                while (j >= gap && intArray[j-gap] > newElement){
                    intArray[j] = intArray[j-gap];
                    j -= gap;
                }

                intArray[j] = newElement;
            }
        }


        //Print sorted array
        for (int j : intArray) {
            System.out.println(j);
        }
    }
}