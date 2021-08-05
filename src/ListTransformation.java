import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTransformation {

    public static void main(String[] args) {

        Integer[] integerArray = new Integer[10];

        //Set values to 1- 10
        Arrays.setAll(integerArray, (index)-> index+1);

        System.out.println("integerArray values = " + Arrays.toString(integerArray));

        List anotherList = List.of(integerArray);

        //Create a subList of a List
        List shortList = anotherList.subList(3,7);
        System.out.println("Short List values = "+ shortList);

        //And now go from List to array ...
        Integer[] repeatedArray = new Integer[10];

        anotherList.toArray(repeatedArray);

        System.out.println("Array created from toArray method : "
            +Arrays.toString(repeatedArray));

        System.out.println("---------- iterator tests --------------");
        //Iterator allows forward processing of list elements
        System.out.println("loop through anotherList.iterator() values... ");
        for (Iterator it= anotherList.iterator(); it.hasNext();){

            System.out.println(it.next());
        }

        //ListIterator allows backwards and forwards processing
        //of List elements
        System.out.println("\n loop through anotherList.listIterator() values...");
        ListIterator lit = anotherList.listIterator();

        for (int i =0; lit.hasNext(); i++)
        {
            System.out.println(lit.next());
            if (i == 4)
            {
                System.out.println(" reverse direction");
                for (; lit.hasPrevious(); ){
                    System.out.println(lit.previous());
                }
                break;
            }
        }
    }
}
