import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class ArrayDataManipulation {

    public static void main(String[] args) {

        System.out.println("--- Manipulating data with Arrays static methods");

        String []s= {"d","a","f"};

        // Create array of Integer
        Integer[] intArray = new Integer[10];
        System.out.println("Array values initially: "
                + Arrays.toString(intArray));

        // Fill array with a single value
        Arrays.fill(intArray, 5);
        System.out.println("Array values after fill: "
                + Arrays.toString(intArray));


        // You can fill a partial range with Arrays.fill overloaded method
        int partialFillValue = 9;
        Arrays.fill(intArray, 5, 10, partialFillValue);
        System.out.println("Array values after partial fill: "
                + Arrays.toString(intArray));

        // setAll was introduced in Java 8
        // It uses lambda expressions, but demonstrates sample here
        Arrays.setAll(intArray, (index) -> index + 1);
        System.out.println("Array values after setAll: "
                + Arrays.toString(intArray));

        // You can sort non primitive data type arrays in reverse this way
        Arrays.sort(intArray, Collections.reverseOrder());
        System.out.println("Array values after reverse sort: "
                + Arrays.toString(intArray));

        //replaceAll and replace method is not present in string array and integer array.


        //Sort array
        Arrays.sort(intArray);
        //String array
        Arrays.sort(s);
//        Arrays.sort(s,Collections.reverseOrder());

        System.out.println("Array values after sort: "
                + Arrays.toString(intArray));
        System.out.println("String Array values after sort: "
                + Arrays.toString(s));


        // Similar to setAll and parallelSetAll, except this method
        // supports binary operations.
        Arrays.parallelPrefix(intArray, (left, right) -> left + right);
        System.out.println("Array values after parallelPrefix: "
                + Arrays.toString(intArray));

        // Performs addition with the adjacent element if first is less than
        // second else perform subtraction
        Arrays.parallelPrefix(intArray , (left ,right)->{
            if (left<right)
                return left+right;
            else
                return left-right;
        });
        System.out.println("Arrays after parallel Prefix if condition"
        +Arrays.toString(intArray));

        // Lets examine parallelPrefix(int[] array, int fromIndex, int toIndex,
        // IntBinaryOperator op)
        // It is used when we want to make changes in the specified range of
        // elements in an array

        int[] arr2 = { 1, 2, 4, 8, 5, 9, 6, 8, 9, 10, 11 };

        Arrays.parallelPrefix(arr2, 2, 8, (x, y) -> {
            if (x % 2 == 0 && y % 2 == 0)
                return x;
            else
                return y;
        });
        System.out.println("Array parallelPrefix with limited index "+Arrays.toString(arr2));
    }
}
