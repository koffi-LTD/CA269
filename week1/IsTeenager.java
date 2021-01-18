import java.util.Scanner;
public class IsTeenager{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Take user inouts.
        System.out.print("Enter your age: ");
        //read inputs
        int age = in.nextInt();
        int teen = 13;
        if (age >= teen && age < 20){

            System.out.println("You are a teenager.");
        }
        else {
            System.out.println("You are not a teenager.");

        }

        // System.out.println("The product is " + result);
    }
}