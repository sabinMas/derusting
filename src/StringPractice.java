import java.util.ArrayList;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String word = "example";

    // Find the length of the string
    System.out.println("length: " + word.length());
    // Concatenate (add) two strings together and reassign the result
    word = word +  "abc";

    // Find the value of the character at index 3
    System.out.println("Char at index 3: " + word.charAt(3));
    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    System.out.println(word.contains("abc"));

    // Iterate over the characters of the string, printing each one on a separate line
    System.out.println("Characters:");
      for (int i = 0; i < word.length(); i++) {
      System.out.println(word.charAt(i));
    }
    // Create an ArrayList of Strings and assign it to a variable
    ArrayList<String> list = new ArrayList<String>();

    // Add multiple strings to the List (OK to do one-by-one)
    list.add("mason");
    list.add("milo");
    list.add("mystic");

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String joined = String.join(",",list);
    System.out.println(joined);

    // Check whether two strings are equal
    String string1 = "howdy";
    String string2 = "howdy";
    System.out.println(string1.equals(string2));

    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
