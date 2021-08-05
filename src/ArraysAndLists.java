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
//        List subList = firstList.subList(0,5);
        System.out.println("subList = " + subList.toString());

        //Sort the subList
        subList.sort(Collections.reverseOrder());
        System.out.println("subList after reverse = " +subList.toString());

        System.out.println("firstString array = " + Arrays.toString(firstString));
        System.out.println("firstList = " + firstList.toString());
    }
}
