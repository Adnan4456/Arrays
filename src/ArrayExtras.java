import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayExtras {

    public static void main(String[] args) {

        int a =0;
        int b= 0;

        //You can assign an int variable to a long
        long myLong = a;
        System.out.println("myLong = " +myLong);

        //And you can do this
        long[] longArray = {0,1,2,3,4};
        System.out.println("longArray = " + Arrays.toString(longArray));

        //And this
        long[] myLongArray = new long[2];
        myLongArray[0] = a;
        myLongArray[1] = b;

        System.out.println("myLongArray = " + Arrays.toString(myLongArray));

        //And you know you can do this . Java autoboxes
        //autoBoxing . java convert primitive data type to object class;
        //unboxing.java convert object to primitive data type.

        Integer aInteger = a;
        Integer bInteger = b;
        System.out.println("aInteger = " + aInteger);

        Integer[] integerArray  = {0,1,2,3,4};

        System.out.println("integerArray = " + Arrays.toString(integerArray));

        Integer[] myIntegerArray = new Integer[2];
        //You can mix and match Integer , int here
        myIntegerArray[0] = aInteger;
        myIntegerArray[1] = b;
        System.out.println("myInteger Array = " + Arrays.toString(myIntegerArray));

        //error
        //Long[] newLongArray = new int[2];
//        Integer[] newIntegerArray = new int[20];

        //because arrays static methods will not accept two arrays of
        //different type.even if their types are normally widened.
        int[] intArray = {0,1,2,3,4};
       // int misMatched = Arrays.mismatch(intArray , integerArray);
//        boolean same = Arrays.equals(intArray , integerArray);
       // int compare  =Arrays.compare(intArray, integerArray);

        System.out.println("/n-------Test methods with common super class-----");

        Number[] numberArray =  {0,1,2,3,4};
        System.out.println("Arrays.misMatch(numberArray, integerArray)= "
        +Arrays.mismatch(numberArray,integerArray));
        System.out.println("Arrays.equals(numberArray, integerArray)= "
        +Arrays.equals(numberArray,integerArray));

        //error. because java.lang.Number class doesnot implement comparable.
        //Therefore, it is giving error.
//        int compare = Arrays.compare(numberArray,integerArray);

    }
}
