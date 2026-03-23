public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] myArray = new String[4];

    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    myArray[0] = "Mason";
    myArray[1] = "Mackenzie";
    myArray[2] = "Mystic";
    myArray[3] = "Milo";
    //line break print message
    System.out.println("----------------------------");
    // Get the value of the array at index 2
    System.out.println(myArray[2]);
      //line break print message
    System.out.println("----------------------------");
    // Get the length of the array
    System.out.println(myArray.length);

    //line break print message
    System.out.println("----------------------------");
    // Iterate over the array using a traditional for loop and print out each item
    for (int i = 0; i < myArray.length; i++){
      System.out.println(myArray[i]);
    }
    // Iterate over the array using a for-each loop and print out each item
    //line break print message
    System.out.println("----------------------------");
    for (String i : myArray){
      System.out.println(i);
    }
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
