import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTransformation {

    public static void main(String[] args) {

        System.out.println("-------Using Arrays.copyOf method----------");

        //create an array of integer
        Integer[] originalArray = new Integer[10];

        //initialize values to 1 - 10
        Arrays.setAll(originalArray , (index)->index+1);
        System.out.println("integerArray values = "+ Arrays.toString(originalArray));

        //Create Copy of an array , same size
        Integer[] copiedArray = Arrays.copyOf(originalArray , originalArray.length);
        System.out.println("copiedArray values = " + Arrays.toString(copiedArray));

        //Create copy of an array , trimmed to specified size
        Integer[] trimmedArray = Arrays.copyOf(originalArray, 7);

        //Create array to larger array , extra elements get default values
        Integer[] widenedArray = Arrays.copyOf(originalArray , 15);

        System.out.println("trimmed Array values = " + Arrays.toString(trimmedArray));
        System.out.println("widened Array values = "+ Arrays.toString(widenedArray));

        //Create copy of defined portion of Array
        Integer[] croppedArray = Arrays.copyOfRange(originalArray, 2,6);
        System.out.println("croppedArray  values = "+ Arrays.toString(croppedArray));

        croppedArray[0]= 5;
        System.out.println("cropped Array values after change = " +Arrays.toString(croppedArray));
        widenedArray[0]= 5;
        System.out.println("widened Array values after change  = "+ Arrays.toString(widenedArray));
    }
}
