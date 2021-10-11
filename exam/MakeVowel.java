 import java.util.Scanner;

public class VowelNumber
{
   public static void main(String [] args)
   {
      System.out.print("Enter a word :");
      String word = new Scanner(System.in).next();
      
      String vowelNumber = "";
      int index = 0;
      while (index < word.length())
      {
          if (word.charAt(index) == 'a')
          {
              vowelNumber = vowelNumber + '1';
              
          }
          else if (word.charAt(index)=='e')
          {
              vowelNumber = vowelNumber + '2';
              
        
          }
          else if (word.charAt(index)=='i')
          {
              vowelNumber = vowelNumber + '3';
              
          }
          else if (word.charAt(index) == 'o')
          {
              vowelNumber = vowelNumber + '4';
              
          }
          else if (word.charAt(index) == 'u')
          {
              vowelNumber = vowelNumber + '5';   
        
          }
          else
          {
               vowelNumber = vowelNumber + word.charAt(index);
          }
          index++;
          
      }
      
      System.out.println("VowelNumbered is :" + vowelNumber + ":");
   }
}