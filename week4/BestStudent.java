public class BestStudent{
    //Print the number of students that passed.
  public static int getBestStudent(Student[] student){
    // int pass = 40;
    int best_s = 0;
    for (int i =0;i < student.length ; i++) {
        if (student[i].getMark() > best_s){
            best_s = student[i].getMark();
        }  
    }
    return best_s;
  }
}