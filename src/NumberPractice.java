public class NumberPractice {
  public static void main(String args[]) {
    // Create a float with a negative value and assign it to a variable
    float negativeNumber = -2;
    // Create an int with a positive value and assign it to a variable
    int positiveNumber = 10;
    // Use the modulo % operator to find the remainder when the int is divided by 3
    int divisibleBy3 = positiveNumber % 3;
    System.out.println("remainder when divided by 3: " + divisibleBy3);
    // Use the modulo % operator to determine whether the number is even
    // (A number is even if it has a remainder of zero when divided by 2)
    // Use an if-else to print "Even" if the number is even and "Odd"
    // if the number is odd.
     if (positiveNumber % 2 == 0){
      System.out.println("EVEN");
    } else {
      System.out.println ("Odd");
    }

    // Divide the number by another number using integer division
    int result = positiveNumber / 2;
    System.out.println("Integer division result: " + result);
    System.out.println(negativeNumber);
    /*
     * Reminder!
     * 
     * When dividing ints, the result is rounded down.
     * Example: 
     * 7 / 3 = 2 when performing int division
     */

  }
}
