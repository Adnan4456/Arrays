import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayFirstExample {

    public static void main(String[] args) {

    //    int[] a , []b; // Compile error

        //Create two arrays one of integer and second of int

        //elements initialize to null
        Integer [] integerArray = new Integer[5];

        //elements initialized to 0
        int [] intArray  = new int[5];

        //Arrays.toString prints elements as comma delimited String.

        System.out.println("-----------Defaults Values -------------");

        System.out.println("intArray = " + Arrays.toString(intArray));
        System.out.println("Integer = "+ Arrays.toString(integerArray));

         //Loop condition uses length attribute of one of the arrays.

        for (int i =0; i< intArray.length; i++)
        {
            //Set data on arrays
            integerArray[i] = intArray[i] = (i+1);

        }

        System.out.println("\n ------------Values after the Loop ---------------");

        System.out.println("intArray = " + Arrays.toString(intArray));
        System.out.println("Integer = "+ Arrays.toString(integerArray));

        //Creates new int [] variable reference and assign it intArray
        int []  intArray2 = intArray;

        //Creates new integer [] variable reference and assign it integerArray
        Integer[] integerArray2 = integerArray;

        System.out.println("\n ------------Final Values -----------------");

        System.out.println("intArray "  + Arrays.toString(intArray));
        System.out.println("intArray2 "  + Arrays.toString(intArray2));
        System.out.println("integerArray "  + Arrays.toString(integerArray));
        System.out.println("integerArray2 "  + Arrays.toString(integerArray2));

        System.out.println("\n ------------Arrays references -----------------");

        System.out.println("intArray = " + intArray);
        System.out.println("intArray2 = " + intArray2);
        System.out.println("integerArray = " + integerArray);
        System.out.println("integerArray2 = " + integerArray2);
    }
}
