import java.io.FileNotFoundException;
import  java.util.Scanner;
import java.io.File;

public class GroupStudents
{
    public static void main(String [] args)
    {
    	if (args.length == 0) {
    		System.out.println("enter a file");
    	}
    	else {
    		Scanner in = null;
    		try{
    			in = new Scanner(new File(args[0]));
    			int num = in.nextInt();
    			Student [] group = new Student[num];
    			for (int i=0; i < num; i++) {
    				String name = in.next();
    				int mark = in.nextInt();
    				group[i] = new Student(name, mark);
    			}
    			Student.print(group);

    		}
    		catch(FileNotFoundException e){
    			System.out.println("File does not exist.");
    		}
    	}
    }
}
