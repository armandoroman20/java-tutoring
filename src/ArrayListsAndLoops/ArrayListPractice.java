package ArrayListsAndLoops;

import java.util.ArrayList;

public class ArrayListPractice {
    // empty so far []
    private static ArrayList<String> colors = new ArrayList<>();

    public static void main(String[] args) {
        // .add is a method to put new elements into the ArrayList
        colors.add("green");
        // ["green"]

        // Anything added will be put at the end of the ArrayList
        colors.add("blue");
        //["green", "blue"

        // ArrayLists let us add to the list at specific indexes
        // If I want to add red in between green and blue I add an int to specify what index I want to add the new element
        // The .add method is overloaded so if you use 2 parameters you use the version that adds to a specific index
        // You pass an integer first for the index you want to put the element
        // You pass what you want to add to the ArrayList as the second argument
        // We put 1 as the index point. Blue is currently at index 1.
        // Since we said that red goes at index 1 then red goes to index 1 and blue is moved to the next index
        colors.add(1, "red");
        // ["green", "red", "blue"]
    }
}
