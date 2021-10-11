import java.util.Arrays;
public class Honours
{
	// Add a static print method to this class.
	public static void print(Student[] group){
		for (int i=0;i < group.length ; i++) {
			if (group[i].getMark() >= 55) {
				
				System.out.println(group[i].getMark() + " (" + group[i].getName() + ")");
			}
		}
	}
   public static void main(String [] args)
	{
	  Student [] group = {
			   new Student("John", 50),
			   new Student("Abby", 40),
			   new Student("Dylan", 20),
			   new Student("Carl", 70),
			   new Student("Maeve", 70),
			   new Student("Chris", 46),
			   new Student("James", 55),
			   new Student("Anne", 63),
			};

	  Honours.print(group);
	}
	
}