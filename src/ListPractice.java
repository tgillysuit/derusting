import java.util.ArrayList;

public class ListPractice {


  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    ArrayList<String> List = new ArrayList<String>();

    // Add 3 elements to the list (OK to do one-by-one)
    List.add("Milk");
    List.add("Eggs");
    List.add("Bread");

    // Print the element at index 1
    System.out.println(List.get(1));

    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    List.set(1, "Bananas");

    // Insert a new element at index 0 (the length of the list will change)
    List.add(0, "Apples");

    // Check whether the list contains a certain string
    boolean containsMilk = List.contains("Milk");
    System.out.println("Contains Milk: " + containsMilk);

    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line
    for (int i = 0; i < List.size(); i++) {
      System.out.println(i + " " + List.get(i));
    };
    // Sort the list using the Collections library
    java.util.Collections.sort(List);

    // Iterate over the list using a for-each loop
    // Print each value on a second line
    for (String s : List) {
      System.out.println(s);
    };

    /*
     * Usage tip!
     * 
     * Use a traditional for-loop when you need to use the index or you need to iterate in an
     * unconventional order (e.g. backwards)
     * 
     * Otherwise, if you're iterating the in the conventional order and don't need the
     * index values a for-each loop is cleaner.
     */
  }
}