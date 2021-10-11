import java.util.*;
import java.util.Scanner;
class Isbn{
	// ISBN number checker


	static boolean check10(String input){
		//keep track of sum
		int total = 0;
		int intNum, dNum, t;
		if (input.length() != 10) {
			return false;

		}

		for (int i=0; i < input.length(); i++) {
			intNum = Integer.parseInt(input.substring(i, i+1));
			dNum = i+1;
			t = intNum*dNum;
			total+=t;

		}
		if (total%11 ==0) {
			return true;
			
		}
		return false;
	}
	//Driver
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an ISBN number: ");
		String output = in.nextLine();
		// Parse the input
		String parse = output.replace(" ", "");
		System.out.println("You have entered: " + parse);

		// res = check10(parse);
	
		if (check10(parse)) {
			System.out.println("Number entered is VALID");
		
		}
		else{
			System.out.println("Number entered is INVALID");
		}



	}
}