public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] animals = new String[4];

    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    animals[0] = "dog";
    animals[1] = "cat";
    animals[2] = "fish";
    animals[3] = "bird";

    // Get the value of the array at index 2
    System.out.println(animals[2]);

    // Get the length of the array
    System.out.println(animals.length);

    // Iterate over the array using a traditional for loop and print out each item
    for (int i = 0; i < animals.length; i++) {
      System.out.println(animals[i]);
    };

    // Iterate over the array using a for-each loop and print out each item
    for (String animal : animals) {
      System.out.println(animal);
    };

    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
