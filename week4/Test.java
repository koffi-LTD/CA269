public class Test
{
   public static void print(Student [] student)
   {	
   		int honour = 55;
      int forty = 40;
      	for(int i = 0; i < student.length; i++)
      	//To print the names
        // System.out.println(student[i].name);
     	//To print the marks
    	// System.out.println(student[i].mark);
    	// To print student name + grade.
    	// System.out.println(student[i].mark + " (" + student[i].name + ")");
    	// using getters
      	// System.out.println(student[i].getMark() + " (" + student[i].getName() + ")");
      	//Print the students with honour grade
    	// if (student[i].getMark() >= honour) {
    	// 	System.out.println(student[i].getMark() + " (" + student[i].getName() + ")");
      //To print marks in forty range.
      		if (40 <= student[i].getMark() && student[i].getMark() <= 49) {
            System.out.println(student[i].getMark() + " (" + student[i].getName() + ")");
    	}
   }
}