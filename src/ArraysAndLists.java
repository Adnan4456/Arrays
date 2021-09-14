import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysAndLists {

    public static void main(String[] args) {

        String[] firstString = {"abc", "def" , "ghi", "jkl","mno"
                                ,"pqr","stu","vwx","yz"};

        List firstList = List.copyOf(Arrays.asList(firstString));
        List secondList = List.of(firstList);

        //Both these method will return immutable list objects
        System.out.println("firstList = " + firstList.toString());
        System.out.println("SecondList = " + secondList.toString());

        Object o = firstList.get(0);
        System.out.println(o.getClass().getName());

        o = secondList.get(0);
        System.out.println(o.getClass().getName());


        System.out.println("\n---------subList Example--------");
        List subList = Arrays.asList(firstString).subList(0,5);

        //  error. because we are getting immutable list and sort their elements .
        //List subList = firstList.subList(0,5);
        System.out.println("subList = " + subList.toString());

        //Sort the subList
        subList.sort(Collections.reverseOrder());
        System.out.println("subList after reverse = " +subList.toString());

        System.out.println("firstString array = " + Arrays.toString(firstString));
        System.out.println("firstList = " + firstList.toString());

        //Now look at toArray method
        System.out.println("/n-----------toArray example-------------");
        int arrayLength = firstList.size();//array length changes result.
       // int arrayLength = 5;

        //set up a new array which we will pass to toArray.
        String[] aArray = new String[arrayLength];

        //Calling toArray without assigning returned array to a variable.
        firstList.toArray(aArray);
        System.out.println("aArray array = "+ Arrays.toString(aArray));

        //Set up another new array  which we will pass to toArray
        String[] bArray = new String[arrayLength];

        //Calling toArray assigning returned array to a variable.
        String[] nextArray = (String[]) firstList.toArray(bArray);

        System.out.println("bArray array = " + Arrays.toString(bArray));
        System.out.println("nextArray = "+ Arrays.toString(nextArray));
        System.out.println("nextArray.equals(bArray) = "
                    +nextArray.equals(bArray));

        //
        System.out.println("/n---------Final toArray examples-------");
        //if you always want to an array that represents the elements
        //exact in the list, you can pass a 0 length array.

        String[] arrayRepresentation = (String[]) firstList.toArray(new String[0]);

        System.out.println("arrayRepresentation array = "+ Arrays.toString(arrayRepresentation));

        //You can call toArray with no parameter , it returns an array of Object.
        Object[] objectArray = firstList.toArray();
        System.out.println("objectArray array = " +Arrays.toString(objectArray));
    }
}
