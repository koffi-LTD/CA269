import java.util.Scanner;
public class NextYear{
	public static void main(String[] args) {
		//Get name.
		Scanner in = new Scanner(System.in);
		System.out.println("What is your name: ");
		String name = in.next();
		//Get age.
		in = new Scanner(System.in);
		System.out.println("What age are you: ");
		int age = in.nextInt();
		//compute age next year.
		int result = age + 1;
		System.out.println("Hello "+ name + ", next year you will be " + result);


	}
}