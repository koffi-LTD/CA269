public class Example{
	public static void main(String[] args) {
		Student s1 = new Student("Luc", 40);
		Student s2 = new Student("John", 70);

		s1.increase(10);
		System.out.println(s1.name + ":" + s1.mark);
		System.out.println(s2.name + ":" + s2.mark);
		s2.increase(20);

	}
}