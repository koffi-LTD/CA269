import java.util.Scanner;
public class Test1
{
    // Create a static void method called reverse which takes an array of ints
    public static void reverse(int [] arr){

        for(int i = 0, j= arr.length - 1; i < j; i++, j--){
        	int tmp = arr[i];
        	arr[i] = arr[j];
        	arr[j] = tmp;


        }

    }

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
            
        Test1.reverse(num);

        System.out.print("The numbers reversed are:");
        for(int i = 0; i < num.length; i++)
            System.out.print(" " + num[i]);
            
        System.out.println();
    }
}