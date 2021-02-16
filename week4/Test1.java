public class Test1{
    //Print the number of students that passed.
  public static int numberPasses(Student[] student){
    int pass = 40;
    int num_pass = 0;
    for (int i =0;i < student.length ; i++) {
        if (student[i].getMark() >= pass){
            num_pass++;
        }  
    }
    return num_pass;
  }
}