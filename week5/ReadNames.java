import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadNames{
	public static void main(String[] args) throws FileNotFoundException{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the file name: ");
		//arg[0] is the file
		String file_name = in.nextLine();
		in = new Scanner( new File(file_name));
		int numName = in.nextInt();
		String[] names = new String[numName];
		// Store names in an array
		for (int i=0; i < numName; i++) {
			names[i] = in.next();
		}

		//read in reverse
		System.out.println("The names in reverse order are:");
		for (int i = numName-1; i >= 0; i--) {
			System.out.print(names[i]+ " ");
		}

	}
}