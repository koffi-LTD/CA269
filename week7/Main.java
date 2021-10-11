// public class Main
// {
// 	public static void main(String []args)
// 	{
// 		Parent parent = new Child2();
// 		System.out.println("parent.makeATwo() is " + parent.makeATwo());
// 	}
// }
public class Main
{
    public static void main(String [] args)
    {
        Animal cat = new Cat("Angel");
        Animal dog = new Dog("Fido");
        System.out.println(cat.greeting());
        System.out.println(dog.greeting());
    }
}
