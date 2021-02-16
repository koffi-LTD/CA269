public class Test
{
    // Create a static method called getSum which sums an array of ints
    public static int getSum(int[] array){
    	int sum = 0;
    	for (int i=0;i < array.length; i++) {
    		sum+= array[i];
    	}
    	return sum;

    }
}