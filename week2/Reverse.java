import java.util.Scanner;

public class Reverse
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers: ");
        int num = in.nextInt();
        
        // Read in the numbers
        int[] arr = new int [num];  // array to stor inputs
        System.out.print("Enter " + num + " numbers: ");
        for (int i=0; i < arr.length; i++) {
        	arr[i] = in.nextInt();
        }
        // reverse the numbers
        System.out.print("The numbers reversed are:");
        for (int j=arr.length -1; j >= 0; j--) {
        	System.out.print(" " + arr[j]);
        }
        // print them out
        System.out.println();
    }
}