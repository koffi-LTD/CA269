import java.util.Scanner;
public class SumIt{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Take user inouts.
		System.out.print("Enter two numbers: ");
		//read inputs
		int a = in.nextInt();
		int b = in.nextInt();
		//compute result
		int result = a + b;
		System.out.println(a + " and " + b +" is " + result);
	}
}