public class Main {
	public static void main(String[] args) {
		Food[] refrigirator = new Food[3];

		Food food1 = Food("pizza");
		Food food2 = Food("ham");
		Food food3 = Food("pasta");

		refrigirator[0] = food1;

		System.out.println(refrigirator[0].name);

	}
}