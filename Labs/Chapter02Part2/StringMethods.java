// This program demonstrates a few of the String methods.

public class StringMethods
{
   public static void main(String[] args)
   {
      String message = "Java is Great Fun!";
      String upper = message.toUpperCase();
      String lower = message.toLowerCase();
      char letter = message.charAt(2);
      int stringSize = message.length();

      System.out.println("Original String: " + message);
      System.out.println("Uppercase version: " + upper);
      System.out.println("Lowercase version: " + lower);
      System.out.println("Character number 2: " + letter);
      System.out.println("String size: " + stringSize);
   }
}



