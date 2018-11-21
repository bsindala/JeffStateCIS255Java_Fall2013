import java.util.Scanner;   // Needed for Scanner class
import java.io.*;           // Needed for File I/O classes

/**
   This program allows the user to enter up to 100 values
   in an array.  It then displays the values entered by
   the user.
*/

public class FileArray
{
   public static void main(String[] args) throws IOException
   {
      // The array will contain 5 elements, but not all
      // of the elements are guaranteed to be used.
      final int ARRAY_SIZE = 5;
      int numbers[] = new int[ARRAY_SIZE];

      // count indicates both the number of elements used
      // thus far and the subscript of the next available
      // element.
      int count = 0;

      // Attempt to open the file, terminating if the file
      // cannot be opened.
      File file = new File("Values.txt");
      if (!file.exists())
      {
         System.out.println("ERROR!  Cannot open file.");
         System.exit(0);
      }
      Scanner inputFile = new Scanner(file);

      // The loop terminates either when the end of the file
      // has been reached or when the array is full.
      while ((inputFile.hasNext()) && (count < numbers.length))
      {
         // Store the next value from the file in the next
         // available array element.
         numbers[count] = inputFile.nextInt();

         // Increment the number of elements used.
         count++;
      }

      System.out.print("These are the values read from the file: ");

      // Loop through the elements actually used, displaying
      // these values in the console separated by spaces.
      for (int index = 0; index < count; index++)
      {
         System.out.print(numbers[index] + " ");
      }

      // End the line of output in the console.
      System.out.println();
   }
}