import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ListDataManipulation {

    public static void main(String[] args) {

        //Set up some test data for use in our tests
        String[] primaryColor = {"red","blue","Yellow"};
       //String[] secondaryColor = {"green","orange","purple"};

        System.out.println("--------------Manipulating array data using a List, "
                        + "backed by an array");

        //The Arrays.asList returns a List backed by the array.
        List<String> colorList = Arrays.asList(primaryColor);
        System.out.println("colorList: "+colorList.toString());

        //Use a method to get an element in the array.
        String firstColor = colorList.get(0);
        System.out.println("firstColor is : "+firstColor);

        //Sort the array via List reference
        //it will also change in array primaryColor
        colorList.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println("\n Color List after sort: " + colorList.toString());

        System.out.println("primary colors "
                        +Arrays.toString(primaryColor));

        //Set the value of an array element using set method.
        colorList.set(0 , "cyan");
        System.out.println("\ncolorList after changing 1st value : "
                    + colorList.toString());

        //print array to see value is changed
        System.out.println("primaryColors" + Arrays.toString(primaryColor));

        //Use replaceAll method to change all values in the array via
        //List reference
        colorList.replaceAll((s) -> s+"ish");
        System.out.println("\ncolorList after replacing all values :"
            +colorList.toString());
        System.out.println("primaryColors "+Arrays.toString(primaryColor));

        //what happened when we change uderlying array ?
        primaryColor[0] = "blueish";
        System.out.println("\ncolorList after array changed:"+colorList.toString());
        System.out.println("primaryColor after array changed:"+ Arrays.toString(primaryColor));

        System.out.println("\n-------List.of and List.copyOf Examples--------");

        //List.of method can take an array and make it a list.
        List secondList = List.of(primaryColor);

        //List.copyOf  method takes a list and make another list.
        List thirdList = List.copyOf(Arrays.asList(primaryColor));

        System.out.println("\n S econdColorList : " + secondList.toString());
        System.out.println("\n ThirdColorList : " + thirdList.toString());

        //Change value on orignal array.
        primaryColor[0] = "blue";

        System.out.println("\nprimaryColors after making first element blue :"
                +Arrays.toString(primaryColor));

        System.out.println("secondColorList after array changed :"
                +secondList.toString());

        System.out.println("thirdColorList after array changed :"
                +thirdList.toString());




    }
}
