public class Test
{
    // Create a static method called countEven which returns the number of even numbers in the array
    public static int countEven(int[] arr){
    	int num_of_even = 0;  // Variablr to store num_of_even.

    	for (int i=0; i<arr.length; i++) {
    		if (arr[i] % 2 == 0) {
    			num_of_even+= 1;
    		}
    	}
    	return num_of_even;
    }
}