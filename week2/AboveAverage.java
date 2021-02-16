//
// Supplied code to help ensure there will be no output formatting issues.
//
import java.util.Scanner;

public class AboveAverage
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many numbers: ");
        int num = in.nextInt();
        
        // Create an array
        double[] myList = new double [num];
        
        System.out.print("Enter " + num + " numbers: ");

        // Now read in the numbers

        for (int idx=0; idx < num; idx++) {
            // append the numbers into the array
            myList[idx] = in.nextDouble();
        }
        double sum = 0;
        for (int i=0; i < myList.length; i++){
            //get the sum of the array.
            sum += myList[i];
        }
        double average = sum/ num;  //get the average of the array.
        // System.out.println(average);
        for (int i = 0; i < myList.length; i++){
            if (myList[i] > average)
            {
                //Output the above average.
                System.out.print(" " + myList[i]);
            }
        }
        // Print out the numbers greater than the average
        // System.out.println("The above average numbers are:");
        // You can use the following code to print out one number
        // System.out.print(" " + numbers[i]); // You may want to put this in a loop.

        System.out.println(); // Should finish with a new line
    }
}