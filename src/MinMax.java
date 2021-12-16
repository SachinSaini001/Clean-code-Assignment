/**
 * This is the min max main class
 */
public final class MinMax {
    //Declared a private constructor
    private MinMax() {
    }

    static class C {
        /**
         * Declaring a  Minimum Number
         */
        private int min_no;
        /**
         * Declaring a Maximum Number
         */
        private int max_no;
    }

    static C findMinMax(final int[] arr, final int n) {
        //Creating an object of class C to call the function of max and min number
        C c = new C();
        int i;
        if (n == 1) {
            c.max_no = arr[0];
            c.min_no = arr[0];
            return c;
        }
        //Comparing the array for finding the minimum number
        if (arr[0] > arr[1]) {
            c.max_no = arr[0];
            c.min_no = arr[1];
        } else {
            //Finding the maximum number
            c.max_no = arr[1];
            c.min_no = arr[0];
        }
        for (i = 2; i < n; i++) {
            if (arr[i] > c.max_no) {
                c.max_no = arr[i];
            } else if (arr[i] < c.min_no) {
                c.min_no = arr[i];
            }
        }
        return c;
    }

    /**
     * @param args It is the method argument
     */
    public static void main(final String[] args) {
        //Declaring the array and which has different number
        final int[] arr = {1000, 11, 445, 1, 330, 3000};
        int s = arr.length;//Declaring the length of an array
        C c = findMinMax(arr, s);//Calling for the element
        System.out.printf("The minimum number is %d", c.min_no);//Printing the minimum number
        System.out.printf("\nThe maximum number is %d", c.max_no);//Printing the maximum number
    }
}
