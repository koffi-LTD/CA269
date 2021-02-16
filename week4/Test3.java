public class Test3{
	public static double getPassingAverage(Student[] student){
		//initialise passing grade to 40.
		int pass = 40;
		//Total number of students that passed.
		int num_pass = 0;
		//Total their grades.
		double total_grade = 0;
		// double average;
		for (int i = 0;i < student.length; i++) {
			if (student[i].getMark() >= pass) {
				total_grade += student[i].getMark();
				num_pass++;
			}	
		}
		double average = total_grade/num_pass;
		return average;
	}
}