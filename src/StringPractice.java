import java.util.ArrayList;
import java.util.List;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String hello = "Hello, World!";

    // Find the length of the string
    hello.length();

    // Concatenate (add) two strings together and reassign the result
    String goodbye = hello + " Goodbye!";

    // Find the value of the character at index 3
    char charAtIndex3 = goodbye.charAt(3);

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    boolean containsWorld = goodbye.contains("World");
    System.out.println("Does the string contain 'World'? " + containsWorld);

    // Iterate over the characters of the string, printing each one on a separate line
    for (int i = 0; i < goodbye.length(); i++) {
      System.out.println(goodbye.charAt(i));
    };

    // Create an ArrayList of Strings and assign it to a variable
    ArrayList<String> list = new ArrayList<String>();

    // Add multiple strings to the List (OK to do one-by-one)
    list.add("Welcome");
    list.add("to");
    list.add("Green River");

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String joined = String.join(", ", list);
    System.out.println(joined);

    // Check whether two strings are equal
    boolean isEqual = "Hello".equals("Hello");
    System.out.println(isEqual);

    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
