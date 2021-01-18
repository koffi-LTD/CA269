import java.util.Scanner;
public class Thrice{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Take user inouts.
        System.out.print("Enter three numbers: ");
        //read inputs
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        //compute result
        int result = a * b * c;
        System.out.println("The product is " + result);
    }
}