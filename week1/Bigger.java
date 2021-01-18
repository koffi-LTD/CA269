import java.util.Scanner;
public class Bigger{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Take user inouts.
        System.out.print("Enter two numbers: ");
        //read inputs
        int a = in.nextInt();
        int b = in.nextInt();

        if (a < b){

            System.out.println(a+ " is the biggest.");
        }
        else {
            System.out.println(b + " is the biggest.");

        }

        // System.out.println("The product is " + result);
    }
}