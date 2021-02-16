import java.util.Scanner;

public class Test3
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many numbers: ");
        int len = in.nextInt();
        
        int [] num = new int[len];
        System.out.print("Enter " + len + " numbers: ");
        for(int i = 0; i < num.length; i++)
            num[i] = in.nextInt();
            
        Test3.reverse(num);

        System.out.print("The numbers reversed are:");
        for(int i = 0; i < num.length; i++)
            System.out.print(" " + num[i]);
            
        System.out.println();
    }
    public static int reverse(int[] arr){
        int size = arr.length;
        int[] rev_arr = new int[size];
        for (int j = size-1; j >= 0; j--) {
            rev_arr[] = arr[j];
            
        }
        return rev_arr;
    }
}