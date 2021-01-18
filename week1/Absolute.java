import java.util.Scanner;
public class Absolute{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Take user inouts.
        System.out.print("Enter a number: ");
        //read inputs
        int a = in.nextInt();
        if (a < 0) {
            a = a * -1;

            System.out.println("The absolute value is " + a);
        }
        else {
            System.out.println("The absolute value is " + a);

        }

        // System.out.println("The product is " + result);
    }
}