import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
// This prgram reads a file from a CLA.
public class ReadNames{
	public static void main(String[] args){
		if (args.length == 0) {
			System.out.println("Usage: java ReadNames <filename>");
			
		}
		else {
			Scanner in = null;
			try{
				in = new Scanner(new File(args[0]));
				int totalName = in.nextInt();
				String [] names = new String[totalName];
				// Read the names into an array.
				for (int i=0; i < totalName; i++) {
					names[i] = in.next();
				}
				System.out.println("The names in reverse order are:");
				// display the names in reverse order.
				for (int i = totalName -1; i >= 0; i--) {
					System.out.print(names[i] + " ");
				}

			}
			// catch error
			catch(FileNotFoundException e){
				System.out.print("File does not exist");
			}
			//close the file.
			finally{
				in.close();
			}
		}
	}

}