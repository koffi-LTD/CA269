public class Test2
{
    // Create a static method called countFives which returns the number of fives in the array
    public static int countFives(int [] array){
    	int count = 0;
    	for (int i=0; i<array.length; i++) {
    		if (array[i] == 5){
    			count+=1;
    		}
    	}
    	return count;
    }
//     public static void main(String[] args) {
//     	int [] num = {2, 3, 5, 7, 11, 13, 17, 5, 0, -5, 5};
//    		// Call the method to count the fives
//    		int result = Test2.countFives(num);
//     }
}