import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Take user inouts.
        System.out.print("Enter a number: ");
        //read inputs
        int a = in.nextInt();
        if (a % 2 == 0) {

            System.out.println(a+ " is even.");
        }
        else {
            System.out.println(a + " is odd.");

        }

        // System.out.println("The product is " + result);
    }
}