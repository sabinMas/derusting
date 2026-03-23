import java.util.ArrayList;
public class ListPractice {


  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    ArrayList<String> List = new ArrayList<String>();

    // Add 3 elements to the list (OK to do one-by-one)
    List.add("First Name");
    List.add("Last Name");
    List.add("Email");
    // Print the element at index 1
    System.out.println(List.get(1)); // this should appear as Last Name 
    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    List.set(1, "Sabin");
    System.out.println(List.get(1));
    // Insert a new element at index 0 (the length of the list will change)
    List.add(0,"No Name?");
    //test prints 
    System.out.println(List.get(0));
    System.out.println(List.size());

    // Check whether the list contains a certain string
    System.out.println("Contains 'Sabin'? " + List.contains("Sabin"));
    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line

    // Sort the list using the Collections library

    // Iterate over the list using a for-each loop
    // Print each value on a second line

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