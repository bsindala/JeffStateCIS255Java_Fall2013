/**
   This program compares the contents of two int arrays.
*/

public class CompareArrays
{
   public static void main(String[] args)
   {
      int[] firstArray = { 2, 4, 6, 8, 10 };
      int[] secondArray = { 2, 4, 6, 8, 10 };

      // Flag variable; assume arrays are equal until proven otherwise.
      boolean arraysEqual = true;
      int index = 0;  // Loop control variable; start at first element.

      // First determine whether the arrays are the same size.
      if (firstArray.length != secondArray.length)
         arraysEqual = false;

      // Next determine whether the elements contain the same data.
      // The loop terminates once the program knows either that the
      // arrays contents are not equal or that all elements have been
      // compared.
      while ((arraysEqual) && (index < firstArray.length))
      {
         // Determine if the elements at the same position are not equal.
         if (firstArray[index] != secondArray[index])
            arraysEqual = false;

         // Proceed to the next element.
         index++;
      }

      // The flag variable indicates whether or not the arrays are equal.
      if (arraysEqual)
         System.out.println("The arrays are equal.");
      else
         System.out.println("The arrays are not equal.");
   }
}