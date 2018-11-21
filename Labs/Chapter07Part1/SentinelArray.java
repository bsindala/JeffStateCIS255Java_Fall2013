import java.util.Scanner;   // Needed for Scanner class

/**
   This program allows the user to enter up to 100 values
   in an array.  It then displays the values entered by
   the user.
*/

public class SentinelArray
{
   public static void main(String[] args)
   {
      // The array will contain 100 elements, but not all
      // of the elements are guaranteed to be used.
      final int ARRAY_SIZE = 100;
      int array[] = new int[ARRAY_SIZE];

      // count indicates both the number of elements used
      // thus far and the subscript of the next available
      // element.
      int count = 0;

      // A temporary variable to hold the input before it
      // is either copied to the array or recognized as the
      // sentinel value.
      int number;

      Scanner keyboard = new Scanner(System.in);

      // A priming input for the sentinel-controlled loop.
      System.out.print("Enter a number or -1 to quit: ");
      number = keyboard.nextInt();

      // The loop terminates either when the user enters the
      // sentinel value or when the array is full.
      while ((number != -1) && (count < array.length))
      {
         // Copy the value entered by the user to the next
         // available array element.
         array[count] = number;

         // Increment the number of elements used.
         count++;

         // Obtaining additional input from the user.
         System.out.print("Enter a number or -1 to quit: ");
         number = keyboard.nextInt();
      }

      System.out.print("These are the values you entered: ");

      // Loop through the elements actually used, displaying
      // these values in the console separated by spaces.
      for (int index = 0; index < count; index++)
      {
         System.out.print(array[index] + " ");
      }

      // End the line of output in the console.
      System.out.println();
   }
}