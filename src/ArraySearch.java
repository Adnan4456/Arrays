import java.util.Arrays;
import java.util.List;

public class ArraySearch {

    public static void main(String[] args) {

        //set up some data we want  to compare
        String[] firstString = {"abc","def","ghi","jkl","mno" , "pqr" ,
                            "stu","vwx","yz"};
        String[] firstStringUnsortedDuplicate = {"yz","def","mno","jkl","stu" , "pqr"
                ,"vwx","ghi", "jkl", "abc"};

        String[] partialFirstString = {"abc","def","ghi","jkl","mno"};

        //Create List from array to test List search methods
        List firstList = List.of(firstString);
        List secondList = Arrays.asList(firstStringUnsortedDuplicate);

        System.out.println("------------------Arrays binarySearch--------------");
        //binary search on array , look for "jkl"  which is in array
        String searchString = "jkl";
        System.out.println("Arrays.binarySearch (firstString, \"jkl\") = "
                            + Arrays.binarySearch(firstString,searchString));//return index number of matched element

        //binary search , look for "aaa" which is not in array
        System.out.println("Arrays.binarySearch(firstString, \"aaa\") = "
                            + Arrays.binarySearch(firstString,"aaa"));// it returns -1 , if no element matches

        //binary search , look for "jkl" which are two elements in  unsorted array
        //it will return any index of matched element.
        System.out.println("Arrays.binarySearch (firstStringUnSorted, \"jkl\") = "
                + Arrays.binarySearch(firstStringUnsortedDuplicate,searchString));

        //binary search unsorted array . for "abc " which is in array
        System.out.println("Arrays.binarySearch(firstUnsortedArray , \"abc\") = "
                            +Arrays.binarySearch(firstStringUnsortedDuplicate,"abc"));

                //Arrays. mismatch method

        System.out.println("--------------------Arrays mismatch--------------------------");
        System.out.println("Arrays.mismatch(first , partialFirstString) = " +
                Arrays.mismatch(firstString,partialFirstString));

        //Try another example
        System.out.println("Arrays.mismatch(firstUnsortedDuplicate , new String[] {\"jkl\",\"mno\"})=" +
                Arrays.mismatch(firstStringUnsortedDuplicate,new String[]{"jkl","mno"}));

        System.out.println("\n-------------- List methods  -------------------");

        // Does array contain "def"?
        System.out.println("firstList.contains(\"def\") =  "
                + firstList.contains("def"));
        //Compare string array first unsorted
        System.out.println("firstList.contains(FirstUnsortedString Array) = " +
                firstList.contains(firstStringUnsortedDuplicate)); //but answere is false because it compare one

        //Compare with firstString array
        System.out.println("firstList.contains(FirstString Array) = " +
                firstList.contains(firstString));//but answere is false because it compare one

        // Does array contain elements in partialString?
        System.out.println("firstList.containsAll(Arrays.asList(partialFirstString)) =  "
                + firstList.containsAll(Arrays.asList(partialFirstString)));

        // create a second list not in same order
        String[] anotherUnsortedSet = {"jkl", "def", "abc", "ghi", "mno"};
        System.out.println("firstList.containsAll(Arrays.asList(anotherUnsortedSet)) =  "
                + firstList.containsAll(Arrays.asList(anotherUnsortedSet)));

        // Use indexOf to get first matching element
        System.out.println("secondList.indexOf(\"jkl\") =  "
                + secondList.indexOf("jkl"));

        // Use lastIndexOf to to get last matching element
        System.out.println("secondList.lastIndexOf(\"jkl\") =  "
                + secondList.lastIndexOf("jkl"));

        //sort method in java for arrays
        Arrays.sort(anotherUnsortedSet);
        System.out.println("Sorted Array = " + Arrays.toString(anotherUnsortedSet));

    }
}
